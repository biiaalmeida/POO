/*12. O mês de fevereiro de 2015 começou em um domingo. Escreva um programa que, dado
o número de um dia do mês de fevereiro de 2015 (um valor entre 1 e 28), imprime o dia
da semana correspondente.
• Exemplo de entrada: 10
• Exemplo de saída: O dia 10 será uma terça-feira. */
package POO.UnidadeI.IntroJava.Lista;

import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        int dia, indice;
        Scanner leitor = new Scanner(System.in);

        String[] diasDaSemana = { "domingo", "segunda-feira", "terça-feira", "quarta-feira", "quinta-feira", "sexta-feira", "sábado" };

        System.out.print("Digite um dia de fevereiro de 2015 (1 a 28): ");
        dia = leitor.nextInt();

        if (dia < 1 || dia > 28) {
            System.out.println("Dia inválido! Fevereiro de 2015 tem apenas 28 dias.");
            leitor.close();
            return;
        }

        indice = (dia - 1) % 7;
        String diaDaSemana = diasDaSemana[indice];

        System.out.printf("O dia %d será uma %s.%n", dia, diaDaSemana);

        leitor.close();
    }
}