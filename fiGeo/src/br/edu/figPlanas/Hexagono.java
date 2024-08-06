package br.edu.figPlanas;

public class Hexagono {
	public double area;
	public double lado;
	public void calcArea() {
		area=6*(lado*lado*lado/4);
		System.out.println(area);
	}
}
