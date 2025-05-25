/*7. Escreva um programa que lê três números e determina qual número é o menor.*/
import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args){
        int num1, num2, num3, menor;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Numero 1: ");
        num1 = leitor.nextInt();
        System.out.print("Numero 2: ");
        num2 = leitor.nextInt();
        System.out.print("Numero 3: ");
        num3 = leitor.nextInt();

        menor = num1;

        if (num2<menor) menor = num2;
        if (num3<menor) menor = num3;
        
        System.out.print("O menor número entre " + num1 + ", " + num2 + " e " + num3 + " é " + menor);

        leitor.close();

    }
}
