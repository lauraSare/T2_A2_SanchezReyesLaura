package edu.tecjerez.topicos.figuras.dosdimensiones;


public class Elipse {
	
	private double radioMa;
	private double radioMe;
	
	public Elipse(double radioMa, double radioMe) {
		this.radioMa = radioMa;
		this.radioMe = radioMe;
	}
	
	public double area() {
		return radioMa * radioMe * Math.PI;
	}

	public double perimetro() {
		return 2*Math.PI*Math.sqrt((radioMa*radioMa+radioMe*radioMe)/2);
	}
	
}
