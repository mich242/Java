package es15_10_2022;
import java.util.Scanner;

public class Conteggio {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci un numero: ");
		int n = input.nextInt();
		
		if(n<0) {
			System.out.println("Si è verificato un errore");
		}
		
		for(int i = 0; i<=n; i++) {
			System.out.println(i);
		}
	}

}
