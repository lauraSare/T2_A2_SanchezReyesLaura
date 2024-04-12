package edu.tecjerez.topicos.figuras.tresdimensiones;


public class Cono {

	double radio;
	double altura;
	double generatriz;
	
	public Cono(double radio, double altura, double generatriz) {
		this.radio = radio;
		this.altura = altura;
		this.generatriz = generatriz;
	}
	
	public double volumen() {
		return Math.PI*Math.pow(radio, 2)*altura/3;
	}
	
	public double area() {
		return Math.PI*radio*(radio+generatriz);
	}
	
}
