package br.edu.figPlanas;

public class Losango {
  public double area;
  public double diagonalMaior;
  public double diagonalMenor;
  
  
  public void calcArea() {
	  area= (diagonalMaior*diagonalMenor)/2;
	  System.out.println(area);
  }
}
