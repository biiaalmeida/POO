package POO.UnidadeI.Classes.Exemplos.triangulo;

public class Triangulos {
    private double l1;
    private double l2;
    private double l3;
    private String desc; // tem criar os métodos de acesso (get e set) se usar o atributo de fora da classe.

    public void inicializaTriangulos( double lado1, double lado2, double lado3, String descricao){
        l1 = lado1;
        l2 = lado2;
        l3 = lado3;
        desc = descricao;
    }

    public double calculaPerimetro(){
        return l1 + l2 + l3;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String descricao) {
        desc = descricao;
    }
}
