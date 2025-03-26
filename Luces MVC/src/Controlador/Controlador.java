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
        while (true) {
            boolean lucesPrendidas = false;

            if (modelo.contarSensoresActivos() > 0) {
                lucesPrendidas = true; 
            }

            if (lucesPrendidas) {
                modelo.encenderLuces();
            } else {
                modelo.apagarLuces();
            }

            vista.MostrarEstadoLuces(modelo);
            vista.MostrarOpciones();
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    modelo.encenderLuces();
                    break;
                case 2:
                    modelo.apagarLuces();
                    break;
                case 3:
                    scanner.close();
                    return;
                default:
                    vista.mostrarMensaje("Opción no válida.");
            }

            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
            }
        }
    }
}

