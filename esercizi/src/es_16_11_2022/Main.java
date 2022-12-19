package es_16_11_2022;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String Nome, Cognome, Email="";
		String risposta="";
		
		System.out.println("Inserisci il nome");
			Nome = input.nextLine();
		
		System.out.println("Inserisci il cognome");
			Cognome = input.nextLine();
			
			Anagrafica Anagrafia = new Anagrafica(Nome, Cognome, Email, risposta);
		
		System.out.println("Vuoi registrare la tua Email, inserisci una risposta");
			 risposta = input.nextLine();
		
			Anagrafia.registraMail();
			
		System.out.println("Inserisci la tua Email");
			Email = input.nextLine();
			
		Anagrafia.stampaDati();
		
  // RUNZA GAY
	}

}
