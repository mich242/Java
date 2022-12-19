package es25_10_2022;
import java.util.*;
public class Calcolatrice1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			int x, y;
		System.out.println("Inserisci due numeri");
			x = input.nextInt();
			y = input.nextInt();
		System.out.println("Adesso inserisci un numero da 1 a 4, che corrisponderà ad un operazione");
			int risposta = input.nextInt();
			int Risultato = 0;
			int Resto = 0 ; 
			switch(risposta)
			{
			case 1 : Risultato = x + y;
			System.out.println("La somma è : " + Risultato);
				break;
			case 2 : Risultato = x - y;
			System.out.println("La sottrazione è : " + Risultato);
				break;
			case 3 : Risultato = x * y;
			System.out.println("Il prodotto è : " + Risultato);
				break;
			case 4 : Risultato = x / y;
					 Resto = x % y;
			System.out.println("Il quoziente è : " + Risultato + " Il resto è : " + Resto );
				break;
			default : System.out.println("Operazione errata");
			}
			
	}

}
