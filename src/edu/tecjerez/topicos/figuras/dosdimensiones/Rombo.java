package edu.tecjerez.topicos.figuras.dosdimensiones;


public class Rombo {
	
	private double lado;
	private double n;
	private double n2;
	
	public Rombo(double lado, double n, double n2) {
		this.lado = lado;
		this.n2 = n2;
		this.n = n;
	}
	
	public double area() {
		return n*n2/2;
	}
	
	public double perimetro() {
		return 4*lado;
	}

}
