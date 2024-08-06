package br.edu.figEspacial;

public class Cubo {
	public double aresta;
	public double volume;
	public double area;
	public double aL;
	public double aB;
	
	public void calcArea() {                    
		area = 6*(aresta*aresta);
		System.out.println("A area total: " + area);
	}
    public void aLateral() {
    	aL = 4*(aresta*aresta);
    }
    public void aBase() {
    	aB = 2*(aresta*aresta);
    }
    public void volume() {
    	volume =  aresta*aresta*aresta;
    }
}