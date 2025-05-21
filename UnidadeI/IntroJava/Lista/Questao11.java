/*11. Escreva um programa que lê dois pontos no plano cartesiano com coordenadas x e y e
informa se o segundo ponto está acima, abaixo, à esquerda e/ou à direita do primeiro.*/
package POO.UnidadeI.IntroJava.Lista;

import java.util.Scanner;

public class Questao11 {
    public static void main (String[] args){
        float x1, x2, y1, y2;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Primeiro ponto");
        System.out.print("X: ");
        x1 = leitor.nextFloat();
        System.out.print("Y: ");
        y1 = leitor.nextFloat();

        System.out.println("Segundo ponto");
        System.out.print("X: ");
        x2 = leitor.nextFloat();
        System.out.print("Y: ");
        y2 = leitor.nextFloat();

        if (x1>x2) {
            System.out.printf("O ponto (%.2f, %.2f) está a esquerda do ponto (%.2f, %.2f) \n" , x2, y2, x1, x2); 
        } else if (x1<x2) {
            System.out.printf("O ponto (%.2f, %.2f) está a direita do ponto (%.2f, %.2f)\n", x2, y2, x1, x2);
        }

        if (y1>y2) {
            System.out.printf("O ponto (%.2f, %.2f) está abaixo do ponto (%.2f, %.2f)" , x2, y2, x1, x2); 
        } else if (y1<y2) {
            System.out.printf("O ponto (%.2f, %.2f) está acima do ponto (%.2f, %.2f)", x2, y2, x1, x2);
        }


        leitor.close();
    }
    
}
