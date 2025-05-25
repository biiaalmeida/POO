/*36. Crie uma classe denominada Elevador para armazenar as informações de um elevador
dentro de um prédio. 
A classe deve armazenar o número do andar atual, o total de
andares no prédio, a capacidade do elevador e quantas pessoas estão presentes nele.
Outras classes não devem ter acesso direto aos atributos de Elevador. 
A classe deve também disponibilizar os seguintes métodos:
• construtor : que deve receber como parâmetros a capacidade do elevador e o total
de andares no prédio (um elevador sempre começa no térreo e vazio);
• entra : para acrescentar uma pessoa no elevador (só deve acrescentar se ainda
houver espaço);
• sai : para remover uma pessoa do elevador (só deve remover se houver alguém
dentro dele);
• sobe : para subir um andar (não deve subir se já estiver no último andar);
• desce : para descer um andar (não deve descer se já estiver no térreo). */
package POO.UnidadeI.Classes.Lista.Parte2.Questao36;

public class Elevador {
    private int capacidade;
    private int numAndares;
    private int andarAtual;
    private int quantidade;

    public Elevador(int capacidade, int numAndares){
        this.capacidade = capacidade;
        this.numAndares = numAndares;
        this.andarAtual = 0;
        this.quantidade = 0;
    }

    public int getCapacidade(){
        return capacidade;
    }

    public int getnumAndares(){
        return numAndares;
    }

    public void entra(){
        if(quantidade < capacidade){
            quantidade++;
            System.out.println("1 pessoa entrou. Quantidade de pessoas: " + quantidade);
        } else{
            System.out.println("Lotado");
        }
    }

    public void sai(){
        if(quantidade > 0){
            quantidade--;
            System.out.println("1 pessoa saiu. Quantidade de pessoas: " + quantidade);
        }
    }

    public void sobe(){
        if(andarAtual == numAndares){
            System.out.println("Já estamos no  ultimo andar");
        }else {
            andarAtual++;
            System.out.println("Subindo um andar...");
        }
    }

    public void desce(){
        if(andarAtual == 0){
            System.out.println("Já estamos no térreo");
        } else{
            andarAtual--;
            System.out.println("Descendo um andar...");
        }
    }
    
}