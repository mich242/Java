package lez10__11_2022;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		double num1, num2 , num3;
		
		Scanner input = new Scanner (System.in);
			System.out.println("Inserisci tre numeri");
				 num1 = input.nextDouble();
				 num2 = input.nextDouble();
				 num3 = input.nextDouble();
		Triangolo toto = new Triangolo(num1, num2, num3);
			toto.Perimetro(num1, num2, num3);	
   
	}

}
