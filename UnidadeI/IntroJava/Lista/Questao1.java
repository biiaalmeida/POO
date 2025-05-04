package POO.UnidadeI.IntroJava.Lista;

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

