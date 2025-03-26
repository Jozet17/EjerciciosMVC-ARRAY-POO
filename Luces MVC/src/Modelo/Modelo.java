/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.util.ArrayList;
import java.util.Random;

public class Modelo {
    private ArrayList<Boolean> sensores; 
    private boolean lucesPrendidas;

    public Modelo(int cantidadSensores) {
        this.sensores = new ArrayList<>();
        this.lucesPrendidas = false;

        for (int i = 0; i < cantidadSensores; i++) {
            sensores.add(new Random().nextBoolean());
        }
    }

    public boolean isLucesPrendidas() {
        return lucesPrendidas;
    }

    public void encenderLuces() {
        lucesPrendidas = true;
    }

    public void apagarLuces() {
        lucesPrendidas = false;
    }

    public int contarSensoresActivos() {
        int sensoresActivos = 0;
        for (Boolean sensor : sensores) {
            if (sensor) {
                sensoresActivos++;
            }
        }
        return sensoresActivos;
    }

    public ArrayList<Boolean> getSensores() {
        return sensores;
    }
}

