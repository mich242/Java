package es15_10_2022;
import java.util.Scanner;

public class Maggiore3Valori {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n1, n2, n3;
		System.out.println("Inserisci tre numeri: ");
		n1 = input.nextInt();
		n2 = input.nextInt();
		n3 = input.nextInt();
		
		if(n1>n2) {
			if(n1>n3) {
				System.out.println("Il numero più grande è: " + n1);
			} else {
				System.out.println("Il numero più grande è: " + n3);
			}
		} else {
			if(n2>n3) {
				System.out.println("Il numero più grande è: " + n2);
			} else {
				System.out.println("Il numero più grande è: " + n3);
			}
		}
	}

}
