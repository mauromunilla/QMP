package dds.QMP;

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

  List<Atuendo> obtenerAtuendos() {
    return atuendos;
  }
}
