package sabado.formas;

public class Quadrado extends FiguraGeometrica {

	private float lado;
	
	public Quadrado(float lado) {
		this.lado = lado;
	}
	
	
	@Override
	public float calcularArea() {
		return lado * lado;
	}

	@Override
	public float calcularPerimetro() {
		return 4 * lado;
	}

	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}
	
	
 
}
