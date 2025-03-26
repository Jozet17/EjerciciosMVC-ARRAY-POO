package Controlador;

import Modelo.Modelo;
import Vista.Vista;

public class Controlador {
    private Modelo modelo;
    private Vista vista;

    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciar() {
        while (modelo.hayAsientosDisponibles()) {
            vista.mostrarVuelosDisponibles(modelo);

            int numeroAsiento = vista.seleccionarAsiento();

            if (modelo.reservarAsiento(numeroAsiento)) {
                vista.mostrarMensaje("Reserva exitosa en el asiento " + (numeroAsiento + 1));
            } else {
                vista.mostrarMensaje("El asiento ya está ocupado o no existe. Por favor selecciona otro.");
            }
        }
        vista.mostrarMensaje("No hay más asientos disponibles.");
    }
}
