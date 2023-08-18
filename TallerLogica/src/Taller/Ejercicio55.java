/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller;

import java.util.Scanner;

/**
 *
 * @author 507
 */
public class Ejercicio55 {

    static Scanner sc = new Scanner(System.in);
    static Scanner sc2 = new Scanner(System.in);
    static double saldo = 300000;
    static int clave = 1234;

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        boolean salir = true;
        do {
            System.out.println("Eliga que opcion quiere \n1.Consultar saldo \n 2.Transferencia \n 3.Cambiar clave \n 4.Bloquear producto \n 5.Realizar donación \n 6.Salir");
            int opc = sc.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Usted ha elegido consultar su saldo \n Su saldo actual es de " + saldo);
                    break;
                case 2:
                    double res = transferencia();
                    if (res == 0) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        System.out.println("Usted ha elegido tranferir su saldo queda en " + res);
                    }
                    break;
                case 3:
                    System.out.println("Usted va a cambiar la clave");
                    int clave3 = sc.nextInt();
                    if (clave3 == clave) {
                        int pass = cambioClave();
                    }

                    if (pass == 0) {
                        System.out.println("Ingrese bien los datos");
                    } else {
                        System.out.println("Su clave ha sido cambiada");
                    }
                    break;
                case 4:
                    System.out.println("Usted va a bloquear su producto, ingrese la clave para continuar o 0 para cancelar");
                    int bloquear = sc.nextInt();
                    if (bloquear == 0) {
                        System.out.println("Ha cancelado el bloqueo de su cuenta");
                    } else if (bloquear == clave) {
                        System.out.println("Usted acaba de bloquear su cuenta y va a salir del sistema");
                        salir = false;
                    } else {
                        System.out.println("Ingrese una opcion valida");
                    }
                    break;
                case 5:
                    System.out.println("Va a realizar una donacion");
                    double donacion = donar();
                    if (donacion == 0) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        System.out.println("Usted ha realizado una donacion su saldo actual es de " + saldo);
                    }
                    break;
                case 6:
                    System.out.println("Usted ha elegido salir");
                    salir = false;
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
            }
        } while (salir != false);
    }

    public static double transferencia() {
        System.out.println("Cuanto dinero desea transferir, escribalo sin comas y puntos");
        double trans = sc2.nextDouble();
        if (saldo > trans) {
            saldo -= trans;
            return saldo;
        } else {
            return 0;
        }

    }

    public static int cambioClave() {
        System.out.println("Ingrese la clave nueva");
        int clave2 = sc.nextInt();
        if (clave != clave2) {
            clave = clave2;
            return clave;
        } else {
            return 0;
        }
    }

    public static double donar() {
        System.out.println("Escriba de cuantio desea hacer la donación sin puntos ni comas");
        double donacion2 = sc2.nextDouble();
        if (saldo > donacion2) {
            saldo -= donacion2;
            return saldo;
        } else {
            return 0;
        }

    }
}
