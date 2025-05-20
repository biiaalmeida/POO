/*8. Para alavancar as vendas, uma loja resolveu fazer a seguinte promoção relâmpago em
dois setores:
• No setor de Eletros, que possui código 222, todas as peças que custam mais de R$
500 vão ter 10% de desconto.
• No setor de Cama, mesa e banho, que possui código 111, peças com valor acima
de R$ 100 vão ter 40% de desconto, peças que custam entre R$ 50 e R$ 100 vão ter
20% de desconto e peças abaixo de R$ 50 vão ter 10% de desconto.
Escreva um programa que recebe do usuário o código do setor da loja e o valor original de
um produto e imprime na tela o nome do setor e o valor do produto com desconto. Caso
o usuário forneça um código diferente de 111 ou 222, exiba a mensagem Setor Invalido.*/

package POO.UnidadeI.IntroJava.Lista;

import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int codigo;
        double valor, valorFinal;

        System.out.print("Digite o código do setor: ");
        codigo = leitor.nextInt();

        switch (codigo) {
            case 222:
                System.out.println("Setor: Eletros");

                System.out.print("Digite o valor do produto: R$ ");
                valor = leitor.nextDouble();

                if (valor > 500) {
                    valorFinal = valor * 0.90; //10% de desconto
                    System.out.printf("Desconto de 10%% aplicado. Valor final: R$ %.2f%n", valorFinal);
                } else {
                    System.out.printf("Sem desconto. Valor final: R$ %.2f%n", valor);
                }
                break;
            
            case 111:
                System.out.println("Setor: Cama, mesa e banho");

                System.out.print("Digite o valor do produto: R$ ");
                valor = leitor.nextDouble();

                if (valor > 100) {
                    valorFinal = valor * 0.60; // 40% de desconto
                    System.out.print("Você recebeu 40% de desconto");
                } else if (valor >= 50) {
                    valorFinal = valor * 0.80; // 20% de desconto
                    System.out.print("Você recebeu 20% de desconto");
                } else {
                    valorFinal = valor * 0.90; // 10% de desconto
                    System.out.print("Você recebeu 10% de desconto");
                }
                System.out.printf("\nValor final: R$ %.2f%n", valorFinal);
                break;
            
            default:
                System.out.println("Setor inválido.");
                break;
        }
            
        leitor.close();
    }

}

