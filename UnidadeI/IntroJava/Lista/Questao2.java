/*2. Escreva um programa que calcule a soma e a média aritmética de 3 números. 
Os 3 valores reais serão informados pelo usuário. */
import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        float num1, num2, num3, soma, media;

        System.out.print("Numero 1: ");
        num1 = leitor.nextFloat();
        System.out.print("Numero 2: ");
        num2 = leitor.nextFloat();
        System.out.print("Numero 3: ");
        num3 = leitor.nextFloat();

        soma = (num1 + num2 + num3);

        media = soma/3;

        System.out.print("A soma de " + num1 + ", " + num2 + " e " + num3 + " é " + soma);
        System.out.print("A média de " + num1 + ", " + num2 + " e " + num3 + " é " + media);

        leitor.close();
    }
}
