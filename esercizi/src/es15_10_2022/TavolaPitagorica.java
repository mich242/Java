package es15_10_2022;

public class TavolaPitagorica {

	public static void main(String[] args) {
		
		int[][] pitagorica = new int[10][10];
	    int i, j;
	    
	    for(i=0; i<10; i++) { 
	        for(j=0; j<10; j++) {
		        pitagorica[i][j]=(i+1)*(j+1);
	        }
	    }

	    for(i=0; i<10; i++) {
	        for(j=0; j<10; j++) {
	            System.out.print(pitagorica[i][j] + "\t");
	        }
	        System.out.println();
	    }
		
	}

}
