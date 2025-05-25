/*13. Escreva um programa para imprimir uma versão aproximada de um cartão da Mega-Sena
(somente com os números, respeitando o número de linhas e a distribuição dos números
nas linhas). */
public class Questao13 {
    public static void main(String[] args) {

        System.out.println("Cartão da Mega-Sena");

        //matriz 6x10
        for (int i = 1; i <= 60 ; i += 10) {
            for (int j = 0; j < 10; j++) {
                int numero = i + j;
                System.out.printf("%2d ", numero);
            }
            System.out.println(); 
        }
    }
}
