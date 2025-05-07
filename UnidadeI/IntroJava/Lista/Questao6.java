/*Escreva um programa que recebe um valor inteiro representando um intervalo em minutos
e imprime o equivalente a esse período expresso em valores inteiros para dias, horas e
minutos. Ex.: 9257 minutos = 6 dias, 10 horas e 17 minutos.*/
package POO.UnidadeI.IntroJava.Lista;
import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args){
        int entrada, dias, restoMinutos, horas, minutos;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Escreva um intervalo em minutos: ");
        entrada = leitor.nextInt();

        dias = entrada / (24 * 60); //1  dia tem 24 horas (24*60 min)
        restoMinutos = entrada % (24 * 60); //pegar o resto dos minutos pra converter isso em horas e minutos
        horas = restoMinutos/60;
        minutos = restoMinutos%60; 

        System.out.printf("%d minutos = %d dias, %d horas e %d minutos%n",entrada, dias, horas, minutos);

        leitor.close();
        
    }
}
