package questao5;

public class Lapiseira {
	private String marca;
	private String cor;
	private float grafite;
	
	public Lapiseira(String marca, String cor, float grafite) {
		this.marca= marca; 
		this.cor = cor;
		this.grafite = grafite;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public float getGrafite() {
		return grafite;
	}
	public void setGrafite(float grafite) {
		this.grafite = grafite;
	}
	
	
}
