package br.edu.figEspacial;

public class Cone {
	public double volume;
	public double areaT;
	public double aL;
	public double aB;
	public double altura;
	public double baseT;
	public double raio;
	public double geratriz;
	
	public void aLateral() {
		aL = 3.14*raio*geratriz;
		System.out.println("Area lateral = "+ aL);
}
	public void aBase(double lado) {
		aB = 3.14*(raio*raio);
		System.out.println("area da base =  "+ aB);
	}  
	public void areaT () {
		areaT= aL+aB;
		System.out.println("Area total = " + areaT);
}    
	public void volume () {
		volume= 1/3*3.14*(raio*raio)*altura;
		System.out.println("Volume total = " + volume);
	}
	}