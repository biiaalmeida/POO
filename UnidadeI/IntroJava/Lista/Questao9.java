/* Escreva um programa que lê um número que representa o valor da carta, de um (ás) a
treze (rei), e outro número correspondente ao naipe (1 = ouros, 2 = paus, 3 = copas e 4 =
espadas). O programa deve imprimir o nome da carta por extenso.*/
import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {
        int num, naipe;
        String nomeCarta;
        
        Scanner leitor = new Scanner(System.in);

        System.out.print("Valor da carta: ");
        num = leitor.nextInt();

        System.out.print("1 = ouros, 2= paus, 3 = copas e 4 = espada");
        System.out.print("Naipe: ");
        naipe = leitor.nextInt();
        
        switch (num) {
            case 1:
                nomeCarta = "ás";
                break;
            case 11: 
                nomeCarta = "valete";
                break;
            case 12:
                nomeCarta = "dama";
                break;
            case 13: 
                nomeCarta = "rei";
                break;
            default:
                nomeCarta = String.valueOf(num); // Mantém o número como texto
                break;
        }
        
        switch (naipe) {
            case 1:
                System.out.printf("Sua carta é %s de ouros", nomeCarta);
                break;
            case 2: 
                System.out.printf("Sua carta é %s de paus", nomeCarta);
                break;
            case 3: 
                System.out.printf("Sua carta é %s de copas", nomeCarta);
                break;
            case 4: 
                System.out.printf("Sua carta é %s de espadas", nomeCarta);
                break;
            default:
                System.out.print("naipe inválido");
                break;
        }

        leitor.close();
    }
}
