package questao6;

import java.util.Date;

public class ProdutoPerecivel implements Produto {

	private long codProduto;
	private Date validade;
	
	public ProdutoPerecivel(long codProduto) {
		super();
		this.codProduto = codProduto;
		this.validade = new Date();
	}

	@Override
	public long getCodProduto() {
		return codProduto;
	}

	public void setCodProduto(long codProduto) {
		this.codProduto = codProduto;
	}

	public Date getValidade() {
		return validade;
	}

	public void setValidade(Date validade) {
		this.validade = validade;
	}

	@Override
	public String toString() {
		return "ProdutoPerecivel [codProduto=" + codProduto + ", validade=" + validade + "]";
	}

}
