package dds.QMP;

public class PropuestaAgregar extends Propuesta {
  Prenda prendaPropuesta;

  EstadoPropuesta estado;

  public PropuestaAgregar(Prenda prendaPropuesta) {
    super(prendaPropuesta);
  }

  @Override
  public void aceptacionSegun(Guardarropas guardarropas,Atuendo atuendo) {
    guardarropas.agregarPrenda(prendaPropuesta,atuendo);
  }

  @Override
  public void deshacerSegun(Guardarropas guardarropas,Atuendo atuendo) {
    guardarropas.quitarPrenda(prendaPropuesta,atuendo);
  }
}


