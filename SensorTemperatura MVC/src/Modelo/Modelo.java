/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.util.Random;

public class Modelo {
    private Random random;

    public Modelo() {
        random = new Random();
    }

    public double leerTemperatura() {
        return random.nextDouble() * 40;  
    }
}

