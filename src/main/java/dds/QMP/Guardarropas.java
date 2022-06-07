package dds.QMP;

import dds.Exception.atuendoIncompletoException;
import dds.Exception.noSeEncuentraEnLaListaException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Guardarropas {
  List<Atuendo> atuendos;
  List<Propuesta> propuestas = new ArrayList<>();

  void Guardarropas(List<Atuendo> atuendos) {
    if (!atuendos.stream().allMatch(atuendo -> atuendo.atuendoListo())) {
      throw new atuendoIncompletoException("No se cargaron las prendas necesarias");
    }
    this.atuendos = atuendos;
  }

  void agregarPrenda(Prenda prenda, Atuendo atuendo) {
    atuendo.agregarPrenda(prenda);
  }

  void quitarPrenda(Prenda prenda, Atuendo atuendo) {
    atuendo.quitarPrenda(prenda);
  }

  List<Atuendo> obtenerAtuendos() {
    return atuendos;
  }

  void agregarAtuendos(List<Atuendo> atuendosAAgregar) {
    atuendos.addAll(atuendosAAgregar);
  }

  List<Propuesta> propuestasPendientes() {
    return propuestas.stream().filter(propuesta -> propuesta.getEstado() == EstadoPropuesta.PENDIENTE).collect(Collectors.toList());
  }
}
