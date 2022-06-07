package dds.QMP;

public abstract class Propuesta {

  Prenda prendaPropuesta;
  EstadoPropuesta estado;

  public Propuesta(Prenda prendaPropuesta) {
    this.prendaPropuesta = prendaPropuesta;
    this.estado = EstadoPropuesta.PENDIENTE;
  }

  EstadoPropuesta getEstado() {
    return estado;
  }

  void aceptar(Guardarropas guardarropas, Atuendo atuendo) {
    this.estado = EstadoPropuesta.ACEPTADA;
    aceptacionSegun(guardarropas,atuendo);
  }

  void rechazar() {
    this.estado = EstadoPropuesta.RECHAZADA;
  }

  void deshacer(Guardarropas guardarropas, Atuendo atuendo) {
    this.estado = EstadoPropuesta.PENDIENTE;
    deshacerSegun(guardarropas, atuendo);
  }

  public abstract void deshacerSegun(Guardarropas guardarropas,Atuendo atuendo);

  public abstract void aceptacionSegun(Guardarropas guardarropas,Atuendo atuendo);
}
