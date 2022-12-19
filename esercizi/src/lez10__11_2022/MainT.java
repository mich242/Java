package lez10__11_2022;
import java.util.*;
public class MainT {

	public static void main(String[] args) {
		double num1, num2 , num3;
		
		Scanner input = new Scanner (System.in);
		System.out.println("Inserisci un numero da uno a tre");
			int num = input.nextInt();
			if(num ==1 || num == 2 || num == 3) {
			if(num == 1 ) {
			System.out.println("Inserisci i tre lati");
				 num1 = input.nextDouble();
				 num2 = input.nextDouble();
				 num3 = input.nextDouble();
				 Triangolo toto = new Triangolo(num1, num2, num3);
					toto.Perimetro(num1, num2, num3);
				
			}
			if(num == 2 ) {
				System.out.println("Inserisci il lato");
					 num1 = input.nextDouble();
				Triangolo toto = new Triangolo(num1);
					toto.Perimetro1(num1);
					
			}
			if(num == 3) {
				System.out.println("Inserisci i due lati");
				num1 = input.nextDouble();
				num2 = input.nextDouble();
				Triangolo toto = new Triangolo(num1, num2);
				toto.Perimetro2(num1, num2);
			}
			}
			else System.out.println("ERRORE");
			
			
   
	}

}
