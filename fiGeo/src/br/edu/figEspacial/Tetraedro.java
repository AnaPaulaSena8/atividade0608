package br.edu.figEspacial;

public class Tetraedro {
	public double volume;
	public double areaT;
	public double aL;
	public double aB;
	public double altura;
	public double baseT;
	public double aresta;
	
	public void aLateral() {
		aL = (3*(aresta*aresta)*Math.sqrt(3))/4;
		System.out.println("Area lateral = "+ aL);
}
	public void aBase(double lado) {
		aB = (aresta*aresta)*Math.sqrt(3)/4;
		System.out.println("area da base =  "+ aB);
	}  
	public void areaT () {
		areaT= (aresta*aresta)*Math.sqrt(3);
		System.out.println("Area total = " + areaT);
}   public void volume () {
	volume= ((aresta*aresta*aresta)*Math.sqrt(2))/12;
	System.out.println("Volume total = " + volume);
}
	}