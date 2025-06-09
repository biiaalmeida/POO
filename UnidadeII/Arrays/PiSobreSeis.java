package POO.UnidadeII.Arrays;

public class PiSobreSeis {
    public static void main(String[] args) {
        double termosDaSerie[] = new double[1000000000];
        for (int i = 0; i < termosDaSerie.length; i++){
            termosDaSerie[i] = 1/Math.pow(i+1, 2);
        }

        for (int num = 10; num<= 1000000000; num*=10){
            calculaEMostraSomatoria(termosDaSerie, num);
        }
        System.out.println(Math.pow(Math.PI, 2) /6);
    }

    public static void calculaEMostraSomatoria(double array[], int num){
        double soma = 0.0;
        for(int i = 0; i < num; i++){
            soma += array[i];
        }
        System.out.println("A soma dos" + num + "primeiros elementos eh " + soma);
    }
}
