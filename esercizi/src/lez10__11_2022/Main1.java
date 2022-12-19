package lez10__11_2022;
import java.util.*;
public class Main1 {

	public static void main(String[] args) {
		double num1;
		
		Scanner input = new Scanner (System.in);
			System.out.println("Inserisci tre numeri");
				 num1 = input.nextDouble();
		Triangolo toto = new Triangolo(num1);
			toto.Perimetro1(num1);	
   
	}

}
