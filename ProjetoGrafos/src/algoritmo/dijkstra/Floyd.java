package algoritmo.dijkstra;

	public class Floyd {

	    public int[][] algoritmoFloyd(int[][] matriz) {
	        for (int k = 0; k < matriz.length; k++) {
	            for (int i = 0; i < matriz.length; i++) {
	                for (int j = 0; j < matriz.length; j++) {
	                    matriz[i][j] = Math.min(matriz[i][j], matriz[i][k] + matriz[k][j]);
	                }
	            }
	        }
	        return matriz;
	    }
	}

