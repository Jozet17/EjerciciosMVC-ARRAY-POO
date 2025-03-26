/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.util.ArrayList;

public class Modelo {
    private ArrayList<String> historialOperaciones;

    public Modelo() {
        this.historialOperaciones = new ArrayList<>();
    }

    public double sumar(double a, double b) {
        double resultado = a + b;
        historialOperaciones.add("Suma: " + a + " + " + b + " = " + resultado);
        return resultado;
    }

    public double restar(double a, double b) {
        double resultado = a - b;
        historialOperaciones.add("Resta: " + a + " - " + b + " = " + resultado);
        return resultado;
    }

    public double multiplicar(double a, double b) {
        double resultado = a * b;
        historialOperaciones.add("Multiplicación: " + a + " * " + b + " = " + resultado);
        return resultado;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            historialOperaciones.add("Error: División por 0 no permitida.");
            return 0;
        }
        double resultado = a / b;
        historialOperaciones.add("División: " + a + " / " + b + " = " + resultado);
        return resultado;
    }

    public ArrayList<String> getHistorialOperaciones() {
        return historialOperaciones;
    }
}

