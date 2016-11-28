package algoritmo.dijkstra;

public class Principal {

	public static void main(String[] args) {
		int matriz[][] = {
	            {99999, 3, 10, 99999, 99999},
	            {3, 99999, 99999, 5, 99999},
	            {10, 99999, 99999, 6, 15},
	            {99999, 5, 6, 99999, 4},
	            {99999, 99999, 15, 4, 99999}
	        };
	        
//	        for (int j = 0; j < mat.length; j++) {
//	            for (int i = 0; i < mat[j].length; i++) {
//	                if(mat[j][i]==99999){
//	                    System.out.print(" "+"INF");
//	                }else{
//	                    System.out.print(" " + mat[j][i]);
//	                }                
//	            }
//	            System.out.println("");
//	        }
	        
	        Floyd floyd  = new Floyd();
	        matriz = floyd.algoritmoFloyd(matriz);
	        
	        for (int j = 0; j < matriz.length; j++) {
	            for (int i = 0; i < matriz[j].length; i++) {
	                System.out.print(" " + matriz[j][i]);
	            }
	            System.out.println("");
	        }
	    }
	
	}
	

