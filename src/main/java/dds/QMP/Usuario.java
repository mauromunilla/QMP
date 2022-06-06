package dds.QMP;

import dds.Exception.noSeEncuentraEnLaListaException;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
  List<Guardarropas> ListaDeGuardarropas = new ArrayList<>();

  void agregarGuardarropas(Guardarropas guardarropas) {
    this.ListaDeGuardarropas.add(guardarropas);
  }

  void quitarGuardarropas(Guardarropas guardarropas) {
    if(!ListaDeGuardarropas.contains(guardarropas)) {
      throw new noSeEncuentraEnLaListaException("No se encuentra en la lista");
    }
    this.ListaDeGuardarropas.remove(guardarropas);
  }
}
