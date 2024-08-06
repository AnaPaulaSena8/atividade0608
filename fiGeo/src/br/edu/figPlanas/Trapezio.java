package br.edu.figPlanas;

public class Trapezio {
	public double area;
	public double baseMaior;
	public double baseMenor;
	public double altura;
	public void calcArea() {
		area= (baseMaior+baseMenor)*altura/2;
		System.out.println(area);
	}
}
