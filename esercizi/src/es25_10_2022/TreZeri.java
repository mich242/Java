package es25_10_2022;
import java.util.*;
public class TreZeri {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double somma = 0 ;
		for(int i = 0 ; i < 3 ; ) {
			System.out.println("Inserisci un numero");
			 double n = input.nextDouble();
			if(n==0) {
			 i++;
			}
			else {
			 i-=i; // i=0
			}
			somma+=n;
		}
		System.out.println("La somma è : " + somma );
		 
	}

}
