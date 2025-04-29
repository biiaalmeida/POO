package POO.UnidadeI.IntroJava;

import java.util.Scanner;

public class Distancia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double x1, y1, x2, y2;

        System.out.print("x1: ");
        x1 = entrada.nextDouble();

        System.out.print("y1: ");
        y1 = entrada.nextDouble();

        System.out.print("x2: ");
        x2 = entrada.nextDouble();

        System.out.print("y2: ");
        y2 = entrada.nextDouble();

        double dist = Math.sqrt(Math.pow(x1 - x2, 2.0) + Math.pow(y1 - y2, 2.0));

        System.out.println("Distancia entre (" + x1 + "," + y1 + ") e (" + x2 + "," + y2 + ") é " + dist);

        entrada.close();
        
    }
}
