package sabado.e1;

public class Guitara extends Produto {

	
	
	public Guitara(int codigo) {
		setCodigoProduto(codigo);
	}
	
	
	@Override
	public void setCodigoProduto(int codigoProduto) {
		System.out.println("guitara.setCodigoProduto");
		super.setCodigoProduto(codigoProduto);
	}
	
}
