public class Prenda {
	Tipo tipo;
	String material;
	Color colorPpal;
	Color colorSecundario;
	
	Prenda(Tipo tipo, String material, Color colorPpal) {
		this.tipo = Objects.requireNonNull(tipo, "Falta el tipo de Prenda");
		this.material = Objects.requireNonNull(material, "Falta el material de la Prenda");
		this.colorPpal = Objects.requireNonNull(colorPpal, "Falta el color principal de la Prenda");
	}
	
	void setColorSecundario(Color colorSecundario) {
		this.colorSecundario = colorSecundario;
	}
	
	String obtenerCategoria() {
		return tipo.categoria();
	}

}

public class Color {
	int red, green, blue;
}

public enum Tipo {
	ZAPATO() {
		String categoria() { return "Calzado"; }
	}, CAMISA_MANGA_CORTA() {
		String categoria() { return "Parte Superior"; }
	}
} 