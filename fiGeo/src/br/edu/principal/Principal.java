package br.edu.principal;

import java.util.Scanner;

import br.edu.figPlanas.*;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Triangulo t1 = new Triangulo();
		System.out.println("Digite a altura do triangulo");
		t1.altura=sc.nextDouble();
		System.out.println("Digite a base triangulo");
		t1.base=sc.nextDouble();
		t1.calcArea();
		
		
		Quadrado q1 = new Quadrado();
		System.out.println("Digite o lado do quadrado");
		q1.lado=sc.nextDouble();
		q1.calcArea();
		
		Retangulo r1 = new Retangulo();
		System.out.println("Digite a altura do retangulo");
		r1.altura=sc.nextDouble();
		System.out.println("Digite a base do retangulo");
		r1.base=sc.nextDouble();
		r1.calcArea();
		
		Losango l1 = new Losango();
		System.out.println("Digite a Diagonal maior");
		l1.diagonalMaior=sc.nextDouble();
		System.out.println("Digite a Diagonal menor");
		l1.diagonalMenor=sc.nextDouble();
		l1.calcArea();
		
		Circulo c1 = new Circulo();
		System.out.println("Digite o raio: ");
		c1.raio=sc.nextDouble();
		c1.calcArea();
		
		Pentagono p1 = new Pentagono();
		System.out.println("Digite o lado do pentagono: ");
		p1.lado=sc.nextDouble();
		System.out.println("Digite o apotema: ");
		p1.apotema=sc.nextDouble();
		p1.calcArea();
		
		Trapezio tr1 = new Trapezio();
		System.out.println("Digite a altura trapezio:");
		tr1.altura=sc.nextDouble();
		System.out.println("Digite a base maior");
		tr1.baseMaior=sc.nextDouble();
		System.out.println("Digite a base menor");
		tr1.baseMenor=sc.nextDouble();
		tr1.calcArea();
		
		Hexagono h1 = new Hexagono();
		System.out.println("Digite o lado do hexagono");
		h1.lado=sc.nextDouble();
		h1.calcArea();
		
		//figuras espaciais
		
		
	}

}
