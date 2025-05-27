/*Crie uma função recursiva que verifique se um dado número é primo */
public class Questao21 {

    public static void main(String[] args) {
        int numero = 29;

        // Verifica se o número é primo
        if (ehPrimo(numero, 2)) {
            System.out.println(numero + " é primo.");
        } else {
            System.out.println(numero + " não é primo.");
        }
    }

    public static boolean ehPrimo(int n, int divisor) {
        // Números menores ou iguais a 1 não são primos
        if (n <= 1) {
            return false;
        }

        // Se o divisor chegou a n, então não foi encontrado divisor => é primo
        if (divisor == n) {
            return true;
        }

        // Se 'n' for divisível pelo divisor atual, não é primo
        if (n % divisor == 0) {
            return false;
        }

        // Chamada recursiva: tenta o próximo divisor
        return ehPrimo(n, divisor + 1);
    }
}
