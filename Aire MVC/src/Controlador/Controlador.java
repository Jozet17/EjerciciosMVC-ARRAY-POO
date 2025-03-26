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
        boolean continuar = true;
        while (continuar) {
            modelo.verificarEstado();
            vista.mostrarEstadoAire(modelo); 

            vista.mostrarOpciones();
            char opc = scanner.next().toLowerCase().charAt(0);
            continuar = (opc == 's');

            if (!continuar) {
                vista.mostrarMensaje("Simulación finalizada.");
            }
        }

        scanner.close();
    }
}
