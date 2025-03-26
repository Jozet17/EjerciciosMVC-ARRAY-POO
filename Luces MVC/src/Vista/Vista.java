/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;
import Modelo.Modelo;

public class Vista {

    public void MostrarEstadoLuces(Modelo modelo) {
        if (modelo.isLucesPrendidas()) {
            System.out.println("Las luces están Prendidas.");
        } else {
            System.out.println("Las luces están Apagadas.");
        }
    }

    public void MostrarOpciones() {
        System.out.println("1. Encender luces");
        System.out.println("2. Apagar luces");
        System.out.println("3. Salir");
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}

