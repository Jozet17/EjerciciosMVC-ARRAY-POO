/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Modelo;
import Vista.Vista;

import java.util.Scanner;

public class Controlador {
    private Modelo modelo;
    private Vista vista;
    private Scanner scanner;

    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        boolean noche = true;  
        while (true) {
            int detecciones = modelo.contarDetecciones();

            if (noche && detecciones >= 2) {
                modelo.activarAlarma();
            } else {
                modelo.desactivarAlarma();
            }

            vista.mostrarEstadoAlarma(modelo);

            // Mostrar las opciones
            vista.mostrarOpciones();
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    modelo.activarAlarma();
                    break;
                case 2:
                    modelo.desactivarAlarma();
                    break;
                case 3:
                    scanner.close();
                    return;
                default:
                    vista.mostrarMensaje("Opción no válida.");
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}




