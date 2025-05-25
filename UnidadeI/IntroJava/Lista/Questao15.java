public class Questao15 {
    public static void main(String[] args) {
        int numero = 1;         // Começa testando a partir do número 1
        int contador = 0;       // Conta quantos números perfeitos já foram encontrados

        System.out.println("Os 4 primeiros números perfeitos são:");

        while (contador < 4) {  // Continua até encontrar 4 números perfeitos
            
            int soma = 0;

            // Soma os divisores próprios de 'numero'
            for (int i = 1; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    soma += i;  // i é divisor de 'numero'
                }
            }

            // Verifica se a soma dos divisores é igual ao número
            if (soma == numero) {
                System.out.println(numero);  // Imprime o número perfeito
                contador++;                  // Incrementa o número de perfeitos encontrados
            }

            numero++;  // Vai para o próximo número
        }
    }
}

