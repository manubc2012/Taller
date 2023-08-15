/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller;

/**
 *
 * @author 503
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        int[] carbon = {13,80,60,44,88,67,10,33,49,50,71,55};
        
        int total=0;
        
        for(int i=0; i<carbon.length; i++){
            total=total+carbon[i];
        }
        double promedio=total/carbon.length;
        
        System.out.println("Se hicieron en total "+ total+ " toneladas de carbon");
        System.out.println("Y hubo un promedio de " + promedio);
    }
}
