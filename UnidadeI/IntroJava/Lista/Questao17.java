/*Duas cidades, A e B, têm populações de 7000 e 20000 habitantes, respectivamente. A
cidade A tem um crescimento populacional de 3, 5% ao ano, enquanto a população da
cidade B cresce 1% ao ano. Faça um programa que utilize laço(s) para calcular a 
quantidade de anos necessária para que a população da cidade A seja maior ou igual a população da cidade B. */
public class Questao17 {
    public static void main(String[] args) {
        double popA = 7000;
        double popB = 20000;
        int anos = 0;

        while (popA < popB) {
            popA *= 1.035;  // cresce 3,5%
            popB *= 1.01;   // cresce 1%
            anos++;
        }

        System.out.println("Serão necessários " + anos + " anos para que a população da cidade A seja maior ou igual à população da cidade B.");
    }
}
