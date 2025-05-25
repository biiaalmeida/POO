/* 42. Escreva uma classe genérica com 3 atributos de um mesmo tipo genérico. Além do
construtor, essa classe deve ter:
• Um método que diz quantos dos 3 atributos são iguais;
• Um método que imprime os 3 atributos.
Escreva também uma classe executável para demonstrar o uso da classe criada com
diferentes tipos de dados.*/
package POO.UnidadeI.Classes.Lista.Parte2.Questao42;

public class Trio <T> {
    private T num1;
    private T num2;
    private T num3; 

    public Trio (T num1, T num2, T num3){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public int contagemIguais(){
        if(num1.equals(num2) && num2.equals(num3)){
           return 3;
        } else if (num1.equals(num2) || num1.equals(num3) || num2.equals(num3)){
            return 2;
        } else {
            return 0;
        }
    }

    public void imprimeAtributos(){
        System.out.println("Numeros: " + num1 + ", " + num2 + " e " + num3);
    }
}
