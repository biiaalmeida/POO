package POO.UnidadeI.Classes.Lista.Parte1.Questao32;

public class DemoAluno {
    public static void main (String[] args){ 
        Aluno aluno1 = new Aluno(11111, "Bia", 9, 2, 4);

        System.out.println("---- Dados do Aluno ----");
        System.out.println("Matrícula: " + aluno1.getMatricula());
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Nota P1: " + aluno1.getP1());
        System.out.println("Nota P2: " + aluno1.getP2());
        System.out.println("Nota Trabalho: " + aluno1.getTrabalho());
        System.out.printf("Média Parcial: %.2f\n", aluno1.media());
        System.out.printf("Prova final: %.2f\n", aluno1.provaFinal());
    }
}
