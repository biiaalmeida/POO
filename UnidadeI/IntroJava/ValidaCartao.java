package POO.UnidadeI.IntroJava;

import java.util.Calendar;
import java.util.Scanner;

public class ValidaCartao {
    public static void main (String[] Args){
        
        String nome, numero, codigo;
        int mes, ano, mesAtual, anoAtual;
        boolean invalido;
        Scanner leitor = new Scanner(System.in);
        Calendar calendario = Calendar.getInstance();

        mesAtual = calendario.get(Calendar.MONTH)+1;
        anoAtual = calendario.get(Calendar.YEAR);

        System.out.print("Nome: ");
        nome = leitor.nextLine();
        System.out.print("Numero: ");
        numero = leitor.nextLine();
        System.out.print("Codigo: ");
        codigo = leitor.nextLine();
        do {
            System.out.print("Mes: ");
            mes = leitor.nextInt();
            System.out.print("Ano: ");
            ano = leitor.nextInt();
            invalido = (ano<anoAtual || (ano==anoAtual && mes<mesAtual));

            if (invalido) System.out.println("Cartao invalido. Insira os dadas novamente");

        } while (invalido);

        System.out.println("O cartao foi validado");
       
        leitor.close();
    }
}
