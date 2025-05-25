/*41. Escreva uma versão da classe RegistroAcademico (vista em aula) que tenha o campo
numeroDeMatriculas declarado como static, e que incremente o valor deste campo cada
vez que uma instância da classe for criada. Use o atributo numeroDeMatriculas para
definir o atributo matricula automaticamente com um valor diferente para cada instância.
Escreva também uma aplicação que crie algumas instâncias da classe para demonstrar
seu funcionamento.*/
package POO.UnidadeI.Classes.Lista.Parte2.Questao41;

public class RegistroAcademico {
    private String nome;
    private int matricula;
    private int codigoDoCurso;
    private int percentualDeCobranca;
    private static int numeroDeMatriculas;

    public RegistroAcademico (String nome, int codigoCurso, int percentualDeCobranca){
        this.nome = nome;
        this.codigoDoCurso = codigoCurso;
        this.percentualDeCobranca = percentualDeCobranca;

        numeroDeMatriculas++;
        this.matricula  = numeroDeMatriculas;
    }

    public double calculaMensalidade(){
        return 100.0 * codigoDoCurso * (percentualDeCobranca)/100;
    }

    public String getDados() {
        return "Nome: " + nome +
               ", Matrícula: " + matricula +
               ", Código do Curso: " + codigoDoCurso +
               ", Percentual de Cobrança: " + percentualDeCobranca +
               ", Mensalidade: R$ " + calculaMensalidade();
    }
}