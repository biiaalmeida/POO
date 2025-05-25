/*37. Escreva a classe Contador que encapsule um valor usado para contagem de eventos.
Esta classe deve esconder o valor encapsulado de programadores-usuários, fazendo
com que o acesso ao valor seja feito através de métodos que devem zerar, incrementar 
e imprimir o valor do contador. Escreva um aplicativo de teste que demonstre as
capacidades da classe criada. */
package POO.UnidadeI.Classes.Lista.Parte2.Questao37e38;

public class Contador {
    private int valor;

    //o objeto começa zerado
    public Contador(){
        valor = 0;
    }

    public void zerar(){
        valor = 0;
        System.out.println("Contador zerado");
    }

    public void incrementar(){
        valor++;
        System.out.println("Contador incrementado");
    }

    public void imprimir(){
        System.out.println(valor);
    }
}
