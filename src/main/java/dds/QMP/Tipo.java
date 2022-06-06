package dds.QMP;

public class Tipo {
  Categoria categoria;

  Tipo(Categoria categoria) {
    this.categoria = categoria;
  }

  Categoria darCategoria() {
    return this.categoria;
  }

  /*ZAPATO(Categoria.CALZADO),
  CAMISA(Categoria.PARTE_SUPERIOR),
  PANTALON(Categoria.PARTE_INFERIOR);

  Categoria categoria;

  Tipo(Categoria categoria) {
    this.categoria = categoria;
  }

  Categoria darCategoria() {
    return this.categoria;
  }*/
Tipo Zapato = new Tipo(Categoria.CALZADO);
Tipo Pantalon = new Tipo(Categoria.PARTE_INFERIOR);
Tipo remera = new Tipo(Categoria.PARTE_SUPERIOR);
Tipo gorro = new Tipo(Categoria.ACCESORIO);
}


