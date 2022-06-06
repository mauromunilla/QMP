package dds.QMP;

public class Prenda {
  Tipo tipo;
  Material material;
  Trama trama;
  Color colorPpal;
  Color colorSecundario;

  int temperaturaMaxima;

  Prenda(Tipo tipo, Material material, Trama trama, Color colorPpal, Color colorSecundario, int temperaturaMaxima) {
    this.tipo = tipo;
    this.material = material;
    this.trama = trama;
    this.colorPpal = colorPpal;
    this.colorSecundario = colorSecundario;
    this.temperaturaMaxima = temperaturaMaxima;
  }

  Categoria obtenerCategoria() {
      return tipo.darCategoria();
    }

  Boolean adecuadaParaTemperatura(int temperatura) { return temperaturaMaxima >= temperatura; }

}

