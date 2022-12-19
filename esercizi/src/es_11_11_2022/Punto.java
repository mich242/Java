package es_11_11_2022;

public class Punto {
	private double x=0 , y=0;
		public Punto(double x, double y) {
			this.x = x;
			this.y = y;
		}
		public void LoacalizzaQuadrante() {
			if(x > 0 && y > 0) {
				System.out.println("Primo QUADRANTE");
			}
			if(x < 0 && y > 0) {
				System.out.println("Secondo QUADRANTE");
			}
			if(x < 0 && y < 0) {
				System.out.println("Terzo QUADRANTE");
			}
			if(x > 0 && y < 0) {
				System.out.println("Quarto QUADRANTE");
			}
			if(x == 0 && y != 0 ) {
				System.out.println("Nell'ASSE delle y");
			}
			if(x == 0 && y != 0 ) {
				System.out.println("Nell'ASSE delle x");
			}
		}

}
