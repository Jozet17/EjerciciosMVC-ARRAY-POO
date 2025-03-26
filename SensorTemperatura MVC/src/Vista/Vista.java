/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;
import java.util.ArrayList;

public class Vista {
    public void mostrarTemperatura(double temperatura) {
        System.out.println("Temperatura leída: " + temperatura + "°C");
    }

    public void mostrarResultado(double temperatura) {
        if (temperatura < 10) {
            System.out.println("Calefactor: Esta Activado");
            System.out.println("Ventilador: Esta Desactivado");
        } else if (temperatura > 25) {
            System.out.println("Calefactor: Esta Desactivado");
            System.out.println("Ventilador: Esta Activado");
        } else {
            System.out.println("Calefactor: Esta Desactivado");
            System.out.println("Ventilador: Esta Desactivado");
        }
    }

    public void MostrarHistorial(ArrayList<String> historial) {
        System.out.println("\nHistorial de temperaturas y resultados:");
        for (String entry : historial) {
            System.out.println(entry);
        }
    }
}

