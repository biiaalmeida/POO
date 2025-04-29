/*Escreva um programa que recebe o nome de uma pessoa e deseja a ela as boas vindas mencionando seu nome*/
package POO.UnidadeI.IntroJava;
import java.util.Scanner;

public class BoasVindas {
    public static void main (String[] Args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = input.next();

        System.out.println("Seja bem vindo(a) " + nome + " :)");

        input.close(); //não esquecer!
    }
}
