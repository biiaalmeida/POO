package POO.UnidadeI.IntroJava.Lista;
import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Número de 3 dígitos (CDU): ");
        int numero = leitor.nextInt();

        int centena = numero / 100;
        int dezena = (numero % 100) / 10;
        int unidade = numero % 10;

        int ucd = unidade * 100 + centena * 10 + dezena;

        System.out.println("Número no formato UCD: " + ucd);

        leitor.close();
    }
}

