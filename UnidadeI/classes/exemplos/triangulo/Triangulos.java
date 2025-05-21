package POO.UnidadeI.classes.exemplos.triangulo;

public class Triangulos {
    double l1;
    double l2;
    double l3;
    String desc;

    void inicializaTriangulos( double lado1, double lado2, double lado3, String descricao){
        l1 = lado1;
        l2 = lado2;
        l3 = lado3;
        desc = descricao;
    }

    double calculaPerimetro(){
        return l1 + l2 + l3;
    }
}
