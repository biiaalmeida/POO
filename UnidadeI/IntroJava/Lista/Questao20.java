/*20. Crie uma função recursiva mdc que retorna o máximo divisor comum de m e n. O mdc de
m e n é definido recursivamente como segue:
• se n > m, retorne mdc(n, m);
• se n = 0, retorne m;
• senão, retorne mdc(n, m%n), onde % é o operador de resto da divisão. */

public class Questao20 {

    public static void main(String[] args) {
        int m = 48;
        int n = 18;

        int resultado = mdc(m, n);

        System.out.println("MDC de " + m + " e " + n + " é: " + resultado);
    }

    public static int mdc(int m, int n) {

        if (n > m) {
            return mdc(n, m);  
        }

        if (n == 0) {
            return m;
        }
        return mdc(n, m % n);
    }
}