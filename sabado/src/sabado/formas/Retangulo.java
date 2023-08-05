package sabado.formas;

public class Retangulo extends FiguraGeometrica {

	private float comprimento;
	private float largura;
	
	public Retangulo() {
		super();
		System.out.println("retangula validação");
	}

	public Retangulo(float comprimento, float largura) {
		this();
		this.comprimento = comprimento;
		this.largura = largura;
	}

	@Override
	public float calcularArea() {
		return comprimento*largura;
	}

	@Override
	public float calcularPerimetro() {
		float perimetro = 2 * largura + 2 * comprimento; 
		return perimetro;
	}

	public float getComprimento() {
		return comprimento;
	}

	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}

	public float getLargura() {
		return largura;
	}

	public void setLargura(float largura) {
		this.largura = largura;
	}
	
}
