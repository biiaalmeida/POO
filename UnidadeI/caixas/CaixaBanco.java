package POO.UnidadeI.caixas;

public class CaixaBanco {
    public static int clientesAtendidos = 0; // com o static passa a ser um atributo da classe, é único
    private int numeroCaixa;

    public CaixaBanco(int numeroCaixa){
        this.numeroCaixa = numeroCaixa;
    }

    public void iniciaAtendimento(){
            System.out.println("Caixa" + numeroCaixa + "atendendo o cliente" + ++clientesAtendidos);
    }
    
    public String toString(){
        return "numeroCaica = " + numeroCaixa;
    }

}
