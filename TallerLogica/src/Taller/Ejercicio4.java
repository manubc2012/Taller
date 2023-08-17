package Taller;
import java.util.Scanner;

public class Ejercicio4{
  static Scanner sc= new Scanner(System.in);
  static Scanner sc2=new Scanner(System.in);
  static double saldo=300000;
     public static void main(String[] args) {
       menu();
     }
  public static void menu(){
   double deposito;
        boolean salir = true;
        do {
            System.out.println("Eliga que opcion quiere \n1.Consultar saldo \n 2.Transferencia \n 3.Depositar dinero \n 4.Salir");
            int opc = sc.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Usted ha elegido consultar su saldo \n Su saldo actual es de " + saldo);
                    break;
                case 2:
                    double res=transferencia();
                    if (res==0){
                        System.out.println("Saldo insuficiente");
                    }else{
                        System.out.println("Usted ha elegido tranferir "+ " su saldo queda en " + res);
                    }
                    break;
                case 3:
                    System.out.println("Cuanto dinero desea depositar, escribalo sin puntos y comas");
                    deposito = sc.nextDouble();
                    System.out.println("Su nuevo saldo es " + depositar(deposito));
                    break;
                case 4:
                    System.out.println("Usted ha elegido salir");
                    salir = false;
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
            }
        } while (salir != false );

public static double transferencia(){
   System.out,println("Cuanto dinero desea transferir ")

}
    
    }
  
  
  
}
