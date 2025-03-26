/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modelo;

public class Modelo {

    public void procesarFizzBuzz(String[] resultado) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                resultado[i - 1] = "FizzBuzz";
            } else if (i % 3 == 0) {
                resultado[i - 1] = "Fizz";
            } else if (i % 5 == 0) {
                resultado[i - 1] = "Buzz";
            } else {
                resultado[i - 1] = String.valueOf(i);
            }
        }
    }
}
    


