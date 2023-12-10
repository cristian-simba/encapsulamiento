package com.clasesReto3;

public class TestCuadrado {
	public static void main(String args[]) {
		Cuadrado c1 = new Cuadrado();
		Cuadrado c2 = new Cuadrado();
		Cuadrado c3 = new Cuadrado();
		
		c1.setLado(2);
		double areaC1 = c1.calcularArea();
		double perimetroC1 = c1.calcularPerimetro();
		
		c2.setLado(4);
		double areaC2 = c2.calcularArea();
		double perimetroC2 = c2.calcularPerimetro();
		
		c3.setLado(10);
		double areaC3 = c3.calcularArea();
		double perimetroC3 = c3.calcularPerimetro();
		
		System.out.println("--- Areas ---");
		System.out.println("Area del Cuadrado 1: " + areaC1);
		System.out.println("Area del Cuadrado 2: " + areaC2);
		System.out.println("Area del Cuadrado 3: " + areaC3);
		
		System.out.println("--- Perimetros ---");
		System.out.println("Perimetro del Cuadrado 1: " + perimetroC1);
		System.out.println("Perimetro del Cuadrado 2: " + perimetroC2);
		System.out.println("Perimetro del Cuadrado 3: " + perimetroC3);
	}
}
