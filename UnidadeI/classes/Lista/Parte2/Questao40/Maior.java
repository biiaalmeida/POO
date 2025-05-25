/* 40. Escreva uma classe que contenha métodos estáticos para retornar o maior de dois, três,
quatro e cinco valores, considerando que os argumentos e o retorno dos métodos podem
ser dos tipos int e double. Em outra classe, escreva um aplicativo de teste que, sem criar
objetos, demonstre as capacidades da classe criada. */
package POO.UnidadeI.Classes.Lista.Parte2.Questao40;

public class Maior {
    
    public static int max (int a, int b){
        return (a > b) ? a : b;
    }

    public static double max (double a, double b){
        return (a > b) ? a : b;
    }

    public static int max(int a, int b, int c){
        return max(max(a,b),c);
    }

    public static double max(double a, double b, double c){
        return max(max(a,b), c);
    }

    public static int max(int a, int b, int c, int d){
        return max(max(a,b,c),d);
    }

    public static double max(double a, double b, double c, double d){
        return max(max(a,b,c),d);
    }

    public static int max(int a, int b, int c, int d, int e){
        return max(max(a,b,c,d), e);
    }

    public static double max(double a, double b, double c, double d, double e){
        return max(max(a,b,c,d),e);
    }
}
