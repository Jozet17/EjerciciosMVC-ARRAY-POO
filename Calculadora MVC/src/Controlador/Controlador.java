/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
        boolean seguir = true;
        while (seguir) {
            vista.mostrarMenu();

            String operacion = vista.obtenerOperacion();
            double num1 = vista.obtenerNumero("Ingrese el primer número: ");
            double num2 = vista.obtenerNumero("Ingrese el segundo número: ");

            double resultado = 0;
            switch (operacion) {
                case "suma":
                    resultado = modelo.sumar(num1, num2);
                    break;
                case "resta":
                    resultado = modelo.restar(num1, num2);
                    break;
                case "multiplicación":
                    resultado = modelo.multiplicar(num1, num2);
                    break;
                case "división":
                    resultado = modelo.dividir(num1, num2);
                    break;
                default:
                    vista.mostrarMensaje("Operación no válida. Intente de nuevo.");
                    continue;
            }

            vista.mostrarResultado(resultado);

            System.out.print("¿Desea realizar otra operación? (si/no): ");
            String respuesta = vista.obtenerOperacion();
            if (respuesta.equals("no")) {
                seguir = false;
            }

            // Mostrar el historial de operaciones
            vista.MostrarHistorialOperaciones(modelo.getHistorialOperaciones());
        }

        vista.mostrarMensaje("Gracias por usar la calculadora.");
    }
}

