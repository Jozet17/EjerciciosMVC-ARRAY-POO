/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Luces;
import Controlador.Controlador;
import Modelo.Modelo;
import Vista.Vista;

public class Luces {

    public static void main(String[] args) {
        Modelo modelo = new Modelo(3);
        Vista vista = new Vista();
        Controlador controlador = new Controlador(modelo, vista);
        controlador.iniciar();
    }
}

