/*Escreva uma função que calcule o fatorial de forma recursiva. Para cada chamada recursiva, 
exiba as saídas em uma linha separada e adicione um nível de recuo (tabulação).
Faça o melhor que você puder para tornar a saída limpa, interessante e significativa. Seu
objetivo aqui é projetar e implementar um formato de saída que facilite o entendimento
da recursão. */
public class Questao19 {

    public static void main(String[] args) {
        int n = 5;
        fatorialFormatado(n, 0);  // Começa a recursão com o nível de recuo igual a 0
    }

    // Função recursiva que calcula e exibe o fatorial com recuo
    public static int fatorialFormatado(int n, int nivel) {
        int resultado;

        // Caso base
        if (n == 0) {
            imprimirComRecuo(nivel, "0! = 1");
            return 1;
        }

        // Chamada recursiva
        int fatAnterior = fatorialFormatado(n - 1, nivel + 1);
        resultado = n * fatAnterior;

        // Impressão com tabulação proporcional ao nível da recursão
        imprimirComRecuo(nivel, n + "! = " + resultado);

        return resultado;
    }

    // Função auxiliar para imprimir com recuo (sem arrays)
    public static void imprimirComRecuo(int nivel, String mensagem) {
        for (int i = 0; i < nivel; i++) {
            System.out.print("    "); // 4 espaços por nível
        }
        System.out.println(mensagem);
    }
}
