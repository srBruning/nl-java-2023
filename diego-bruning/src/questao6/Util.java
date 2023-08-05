package questao6;

public class Util {
	
	public void copiar(Repositorio a, Repositorio b ) {
		
		a.init();
		
		while(a.hasNext()) {
			Produto pr = a.next();
			b.adicionar(pr);
		}
	}
}
