package Vista;

import Modelo.Modelo;
import java.util.Scanner;

public class Vista {
    private Scanner scanner;

    public Vista() {
        scanner = new Scanner(System.in);
    }

    public void mostrarVuelosDisponibles(Modelo avion) {
        System.out.println("Vuelo ID: " + avion.getId());
        avion.mostrarAsientosDisponibles();
    }

    public int seleccionarAsiento() {
        System.out.print("Selecciona el número de asiento que deseas reservar: ");
        return scanner.nextInt() - 1;  
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
