package edu.tecjerez.topicos.figuras.dosdimensiones;


public class Circulo {

	protected double radio;
	
	public Circulo(double radio){
		this.radio = radio;
	}
	
	public double area() {
		return Math.PI*Math.pow(radio, 2);
	}
	
	public double perimetro() {
		return 2*Math.PI*radio;
	}
	
}
