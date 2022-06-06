package dds.QMP;

import dds.Exception.PrendaInvalidaException;

public class Borrador {
  Tipo tipo;
  Material material;
  Trama trama;
  Color colorPpal;
  Color colorSecundario;

  int temperaturaMaxima;

  Borrador(Tipo tipo) {
    validarNoNulo(tipo, "El tipo de prenda falta ser informado.");
    this.tipo = tipo;
  }

  void especificarMaterial(Material material) {
    validarNoNulo(material, "El material de la prenda falta ser completado.");
    this.material = material;
  }

  void especificarTrama(Trama trama) {
    validarNoNulo(trama, "La trama de la prenda falta ser informada.");
    this.trama = trama == null ? Trama.LISA : trama ;
  }

  void especificarColorPpal(Color ColorPpal) {
    validarNoNulo(colorPpal, "El colorPpal de la prenda falta ser informado.");
    this.colorPpal = colorPpal;
  }

  void setColorSecundario(Color colorSecundario) {
    this.colorSecundario = colorSecundario;
  }

  void especificarTemperaturaMaxima(int temperaturaMaxima) {
    validarNoNulo(temperaturaMaxima, "La temperatura máxima de la prenda falta ser informada.");
    this.temperaturaMaxima = temperaturaMaxima;
  }

  Prenda crearPrenda() {
    return new Prenda(tipo, material, trama, colorPpal, colorSecundario, temperaturaMaxima);
  }

  private void validarNoNulo(Object a, String mensaje) throws PrendaInvalidaException {
    if (a == null) {
      throw new PrendaInvalidaException(mensaje);
    }
  }
}
