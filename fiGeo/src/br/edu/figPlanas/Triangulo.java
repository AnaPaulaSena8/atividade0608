package br.edu.figPlanas;

public class Triangulo {
     public double area;
     public double altura;
     public double base;
    
     public void calcArea() {
    	 area = (altura*base)/2;
    	 System.out.println(area);
     }
}
