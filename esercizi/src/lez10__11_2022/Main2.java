package lez10__11_2022;
import java.util.*;
public class Main2 {

	public static void main(String[] args) {
		double num1, num2;
		
		Scanner input = new Scanner (System.in);
			System.out.println("Inserisci tre numeri");
				 num1 = input.nextDouble();
				 num2 = input.nextDouble();
		Triangolo toto = new Triangolo(num1, num2);
			toto.Perimetro2(num1, num2);	
   
	}

}
