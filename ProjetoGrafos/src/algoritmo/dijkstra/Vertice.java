package algoritmo.dijkstra;

import java.util.ArrayList;
import java.util.List;

//encapsula todas as propriedades do vértice
public class Vertice implements Comparable<Vertice> {

	private String descricao;
	private int distancia;
	private boolean itemVisitado = false;
	private Vertice raiz;
	private List<Aresta> arestas = new ArrayList<Aresta>();
	private List<Vertice> vizinhos = new ArrayList<Vertice>();

	public void setDescricao(String nome) {

		this.descricao = nome;
	}

	public String getDescricao() {

		return descricao;

	}

	public void visitado() {

		this.itemVisitado = true;
	}

	public boolean verificarVisita() {

		return itemVisitado;
	}

	public void setDistancia(int distancia) {

		this.distancia = distancia;
	}

	public int getDistancia() {

		return this.distancia;
	}

	public void setRaiz(Vertice raiz) {

		this.raiz = raiz;
	}

	public Vertice getRaiz() {

		return this.raiz;
	}

	public void setVizinhos(List<Vertice> vizinhos) {

		this.vizinhos.addAll(vizinhos);

	}

	public List<Vertice> getVizinhos() {

		return this.vizinhos;
	}

	public void setArestas(List<Aresta> arestas) {

		this.arestas.addAll(arestas);

	}

	public List<Aresta> getArestas() {

		return arestas;
	}
	
	@Override
	public boolean equals(Object obj) {
		// operador que compara o tipo de uma variável a uma classe
		if (obj instanceof Vertice) {
			Vertice vRef = (Vertice) obj;
			if (this.getDescricao().equals(vRef.getDescricao()))
				return true;
		}
		return false;
	}

	@Override
	public String toString() {
		String s = " ";
		s += this.getDescricao();
		return s;
	}

	@Override
	public int compareTo(Vertice o) {
		// TODO Auto-generated method stub
		return 0;
	}

}