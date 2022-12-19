package es15_10_2022;
import java.util.Scanner;

public class ContaNumeriCrescenti {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n1, n2 = 0, temp, i = 0;
		
		do {			
			System.out.println("Inserisci il prossimo numero: ");
			n1 = input.nextInt();
			
			temp = n1;
			n1 = n2;
			n2 = temp;
			
			i++;
		} while((n1<=temp) || (n1<=0) && (n1>=0));
		
		System.out.println("Hai immesso una sequenza di numeri crescenti lunga: " + (i-1));
		
	}

}
