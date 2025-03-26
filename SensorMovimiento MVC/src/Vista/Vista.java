/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.Modelo;

public class Vista {

    public void mostrarEstadoAlarma(Modelo modelo) {
        System.out.println(modelo.AlarmaActivada() ? "¡Alerta, Alarma activada!" : "Alerta, Alarma desactivada.");
    }

    public void mostrarOpciones() {
        System.out.println("1. Activar alarma");
        System.out.println("2. Desactivar alarma");
        System.out.println("3. Salir");
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}




