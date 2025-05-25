/*14. Escreva um programa que apresente a série de Fibonacci até o n-ézimo termo. Assuma
que n > 0. */
import java.util.Scanner;

public class Questao14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de n (n > 0): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Por favor, insira um número maior que zero.");
        } else {
            System.out.println("Série de Fibonacci até o " + n + "º termo:");
        }    
            
        int primeiro = 0;  // Primeiro termo da sequência de Fibonacci
        int segundo = 1;   // Segundo termo da sequência de Fibonacci

        // Laço que irá imprimir os n primeiros termos da sequência
        for (int i = 1; i <= n; i++) {
            System.out.print(primeiro + " ");  // Imprime o termo atual da sequência

            int proximo = primeiro + segundo;  // Calcula o próximo termo da sequência
            primeiro = segundo;                // Atualiza o "primeiro" para o próximo laço
            segundo = proximo;                 // Atualiza o "segundo" com o novo valor calculado

        }    
        scanner.close();
    }
}

