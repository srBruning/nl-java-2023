package questao6;

import java.util.ArrayList;
import java.util.List;

public class RepositorioList implements Repositorio {

	private List<Produto> dados;
	private int index;

	public RepositorioList() {
		dados = new ArrayList<Produto>();
		index = 0;
	}

	@Override
	public void adicionar(Produto pr) {
		dados.add(pr);
	}

	@Override
	public void init() {
		index = 0;
	}

	@Override
	public Produto next() {

		if (index < dados.size()) {
			Produto pr = dados.get(index);
			index++;
			return pr;
		}

		return null;
	}

	@Override
	public boolean hasNext() {

		return index < dados.size();
	}

}
