package es25_10_2022;
import java.util.*;
public class Calcolatrice {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			int x, y;
		System.out.println("Inserisci due numeri");
			x = input.nextInt();
			y = input.nextInt();
		System.out.println("Adesso inserisci un numero da 1 a 4, che corrisponderà ad un operazione");
			int risposta = input.nextInt();
			int Risultato = 0;
			int resto = 0;
			if(risposta > 0 && risposta < 5) {
				if(risposta == 1) { Risultato = x + y; System.out.println("Il risultato finale è :" + Risultato); }
				if(risposta == 2) { Risultato = x - y; System.out.println("Il risultato finale è :" + Risultato); }
				if(risposta == 3) { Risultato = x * y; System.out.println("Il risultato finale è :" + Risultato); }
				if(risposta == 4) { 
					Risultato = x / y;
					resto = x % y;
				System.out.println("Il risultato finale è :" + Risultato + " Il resto  è : " + resto); }
				
			}
			else {
				System.out.println("ERRORE!!");
			}
	}

}
