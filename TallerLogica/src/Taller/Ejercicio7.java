package Taller;

public class Ejercicio7{
      public static void main(String[] args) {
       int vida=5;
       int poder=0;
       int num=1;
       
        while (life != 0) {
            num=(int)(Math.random() *10);
            if (num == 3 ) {
                life--;
                System.out.println("Le quedan "+life + " vidas");
            }else{
                point++;
                System.out.println("Has ganado " + point);
            }
        }
    }
}
}
