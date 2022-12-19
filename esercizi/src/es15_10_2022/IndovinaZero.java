package es15_10_2022;
import java.util.Scanner;

public class IndovinaZero {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci quanti numeri vuoi, una volta finito digita 0: ");
		
		int n;
		
		do {
			n = input.nextInt();
		} while(n!=0); 
		System.out.println("Hai digitato: 0;");	
	}

}
