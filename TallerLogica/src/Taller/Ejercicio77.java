/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller;

/**
 *
 * @author 507
 */
public class Ejercicio77 {

    public static void main(String[] args) {
        int vida = 5;
        int poder = 0;
        int num = 1;

        while (vida != 0) {
            num = (int) (Math.random() * 10);
            if (num == 3) {
                vida--;
                System.out.println("Le quedan " + vida + " vidas");
            } else if(num == 5) {
                poder++;
                System.out.println("Has ganado " + poder);
            }
        }
    }
}
