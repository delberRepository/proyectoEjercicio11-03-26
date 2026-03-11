package com.cursospring.IFC0014_10_03_26HolaMundoSpringWeb.Service;

import org.springframework.stereotype.Service;

@Service
public class ServicioCalculadora {

    public static double sumar(int a, int b) {
        return a + b;
    }

    // Método para restar
    public static double restar(double a, double b) {
        return a - b;
    }

    // Método para multiplicar
    public static double multiplicar(double a, double b) {
        return a * b;
    }

    // Método para dividir
    public static double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir entre cero");
        }
        return a / b;


    }
}
