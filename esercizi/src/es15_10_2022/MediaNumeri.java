package es15_10_2022;
import java.util.Scanner;

public class MediaNumeri {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n, i = 0;
		double somma = 0;
		
		do {
			System.out.println("Inserisci un numero: ");
			n = input.nextInt();
			if(n>0) {
				somma+=n;
			}
			i++;
		} while(n>=0);
		
		i--;
		double media = somma / i;
		System.out.println("La tua media è: " + media);
	}

}
