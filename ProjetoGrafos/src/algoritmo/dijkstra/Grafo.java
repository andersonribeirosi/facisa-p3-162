package algoritmo.dijkstra;

import java.util.ArrayList;
import java.util.List;

public class Grafo {

	private List<Vertice> grafo = new ArrayList<Vertice>();

	public void setVertices(List<Vertice> vertices) {

		this.grafo.addAll(vertices);
	}

	public void adicionarVertice(Vertice novoVertice) {

		this.grafo.add(novoVertice);
	}

	public List<Vertice> getVertices() {

		return this.grafo;
	}

	// Retorna o vértice onde sua descrição (valor) é igual à procurada.
	public Vertice encontrarVertice(String nome) {

		for (int vet = 0; vet < this.getVertices().size(); vet++) {

			if (nome.equalsIgnoreCase(this.getVertices().get(vet).getDescricao())) {

				return this.getVertices().get(vet);

			}
		}

		return null;

	}

}