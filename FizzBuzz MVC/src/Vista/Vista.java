/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.util.Arrays;

public class Vista {

    public void imprimirdato() {
        System.out.println("Iniciando.");
    }

    // Mostrar el resultado final
    public void mostrardato(String[] resultado) {
        System.out.println("Resultado:");
        for (String s : resultado) {
            System.out.print(s + " ");
        }
        System.out.println(); 
    }
}

