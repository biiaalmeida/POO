package POO.UnidadeI.Classes.Exemplos.triangulo;

public class DemoTriangulo {
    public static void main(String[] args) {
        /*Triangulos t1 = new Triangulos(); //como criar objeto
        t1.inicializaTriangulos(2.3, 3.3 , 4.5, "escaleno"); //como criar referencia
        System.out.println("Perimetro: " + t1.calculaPerimetro());
        System.out.println("Descrição: " + t1.desc);*/

        Triangulos t1, t2, t3;
        t1 = new Triangulos();
        t2 = new Triangulos();
        t3 = t1;
        //System.out.println(t1 == t2);
        //System.out.println(t1 == t3);
        System.out.println(t1.equals(t3));

    }
}
