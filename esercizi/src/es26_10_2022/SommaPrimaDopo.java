package es26_10_2022;
import java.math.*;
public class SommaPrimaDopo {

	public static void main(String[] args) {
		int []array = new int [10];
		int somma = 0;
		int conta = 0;
		for(int i = 0 ; i <= 9 ; i++) {
			array[i]=(int) (Math.random()*10);
			System.out.print(array[i] + " ");
		}
		System.out.println();
		for(int i = 1 ; i <= 8 ; i++) {
			somma=array[i-1] + array[i+1];
				if(somma == array[i]) {
					System.out.println(array[i] + " - " + somma + " - OK");
					conta++;
				}
					
		}
		if(conta==0)System.out.println("NO");;

	}

}
