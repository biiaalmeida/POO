package POO.UnidadeI.IntroJava.Lista;
import java.util.Scanner;
public class Questao4 {
    public static void main(String[] args){
        float celsius, fahrenheit;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Graus(em celsius): ");
        celsius = leitor.nextFloat();

        fahrenheit = (celsius * 9/5)+32;

        System.out.print("Graus(em Fahrenheit): " + fahrenheit);

        leitor.close();
    }
}
