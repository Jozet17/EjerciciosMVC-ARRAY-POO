/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.util.ArrayList;
import java.util.Random;

public class Modelo {
    private boolean encendido;
    private ArrayList<Double> temperaturas;
    private ArrayList<Double> humedades;

    public Modelo(int cantidadSensores) {
        temperaturas = new ArrayList<>();
        humedades = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < cantidadSensores; i++) {
            temperaturas.add(20 + random.nextDouble() * 20); 
            humedades.add(random.nextDouble() * 100); 
        }
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void verificarEstado() {
        for (int i = 0; i < temperaturas.size(); i++) {
            double temperatura = temperaturas.get(i);
            double humedad = humedades.get(i);
            encendido = (temperatura > 28 && humedad > 60) || (temperatura > 30);
            if (encendido) break; 
        }
    }

    public ArrayList<Double> getTemperaturas() {
        return temperaturas;
    }

    public ArrayList<Double> getHumedades() {
        return humedades;
    }
}

