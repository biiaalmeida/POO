/*31. Crie uma classe chamada F atura para que uma loja de suprimentos de informática a
utilize para representar uma fatura de um item vendido. Uma Fatura deve incluir as seguintes 
informações sobre o item vendido: o número de identificação, a descrição, a
quantidade comprada e o preço unitário. Se a quantidade não for positiva, ela deve ser
configurada como 0. Se o preço por item não for positivo, ele deve ser configurado como
0.0. Forneça também um método chamado calculaT otal que calcula e retorna o valor de
fatura (isto é, multiplica a quantidade pelo preço por item). Escreva um aplicativo de teste
que demonstre as capacidades da classe criada.*/
package POO.UnidadeI.Classes.Lista.Parte1.Questao31;

class Fatura {
    int id;
    String descricao;
    int quantidade;
    double preco;

    Fatura(int id, String descricao, int quantidade, double preco){
        this.id = id;
        this.descricao = descricao;

        //condição ? valor_se_verdadeiro : valor_se_falso;
        this.quantidade = (quantidade > 0) ? quantidade : 0; 
        this.preco = (preco > 0.0) ? preco : 0.0;
    }

    double calculaTotal(){
        return quantidade * preco;
    }
}
