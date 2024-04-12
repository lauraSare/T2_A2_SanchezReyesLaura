package edu.tecjerez.topicos.figuras.tresdimensiones;


public class Piramide {

	protected double a;
	protected double a2;
	protected double altura;
	
	public Piramide(double a, double a2, double altura) {
	   this.a2 = a2;
	   this.a = a;
	   this.altura = altura;
	}
	
	public double area() {
		
		double pb = a+a+a+a;
		
		return pb*(a+a2)/2;
	}
	
    public double volumen() {
		return Math.pow(a, 2)*altura/3;
	}
	
}
