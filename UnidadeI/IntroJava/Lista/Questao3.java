/*Escreva um programa que receba um ângulo em graus e o converta para sua representação em radianos. 
Divulgue também seno, cosseno, tangente, cossecante, secante e cotangente do ângulo.*/

package POO.UnidadeI.IntroJava.Lista;
import java.util.Scanner; 

public class Questao3{
    public static void main (String[] args){
        double graus, radianos, sen, cos, tan;
        Scanner leitor = new Scanner (System.in);

        System.out.print("Angulo em graus: ");
        graus = leitor.nextDouble();

        radianos = Math.toRadians(graus);

        sen = Math.sin(radianos);
        cos = Math.cos(radianos);
        tan = Math.tan(radianos);

        Double sec = (cos!=0)? 1.0 / cos:null;
        Double cosec = (sen!=0)? 1.0 / sen:null;
        Double cot = (tan!=0)? 1.0 / tan: null;

        System.out.println(graus + "graus = " + radianos);
        System.out.printf("seno: %.4f%n", sen);
        System.out.printf("coseno: %.4f%n", cos);
        System.out.printf("tangente: %.4f%n", tan);
        System.out.printf("Cossecante: %s%n", (cosec!=null)? String.format("%.4f", cosec): "indefinido");
        System.out.printf("Secante: %s%n", (sec!=null)? String.format("%.4f", sec): "indefinido");
        System.out.printf("Cotangente: %s%n", (cot!=null)? String.format("%.4f", cot): "indefinido");

        leitor.close();
    }
}
