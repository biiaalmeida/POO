package POO.UnidadeI.Classes.Exemplos.circulo;

public class Circulo {
    private double raio;
    private final double pi = 3.1428; //final significa que é uma constante

    public Circulo (double raio){
        this.raio = raio;
    }

    public double perimetro(){
        return 2*pi*raio;
    }
    public String toString(){
        return "raio = " + raio;
    }
}
