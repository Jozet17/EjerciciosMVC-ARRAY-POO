/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Modelo;
import Vista.Vista;

public class Controlador {
    private Vista objvista;
    private Modelo objmodelo;

    public Controlador() {
        this.objvista = new Vista();
        this.objmodelo = new Modelo();
    }

    public void empezar() {
        String[] resultado = new String[100]; 

        objvista.imprimirdato();  
        objmodelo.procesarFizzBuzz(resultado); 

        objvista.mostrardato(resultado);
    }
}

