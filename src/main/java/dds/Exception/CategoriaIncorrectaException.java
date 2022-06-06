package dds.Exception;

public class CategoriaIncorrectaException extends RuntimeException {
  public CategoriaIncorrectaException(String causa) {
    super("La prenda es invalida porque: " + causa);
  }
}
