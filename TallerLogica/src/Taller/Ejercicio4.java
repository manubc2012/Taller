/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller;
import java.util.Scanner;
/**
 *
 * @author 503
 */
public class Ejercicio4 {
      static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Ingrese la cantidad de vehiculos que vendio este mes querido vendedor");
        int cantidadVehiculos = sc.nextInt();
        int contador1=0;
        int contador2=0;
        int contador3=0;
        double totalCondicion1=0;
        double totalCondicion2=0;
        double totalCondicion3=0;
        double totalVentas=0;
        SistemaComisiones:
        for (int i=1; i<=cantidadVehiculos; i++){
            System.out.println("Ingrese el precio del vehiculo =>"+ ("N" + i));
            double precioUnidad = sc.nextDouble();
            if (precioUnidad<=100000 && precioUnidad>0){
                contador1++;
                totalCondicion1+= precioUnidad;
            } else if (precioUnidad>100000 && precioUnidad<=250000){
                contador2++;
                totalCondicion2+=precioUnidad;
            } else if (precioUnidad>250000){
                contador3++;
                totalCondicion3+=precioUnidad;
            } else{
                System.out.println("Ingrese un precio valido");
                break SistemaComisiones;
            }
        }
        totalVentas=totalCondicion1+totalCondicion2+totalCondicion3;
        double comisionCondicion1= totalCondicion1*0.015;
        double comisionCondicion2= totalCondicion1*0.018;
        double comisionCondicion3= totalCondicion1*0.023;
        double totalComisiones= (comisionCondicion1+comisionCondicion2+comisionCondicion3);
        System.out.println("Querido vendedor, en este mes usted vendio => " + cantidadVehiculos+ "\n" +
                "Dando así unas ventas totales de => "+ totalVentas + "\n" +
                "Su comision es en total => "+ totalComisiones);
    }
}
