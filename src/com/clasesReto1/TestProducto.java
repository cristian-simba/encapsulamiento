package com.clasesReto1;

public class TestProducto {
	public static void main(String[] args) {
		// Instancia
		Producto productoA = new Producto();
		Producto productoB = new Producto();
		Producto productoC = new Producto();
		// Modificar
		// Producto A
		productoA.setNombre("Paracetamol");
		productoA.setDescripcion("Pastilla para el dolor del cuerpo");
		productoA.setPrecio(0.50);
		productoA.setStockActual(50);
		// Producto B
		productoB.setNombre("Finalin");
		productoB.setDescripcion("Pastilla para el dolor de cabeza");
		productoB.setPrecio(0.75);
		productoB.setStockActual(100);
		// Producto C
		productoC.setNombre("Protector Solar");
		productoC.setDescripcion("Crema para proteger la piel");
		productoC.setPrecio(2.70);
		productoC.setStockActual(20);
		
		// Mostrar
		System.out.println("--- Producto A ---");
		System.out.println("nombre: " + productoA.getNombre());
		System.out.println("descripcion: " + productoA.getDescripcion());
		System.out.println("precio: " + productoA.getPrecio());
		System.out.println("stock Actual: " + productoA.getStockActual());
		System.out.println("--- Producto B ---");
		System.out.println("nombre: " + productoB.getNombre());
		System.out.println("descripcion: " + productoB.getDescripcion());
		System.out.println("precio: " + productoB.getPrecio());
		System.out.println("stock Actual: " + productoB.getStockActual());
		System.out.println("--- Producto C ---");
		System.out.println("nombre: " + productoC.getNombre());
		System.out.println("descripcion: " + productoC.getDescripcion());
		System.out.println("precio: " + productoC.getPrecio());
		System.out.println("stock Actual: " + productoC.getStockActual());
	}
}
