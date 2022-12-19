package es04_11_2022;
// Creare un programma che estragga 1000 numeri da 0 a 100 e poi stampi i primi 10 numeri più frequenti
public class EstrazioneMilleNumeri {

	public static void main(String[] args) {
		int []array = new int [1000];
		int []array1 = new int [101];
		for(int i = 0 ; i < 1000 ; i++) {
			array[i]=(int) (Math.random()*10+1);
		}
		int conta=0;
		for(int i=0 ; i < 15 ; i++) {
			for(int j=0 ; j < 15 ; j++) {
				if(array[i]==array[j]){
					conta++;
					System.out.println(array[i] + " | " + conta);
				}
			}
		}

	}

}
