/* Escreva um programa que determine quais são todos os números de 3 algarismos cuja
soma dos cubos de seus algarismos sejam iguais ao próprio número.*/
public class Questao16 {
    public static void main(String[] args) {
        System.out.println("Números de 3 algarismos cuja soma dos cubos dos algarismos é igual ao próprio número:");

        for (int numero = 100; numero <= 999; numero++) {
            
            // Separa os dígitos
            int centena = numero / 100;
            int dezena = (numero / 10) % 10;
            int unidade = numero % 10;

            // Soma dos cubos dos dígitos
            int somaCubos = (int)(Math.pow(centena, 3) + Math.pow(dezena, 3) + Math.pow(unidade, 3));

            // Verifica se a soma dos cubos é igual ao número original
            if (somaCubos == numero) {
                System.out.println(numero);
            }
        }
    }
}