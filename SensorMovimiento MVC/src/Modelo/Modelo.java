/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.Random;

public class Modelo {
    private ArrayList<SensorAlarma> sensores;
    private boolean alarmaActivada;  // Estado de la alarma

    public Modelo(int cantidadSensores) {
        this.sensores = new ArrayList<>();
        this.alarmaActivada = false;  // Por defecto, la alarma está desactivada

        for (int i = 0; i < cantidadSensores; i++) {
            sensores.add(new SensorAlarma());
        }
    }

    public ArrayList<SensorAlarma> getSensores() {
        return sensores;
    }

    public boolean AlarmaActivada() {
        return alarmaActivada;
    }

    public void activarAlarma() {
        alarmaActivada = true;
    }

    public void desactivarAlarma() {
        alarmaActivada = false;
    }

    public int contarDetecciones() {
        int detecciones = 0;
        for (SensorAlarma sensor : sensores) {
            if (sensor.detectarMovimiento()) {
                detecciones++;
            }
        }
        return detecciones;
    }
}



