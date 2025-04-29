package POO.Guanabara;
import java.util.Scanner;

public class SuperCalculadora{
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor: ");
        int num = entrada.nextInt();

        //Resto da divisão por 2
        int rest = num % 2;
        System.out.println("O resto da divisão é " + rest);

        //Elevado ao cubo
        double cubo = Math.pow(num, 3);
        System.out.println("O cubo é: " + cubo);
        
        //Raiz quadrada
        double rquadrada = Math.sqrt(num);
        System.out.println("A raiz quadrada é: " + rquadrada);
        
        //Raiz cúbica
        double rcubica = Math.cbrt(num);
        System.out.println("A raiz cubica é: " + rcubica);

        //Valor absoluto
        int absoluto = Math.abs(num);
        System.out.println("O valor absoluto é: " + absoluto);
        entrada.close();
    }
}