import java.util.Scanner;

public class PolinomioRecursivo {

    // Função recursiva para calcular Pn(x)
    public static int calcularPolinomio(int[] coeficientes, int n, int x) {
        if (n == 0) {
            return coeficientes[0];
        }
        return x * calcularPolinomio(coeficientes, n - 1, x) + coeficientes[n];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o grau do polinômio
        System.out.print("Digite o grau do polinômio (n): ");
        int n = scanner.nextInt();

        // Cria array para armazenar os coeficientes a0 até an
        int[] coeficientes = new int[n + 1];

        System.out.println("Digite os coeficientes a0 até a" + n + ":");
        for (int i = 0; i <= n; i++) {
            System.out.print("a" + i + ": ");
            coeficientes[i] = scanner.nextInt();
        }

        // Solicita o valor de x
        System.out.print("Digite o valor de x: ");
        int x = scanner.nextInt();

        // Calcula o valor do polinômio
        int resultado = calcularPolinomio(coeficientes, n, x);

        // Exibe o resultado
        System.out.println("O valor de P_" + n + "(" + x + ") é: " + resultado);

        scanner.close();
    }
}
