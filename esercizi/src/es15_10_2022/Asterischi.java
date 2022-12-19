package es15_10_2022;
import java.util.Scanner;

public class Asterischi {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci un numero: ");
		int n = input.nextInt();
		
		if(n<0) {
			System.out.println("Si è verificato un errore");
		}
		
		int i;
		
		for(i = 1; i<=n; i++) {
			for(int j = 0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
