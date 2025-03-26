/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aire;
import Controlador.Controlador;
import Modelo.Modelo;
import Vista.Vista;

public class Aire {

    public static void main(String[] args) {
        Modelo modelo = new Modelo(5);
        Vista vista = new Vista();
        Controlador controlador = new Controlador(modelo, vista);
        controlador.iniciar();
    }
}
