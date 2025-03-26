/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.Modelo;
import Vista.Vista;
import java.util.ArrayList;

public class Controlador {
    private Modelo modelo;
    private Vista vista;
    private ArrayList<String> historial;

    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.historial = new ArrayList<>();
    }

    public void iniciar() {
        for (int i = 0; i < 5; i++) {  
            double temperatura = modelo.leerTemperatura();
            vista.mostrarTemperatura(temperatura);
            vista.mostrarResultado(temperatura);

            String resultado = "Temperatura: " + temperatura + "°C - ";
            if (temperatura < 10) {
                resultado += "Calefactor Activado, Ventilador Desactivado";
            } else if (temperatura > 25) {
                resultado += "Calefactor Desactivado, Ventilador Activado";
            } else {
                resultado += "Ambos Desactivados";
            }

            historial.add(resultado); 

            try {
                Thread.sleep(5000);  
            } catch (InterruptedException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        vista.MostrarHistorial(historial);
    }
}
