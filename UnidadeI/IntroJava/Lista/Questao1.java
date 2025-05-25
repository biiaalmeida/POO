/*1. Escreva um programa que calcule a área de um quadrado. 
O valor do lado de um quadrado deverá ser informado pelo usuário. */

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
       Scanner leitor = new Scanner(System.in);

       float num, area;

       System.out.print("Lado do quadrado: ");
       num = leitor.nextFloat();

       area = num * num;
       
       System.out.print("Área: " + area);
       
       leitor.close();
    }
}

