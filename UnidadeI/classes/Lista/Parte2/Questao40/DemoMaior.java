package POO.UnidadeI.Classes.Lista.Parte2.Questao40;

public class DemoMaior {
    public static void main(String[] args){
       System.out.println("Maior entre 10 e 20 (int): " + Maior.max(10, 20));
        System.out.println("Maior entre 3, 8, 5 (int): " + Maior.max(3, 8, 5));
        System.out.println("Maior entre 1, 2, 3, 4 (int): " + Maior.max(1, 2, 3, 4));
        System.out.println("Maior entre 7, 9, 2, 4, 6 (int): " + Maior.max(7, 9, 2, 4, 6));

        System.out.println("Maior entre 10.5 e 20.3 (double): " + Maior.max(10.5, 20.3));
        System.out.println("Maior entre 3.1, 8.6, 5.2 (double): " + Maior.max(3.1, 8.6, 5.2));
        System.out.println("Maior entre 1.5, 2.5, 3.5, 4.5 (double): " + Maior.max(1.5, 2.5, 3.5, 4.5));
        System.out.println("Maior entre 7.7, 9.9, 2.2, 4.4, 6.6 (double): " + Maior.max(7.7, 9.9, 2.2, 4.4, 6.6));

    }
}
