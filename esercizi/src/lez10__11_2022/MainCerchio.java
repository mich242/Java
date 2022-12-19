package lez10__11_2022;
import java.util.*;
public class MainCerchio {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Inserisci il raggio");
			double rag = input.nextDouble();
		Circonferenza toto = new Circonferenza(rag);
		toto.area(rag);
	}

}
