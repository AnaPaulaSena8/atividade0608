package br.edu.figEspacial;

public class PiramedeQ {
	public double aresta;
	public double volume;
	public double areaT;
	public double aL;
	public double aB;
	public double altura;
	public double baseT;
	
	public void aLateral() {
		aL = 4*((baseT*altura)/2);
		System.out.println("Area lateral = "+ aL);
}
	public void aBase(double lado) {
		aB = lado*lado;
		System.out.println("area da base =  "+ aB);
	}  
	public void areaT () {
		areaT= aL+aB;
		System.out.println("Area total = " + areaT);
	}
	public void volume () {
		volume= 1/3*(aresta*aresta*aresta)*altura;
		System.out.println("Volume total = " + volume);
	}
}