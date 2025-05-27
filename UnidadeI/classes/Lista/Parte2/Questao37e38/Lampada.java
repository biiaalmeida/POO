/*Escreva uma classe Lampada que possui o atributo estadoDaLampada (ligado ou desligado) e os métodos acende, 
apaga e mostraEstado (ex.: A lampada esta acesa). 
Inclua um método estaLigada que retorne verdadeiro se a lâmpada estiver ligada e falso caso
contrário. Adicione um campo que indique quantas vezes a lâmpada foi acesa. Para
isso, utilize uma instância da classe Contador criada anteriormente e implemente a lógica necessária
para atualizar seu valor. Escreva um aplicativo de teste que demonstre
as capacidades da classe criada. */
package POO.UnidadeI.Classes.Lista.Parte2.Questao37e38;

public class Lampada {
    private boolean estadoDaLampada;
    private Contador contador;
    
    public Lampada(){
        estadoDaLampada = false;
        contador = new Contador();
    }

    public boolean getEstadoDaLampada(){
        return estadoDaLampada;
    }

    public Contador getContador(){
        return contador;
    }

    public void acende(){
        estadoDaLampada = true;
        contador.incrementar();
    }

    public void apaga(){
        estadoDaLampada = false;
    }

    public String mostraEstado(){
        if(estadoDaLampada == true){
            return "Ligada";
        } else {
            return "Desligada";
        } 
    }

    public boolean estaLigada(){
        if(estadoDaLampada == true){
            return true;
        } else{
            return false;
        }
    }

    public void foiAcessa(){
        System.out.print("A lâmpada foi acessa ");
        contador.imprimir(); 
        System.out.print(" vez(es).");
    }    
}
