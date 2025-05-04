package POO.UnidadeI.IntroJava.Codigos;

import java.util.Scanner;

public class Questao2{
    public static void main (String[] args){
        float num1, num2, num3, soma, media;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Numero 1: ");
        num1 = leitor.nextFloat();
        System.out.print("Numero 2: ");
        num2 = leitor.nextFloat();
        System.out.print("Numero 3: ");
        num3 = leitor.nextFloat();

        soma = num1 + num2 + num3;
        media = soma/3;

        System.out.print("a soma de " + num1 + ", " + num2 + " e " + num3 + " é " + soma + " e a media desses valores é " + media);

        leitor.close();
    }
}