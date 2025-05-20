/*5. Escreva um programa que receba um número de 3 dígitos no formato CDU (Centena,
Dezena e Unidade) e, utilizando operadores aritméticos, armazene cada dígito em uma
variável de tipo inteiro. Por fim, reescreva o número no formato UCD em outra variável
de tipo inteiro e o imprima. Exemplo: 123 deve ser reescrito como 312. */

package POO.UnidadeI.IntroJava.Lista;
import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Número de 3 dígitos (CDU): ");
        int numero = leitor.nextInt();

        int centena = numero / 100;
        int dezena = (numero % 100) / 10;
        int unidade = numero % 10;

        int ucd = unidade * 100 + centena * 10 + dezena;

        System.out.println("Número no formato UCD: " + ucd);

        leitor.close();
    }
}

