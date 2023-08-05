package questao6;

public interface Repositorio {
	
	//adicionar(Produto): adiciona um produto
	public void adicionar(Produto pr);
	//init():void que retorna para posição 1
	public void init();
	//next():Produto – retorna o produto corrente e passa para o próximo
	public Produto next();
	// retorna se tem um próximo
	public boolean hasNext();
	
}
