package br.edu.figEspacial;

public class Esfera {
	public double volume;
	public double area;
	public double raio;
	public double altura;
	
	public void calcArea() {                    
		area = 4*3.14*(raio*raio);
		System.out.println("A area total: " + area);
	}
	public void volume() {                    
		volume = (altura/3*3.14)*raio*raio*raio ;
		System.out.println("O volume total: " + volume);
	}
}
