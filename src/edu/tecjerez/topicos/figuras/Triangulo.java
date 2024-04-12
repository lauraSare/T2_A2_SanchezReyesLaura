package edu.tecjerez.topicos.figuras;

public class Triangulo {

	private double lados[] = new double[3];
	
	public Triangulo(double l, double l2, double l3) {
		lados[0] = l;
		lados[1] = l2;
		lados[2] = l3;
	}
	
	public double area() {
		
		double semiperimetro = (lados[0]+lados[1]+lados[2])/2;
		
		return Math.sqrt(semiperimetro*(semiperimetro-lados[0])*(semiperimetro-lados[1])*(semiperimetro-lados[2]));
	}
	
    public double perimetro() {
		
		return lados[0]+lados[1]+lados[2];
		
	}
	
}
