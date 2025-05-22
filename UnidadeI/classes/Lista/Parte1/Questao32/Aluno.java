/*Escreva uma classe cujos objetos representam alunos matriculados em uma disciplina da
Ufersa. 

Cada objeto dessa classe deve guardar os seguintes dados do aluno: matrícula,
nome, 2 notas de prova (P1 e P2) e 1 nota de trabalho (T). 

Escreva os seguintes métodos para esta classe:
• media: calcula a média parcial do aluno (MP)
– cada prova tem peso 2, 5 e o trabalho tem peso 2 (MP =
(2,5×P1 + 2,5×P2 + 2×T) / 7)

• provaFinal: calcula quanto o aluno precisa para o exame final (EF)
– retorna zero se o aluno não necessita realizar o exame final (MP < 3 ou MP >=
7)
– média final MF = (MP × 6 + EF × 4)/10
– é necessário que MF seja maior ou igual a 5 para que o aluno seja aprovado
após realizar o exame final
Escreva um aplicativo de teste que demonstre as capacidades da classe criada. */
package POO.UnidadeI.Classes.Lista.Parte1.Questao32;

public class Aluno {
    private int matricula;
    private String nome;
    private float p1;
    private float p2;
    private float trabalho;
    private Object provaFinal;

    Aluno(int matricula, String nome, float p1, float p2, float trabalho){
        this.matricula = matricula;
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
        this.trabalho = trabalho;
    }

    public int getMatricula(){
        return matricula;
    }

    public String getNome(){
        return nome;
    }

    public float getP1(){
        return p1;
    }

    public float getP2(){
        return p2;
    }

    public float getTrabalho(){
        return trabalho;
    }

    public float media(){
        float media = (float) ((2.5 * p1 + 2.5 * p2 + 2 * trabalho)/7); //garantir que seja float
        return media; 
    }

    public float provaFinal(){
        float mediaParcial = media(); 

        if(mediaParcial < 3 || mediaParcial >= 7) {
            return 0;
        } 
        else {
            float exameFinal = (50 - mediaParcial * 6) / 4;
            
            if (exameFinal > 10) {
                System.out.println("Média < 5. Reprovado.");
            }
            return exameFinal;
        }
    }
}
