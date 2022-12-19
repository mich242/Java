package es15_10_2022;
import java.util.Scanner;

public class Uguali {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n1, n2;
		
		System.out.println("Inserisci due numeri: ");
		n1 = input.nextInt();
		n2 = input.nextInt();
		
		if(n1==n2) {
			System.out.println(n1 + " e " + n2 + " sono uguali");
		} else {
			System.out.println(n1 + " e " + n2 + " non sono uguali");
		}
		
	}

}
