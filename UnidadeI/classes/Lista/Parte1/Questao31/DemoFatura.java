package POO.UnidadeI.Classes.Lista.Parte1.Questao31;

public class DemoFatura {
    public static void main (String[] args){

        Fatura pessoa1 = new Fatura(2, "mouse", 3, 10.87);
        
        System.out.println("Fatura");
        System.out.println("ID: " + pessoa1.getId());
        System.out.println("Descrição: " + pessoa1.getDescricao());
        System.out.println("Quantidade: " + pessoa1.getQuantidade());
        System.out.println("Preço: " + pessoa1.getPreco());
        System.out.println("Valor total: " + pessoa1.calculaTotal());

    }
}
