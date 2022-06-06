package dds.QMP;

import dds.Exception.atuendoIncompletoException;
import dds.Exception.noSeEncuentraEnLaListaException;

import java.util.ArrayList;
import java.util.List;

class Guardarropas {
  List<Atuendo> atuendos = new ArrayList<>();

  void agregarAtuendos(List<Atuendo> atuendos) {
    this.atuendos = atuendos;
  }

  void agregarAtuendo(Atuendo atuendo) {
    if (!atuendo.atuendoListo()) {
      throw new atuendoIncompletoException("No se cargaron las prendas necesarias");
    }
    atuendos.add(atuendo);
  }

  void quitarAtuendo(Atuendo atuendo) {
    if(!atuendos.contains(atuendo)) {
      throw new noSeEncuentraEnLaListaException("No se encuentra en la lista");
    }
    this.atuendos.remove(atuendo);
  }

  List<Atuendo> obtenerAtuendos() {
    return atuendos;
  }
}
