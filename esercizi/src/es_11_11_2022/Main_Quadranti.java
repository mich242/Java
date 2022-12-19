package es_11_11_2022;
import java.util.*;
public class Main_Quadranti {
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
			System.out.println("Inserisci le COORDINATE del punto P(x;y)");
				System.out.print("X : ");
				double x = input.nextDouble();
					System.out.println();
					System.out.print("Y : ");
				double y = input.nextDouble();
					System.out.println();
			Punto punto = new Punto(x, y);
				System.out.print("Il PUNTO si trova nel : ");
					punto.LoacalizzaQuadrante();
	}
}
