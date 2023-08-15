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
public class Ejercicio2 {
    public static void main(String[] args) {
        //SEUDOCODIGO
        //INGRESAR LA BASE
        //INGRESAR LA ALTURA
        //REALIZAR OPERACION DEL AREA
        //REALIZAR OPERACION DEL PERIMETRO
        //IMPRIMIR AREA Y PERIMETRO
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Ingree la altura del rectangulo");
        double altura=sc.nextDouble();
        System.out.println("Ingree la base del rectangulo");
        double base=sc.nextDouble();
        
        double area=CalcularArea(altura, base);
        System.out.println("El area del rectangulo es " + area);
        double perimetro=CalcularPerimetro(altura, base);
        System.out.println("El perimetro del rectangulo es " + perimetro);
        
    }
    
    public static double CalcularArea(double altura, double base){
        return base*altura;
    }
    
        public static double CalcularPerimetro(double altura, double base){
            return (base*2) + (altura*2);
        }
    
}
