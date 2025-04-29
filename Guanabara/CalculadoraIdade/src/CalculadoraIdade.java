import java.time.Year;
import java.util.Scanner;
public  class CalculadoraIdade {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite seu ano de nascimento: ");
        int ano = teclado.nextInt();
        
         int anoAtual = Year.now().getValue(); // obtém o ano atual
        int idade = anoAtual - ano;
        System.out.println("Sua idade é " + idade + " anos");

        teclado.close();
    }
}