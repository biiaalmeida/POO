/*39. Escreva uma classe para representar um número complexo. Essa classe deve conter
três construtores. Um construtor deverá receber os dois valores (parte real e parte imaginária) 
como argumentos, o outro somente o valor real, considerando o imaginário como
sendo zero, e o terceiro construtor não recebe argumentos, considerando as partes real e
imaginária do número complexo como sendo iguais a zero. Escreva um método toString
que apresente o número complexo em notação apropriada (ex.: 2 + 4i) e o use em um
aplicativo de teste que demonstre as capacidades da classe criada. */
package POO.UnidadeI.Classes.Lista.Parte2.Questao39;

public class Complexo {
    private double parteReal;
    private double parteImaginaria;

    public Complexo(double parteReal, double parteImaginaria){
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }

    public Complexo(double parteReal){
        this.parteReal = parteReal;
        parteImaginaria = 0;
    }

    public Complexo(){
        parteReal = 0;
        parteImaginaria = 0;
    }

    public String toString() {
        if (parteImaginaria == 0) {
            return String.format("%.2f", parteReal);
        } else if (parteReal == 0) {
            return String.format("%.2fi", parteImaginaria);
        } else if (parteImaginaria > 0) {
            return String.format("%.2f + %.2fi", parteReal, parteImaginaria);
        } else {
            return String.format("%.2f - %.2fi", parteReal, -parteImaginaria);
        }
    }
}