package algoritmo.dijkstra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dijkstra {

	// Guarda os vertices pertencentes ao menor caminho encontrado
	List<Vertice> menorCaminho = new ArrayList<Vertice>();

	// Guarda os vertices pertencentes ao menor caminho
	Vertice caminhoVertice = new Vertice();

	// Guarda o vertice que esta sendo visitado
	Vertice verticeAtual = new Vertice();

	// Marca o vizinho do vertice visitado naquele momento
	Vertice vizinho = new Vertice();

	// Vertices não visitados
	List<Vertice> naoVisitados = new ArrayList<Vertice>();

	public List<Vertice> menorCaminho(Grafo grafo, Vertice v1, Vertice v2) {

		// Guarda a origem na lista do menor caminho
		menorCaminho.add(v1);

		// Distancias iniciais do grafo
		for (int i = 0; i < grafo.getVertices().size(); i++) {

			// Vertice atual possui distancia zero
			if (grafo.getVertices().get(i).getDescricao().equals(v1.getDescricao())) {

				grafo.getVertices().get(i).setDistancia(0);

			} else {

				grafo.getVertices().get(i).setDistancia(15);

			}
			// Insere o vertice na lista dos nao visitados
			this.naoVisitados.add(grafo.getVertices().get(i));
		}

		Collections.sort(naoVisitados);

		// Percorre ate que todos os vertices sejam visitados
		while (!this.naoVisitados.isEmpty()) {

			// Atribui o vertice com menor distancia da lista
			verticeAtual = this.naoVisitados.get(0);
			System.out.println("Vertice atual:  " + verticeAtual);

			/*
			 * Soma a distancia do vertice atual com a da aresta correspondente
			 * Se for menor que a distancia do vizinho, é atualizado!
			 */
			for (int i = 0; i < verticeAtual.getArestas().size(); i++) {

				vizinho = verticeAtual.getArestas().get(i).getDestino();
				System.out.println("Vizinho de " + verticeAtual + ": " + vizinho);
				if (!vizinho.verificarVisita()) {

					// Compara a distância do vizinho com sua distancia
					if (vizinho.getDistancia() > (verticeAtual.getDistancia()
							+ verticeAtual.getArestas().get(i).getPeso())) {

						vizinho.setDistancia(verticeAtual.getDistancia() + verticeAtual.getArestas().get(i).getPeso());
						vizinho.setRaiz(verticeAtual);

					}
				}
			}

		}

		// Marca o vertice atual como visitado
		verticeAtual.visitado();

		// Retira da lista de nao visitados
		this.naoVisitados.remove(verticeAtual);

		// Ordena a lista, vertice com menor distancia vai primeira posição
		Collections.sort(naoVisitados);
		System.out.println("Nao foram visitados:" + naoVisitados);

		return menorCaminho;
	}

}
