/* Escreva um programa que lê um número que representa o valor da carta, de um (ás) a
treze (rei), e outro número correspondente ao naipe (1 = ouros, 2 = paus, 3 = copas e 4 =
espadas). O programa deve imprimir o nome da carta por extenso.*/
package POO.UnidadeI.IntroJava.Lista;

import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {
        int num, naipe;
        Scanner leitor = new Scanner(System.in);

        System.out.print("Valor da carta: ");
        num = leitor.nextInt();

        System.out.print("Naipe: ");
        naipe = leitor.nextInt();
        
        switch (naipe) {
            case 1:
                System.out.printf("Sua carta é %d de ouros", num);
                break;
            case 2: 
                System.out.printf("Sua carta é %d de paus", num);
                break;
            case 3: 
                System.out.printf("Sua carta é %d de copas", num);
                break;
            case 4: 
                System.out.printf("Sua carta é %d de espadas", num);
                break;
            default:
                System.out.print("naipe inválido");
                break;
        }

        leitor.close();
    }
}
