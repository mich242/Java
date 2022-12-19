package es15_10_2022;
import java.util.Scanner;

public class PariPiccolo {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci un numero: ");
		int n = input.nextInt();
		
		if(n%2==0) {
			if((n>=0) && (n<=100)) {
				System.out.println("Pari e Piccolo");
			}
		} else {
			if((n>=0) && (n<=100)) {
				System.out.println("Non è pari e Piccolo");
			}
		}
	}

}
