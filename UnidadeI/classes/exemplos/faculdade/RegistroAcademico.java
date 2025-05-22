/*Escreva a classe RegistroAcademico com os atributos nome, matricula, codigoCurso e  percentualDeCobranca, além dos métodos inicializaRegistroAcademico e calculaMensalidade
A mensalidade é igual a 100 x codigoCurso x percentualDeCobranca */
package POO.UnidadeI.Classes.Exemplos.faculdade;

public class RegistroAcademico {
    private String nome;
    private int matricula;
    private int codigoDoCurso;
    private int percentualDeCobranca;

    public RegistroAcademico (String michael, int matricula, int codigoCurso, int percentualDeCobranca){
        this.nome = michael;
        this.matricula = matricula;
        this.codigoDoCurso = codigoCurso;
        this.percentualDeCobranca = percentualDeCobranca;

    }

    public double calculaMensalidade(){
        return 100.0 * codigoDoCurso * (percentualDeCobranca)/100;
    }

    /*void inicializaRegistroAcademico(String n, String m, int c, int p){
        nome = n;
        matricula = m;
        codigoDoCurso = c;
        percentualDeCobranca = p;
    }*/
}
