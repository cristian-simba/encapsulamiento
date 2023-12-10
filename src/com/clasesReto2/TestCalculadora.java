package com.clasesReto2;

public class TestCalculadora {
    public static void main(String[] args) {
        Calculadora calcu = new Calculadora();
        
        calcu.setValor1(10);
        calcu.setValor2(7);
        calcu.setValor3(4); 

        double valor1 = calcu.getValor1();
        double valor2 = calcu.getValor2();
        double valor3 = calcu.getValor3();

        double resultadoSuma = calcu.sumar(valor1, valor2);
        double resultadoResta = calcu.restar(1, 2); 
        double resultadoMultiplicar = calcu.multiplicar(12, 2); 
        double resultadoDividir = calcu.dividir(120, 54); 
        double resultadoPromediar = calcu.promediar(valor1, valor2, valor3);

        System.out.println("El resultado de la suma es: " + resultadoSuma);
        System.out.println("El resultado de la resta es: " + resultadoResta);
        System.out.println("El resultado de la multiplicación es: " + resultadoMultiplicar);
        System.out.println("El resultado de la división es: " + resultadoDividir);
        System.out.println("El resultado del promedio es: " + resultadoPromediar);
        calcu.mostrarResultado();
    }
}
