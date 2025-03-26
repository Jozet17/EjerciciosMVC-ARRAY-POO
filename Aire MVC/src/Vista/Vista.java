/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;
import Modelo.Modelo;

public class Vista {

    public void mostrarEstadoAire(Modelo modelo) {
        if (modelo.isEncendido()) {
            System.out.println("Aire acondicionado encendido.");
        } else {
            System.out.println("Aire acondicionado apagado.");
        }
    }

    public void mostrarOpciones() {
        System.out.println("¿Desea continuar con el proceso? (s/n) xd");
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}

