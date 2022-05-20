package dds.QMP;

public class atuendoIncompletoException extends RuntimeException {
  public atuendoIncompletoException(String causa) {
    super("El atuendo es invalido porque: " + causa);
  }
}
