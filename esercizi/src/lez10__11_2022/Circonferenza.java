package lez10__11_2022;

public class Circonferenza {
	private double r, p = 3.14;
	
	public Circonferenza(double raggio) {
		 r = raggio;
	}
	public void area(double raggio) {
		double area = 0 ; 
		area = raggio * raggio * p;
		System.out.println("L'area è : " + area);
	}

}
		