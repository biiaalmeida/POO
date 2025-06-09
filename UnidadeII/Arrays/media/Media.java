package POO.UnidadeII.Arrays.media;

public class Media {
    public static void main(String[] args) {
        double media2 = media(2.5, 3.5);
        System.out.println("Media de 2 elementos: " + media2);

        double media3 = media(2.5,3.5,4.5);
        System.out.println("Media de 3 elementos" + media3);

        double media4 = media(2.5,3.5,4.5, 5.5);
        System.out.println("Media de 4 elementos" + media4);
    }

    public static double media(double... numeros){
        double soma = 0;

        for(double d : numeros){
            soma+=d;
        }

        return soma/numeros.length;
    }
}
