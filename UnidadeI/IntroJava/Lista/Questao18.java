/*Crie uma função recursiva potencia(base,expoente) que, quando chamada, retorna base^expoente
Por exemplo, potencia(3,4) deve ser implementado como 3 ∗ 3 ∗ 3 ∗ 3. (A saída é apenas
81 nesse exemplo)
Assuma que expoente é um inteiro maior ou igual a 1. */
public class Questao18 {
    
    // Função recursiva para calcular base^expoente
    public static int potencia(int base, int expoente) {
        if (expoente == 1) {
            return base;  // Caso base
        } else {
            return base * potencia(base, expoente - 1);  // Passo recursivo
        }
    }

    public static void main(String[] args) {
        int resultado = potencia(3, 4);  // Deve retornar 81
        System.out.println("3 elevado a 4 é: " + resultado);
    }
}
