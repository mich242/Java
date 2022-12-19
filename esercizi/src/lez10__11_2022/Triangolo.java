package lez10__11_2022;

public class Triangolo {
	private double a, b, c;
	public Triangolo /*SCALENO*/(double lato1, double lato2, double lato3) {
			 a = lato1;
			 b = lato2;
			 c = lato3;
		}
	public void Perimetro(double lato1, double lato2, double lato3) {
			double perimetro = 0;
			perimetro = lato1 + lato2 + lato3;
			System.out.println("Il perimetro è : " + perimetro);
	}
	public Triangolo /*Equilatero*/(double lato1){
		a = lato1;
	}
	public void Perimetro1(double lato1) {
		double perimetro = 0;
		perimetro = lato1*3;
		System.out.println("Il perimetro è : " + perimetro);
	}
	public Triangolo /*ISOSCELE*/(double lato1, double lato2){
		a = lato1;
		b = lato2;
		
	}
	public void Perimetro2(double lato1,double lato2) {
		double perimetro = 0;
		perimetro = lato1 + lato2 * 2;
		System.out.println("Il perimetro è : " + perimetro);
	}
	
}
	
	

