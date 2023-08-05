package sabado.formas;

public abstract class FiguraGeometrica {

	/**
	 * imprime a área e o perímetro da ﬁgura,
	 */
	public void imprimir() {
		System.out.println("Área da figura: "+calcularArea());
		System.out.println("Área do perimetro: "+calcularPerimetro());

	}

	public abstract float calcularArea();

	public abstract float calcularPerimetro();

}
