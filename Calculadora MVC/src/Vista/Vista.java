/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;
import java.util.ArrayList;
import java.util.Scanner;

public class Vista {
    private Scanner scanner;

    public Vista() {
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        System.out.println("Por favor, seleccione el proceso que desea realizar:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
    }

    public double obtenerNumero(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextDouble();
    }

    public String obtenerOperacion() {
        return scanner.next().toLowerCase();
    }

    public void mostrarResultado(double resultado) {
        System.out.println("El resultado es: " + resultado);
    }

    public void MostrarHistorialOperaciones(ArrayList<String> historial) {
        System.out.println("Historial de operaciones:");
        for (String operacion : historial) {
            System.out.println(operacion);
        }
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}

