package questao6;

public class TestaRepositorio {

	
	public static void main(String[] args) {
		RepositorioList a = new RepositorioList();
		RepositorioList b = new RepositorioList();
		

		a.adicionar(new ProdutoPerecivel(10));
		a.adicionar(new ProdutoPerecivel(15));
		a.adicionar(new ProdutoPerecivel(20));

		b.adicionar(new ProdutoPerecivel(100));
		b.adicionar(new ProdutoPerecivel(200));

		System.out.println("Repositorio a: ");
		imprimirRepositorio(a);
		

		System.out.println("Repositorio b: ");
		imprimirRepositorio(b);
		
		Util util = new Util();
		System.out.println("Copinado a para b... ");
		util.copiar(a, b);
		

		System.out.println("Repositorio b: ");
		imprimirRepositorio(b);
		
	}
	
	
	public static void imprimirRepositorio(Repositorio rep) {
		rep.init();
		while(rep.hasNext()) {
			Produto pr = rep.next();
			System.out.println(pr);
		}
	}
}
