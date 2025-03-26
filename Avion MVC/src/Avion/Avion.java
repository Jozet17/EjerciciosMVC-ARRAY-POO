/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Avion;

import Controlador.Controlador;
import Modelo.Modelo;
import Vista.Vista;

public class Avion {
    public static void main(String[] args) {
        Modelo avion = new Modelo("Boeing A001", 5);
        Vista vista = new Vista();
        Controlador controlador = new Controlador(avion, vista);

        // Iniciar la interacción
        controlador.iniciar();
    }
}


