package sabado.e1;

public class Produto {
	
	public Produto() {
		System.out.println("Validação");
	}
	
	private int codigoProduto;

	public int getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(int codigoProduto) {
		System.out.println("Produto.setCodigoProduto");
		this.codigoProduto = codigoProduto;
	}

}
