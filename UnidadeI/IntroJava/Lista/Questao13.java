/*13. Escreva um programa para imprimir uma versão aproximada de um cartão da Mega-Sena
(somente com os números, respeitando o número de linhas e a distribuição dos números
nas linhas). */
package POO.UnidadeI.IntroJava.Lista;

public class Questao13 {
    public static void main(String[] args) {
        int numeroInicial = 1;
        int numeroFinal = 60;
        int numerosPorLinha = 10; 

        System.out.println("Cartão da Mega-Sena");

        //matriz 6x10
        for (int i = numeroInicial; i <= numeroFinal; i += numerosPorLinha) {
            for (int j = 0; j < numerosPorLinha; j++) {
                int numero = i + j;
                System.out.printf("%2d ", numero);
            }
            System.out.println(); 
        }
    }
}
