package sabado.formas;

public class Main {

	public static void main(String[] args) {
		
		FiguraGeometrica fig1 ;
		fig1 = new Quadrado(10);
		
		fig1.imprimir();
		System.out.println("--------");
		Retangulo fig2= new Retangulo();
		
		fig2.setComprimento(2);
		fig2.setLargura(5);
		fig2.imprimir();
	}
}
