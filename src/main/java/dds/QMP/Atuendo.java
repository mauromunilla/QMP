package dds.QMP;

import dds.Exception.CategoriaIncorrectaException;
import dds.Exception.noSeEncuentraEnLaListaException;

import java.util.ArrayList;
import java.util.List;

public class Atuendo {
  List<Prenda> prendas = new ArrayList<>();

  void agregarPrenda(Prenda prenda) {
    Categoria categoria = prenda.obtenerCategoria();
    validarCategoria(prenda, categoria, "La prenda no es de la categoría correcta");
    validarCategoriaNoRepetida(prenda, "La categoría ya forma parte del atuendo");
    prendas.add(prenda);
  }

  public void quitarPrenda(Prenda prenda) {
    if(!prendas.contains(prenda)) {
      throw new noSeEncuentraEnLaListaException("No se encuentra en la lista");
    }
    this.prendas.remove(prenda);
  }

  boolean atuendoListo() {
    return prendas.size() > 3;
  }

  boolean esCorrectoPara(int temperatura) {
    return prendas.stream().allMatch(prenda -> prenda.adecuadaParaTemperatura(temperatura));
  }

  void validarCategoria(Prenda prenda, Categoria categoria, String mensaje) {
    if (prenda.obtenerCategoria() == categoria) {
      throw new CategoriaIncorrectaException(mensaje);
    }
  }

  void validarCategoriaNoRepetida(Prenda prenda, String mensaje) {
    if (prendas.stream().anyMatch(unaPrenda -> unaPrenda.obtenerCategoria() == prenda.obtenerCategoria())) {
      throw new CategoriaIncorrectaException(mensaje);
    }
  }
}

