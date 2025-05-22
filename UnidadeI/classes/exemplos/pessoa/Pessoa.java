/*Crie uma classe para representar uma pessoa, 
com os atributos privados de nome e altura. 
Além do construtor, crie os métodos de acesso, 
set’s e get’s e também um método para retornar 
uma representação textual (toString) dos dados de uma pessoa. */
package POO.UnidadeI.Classes.Exemplos.pessoa;

public class Pessoa {
    private String nome;
    private double altura;

    Pessoa(String nome, double altura){
        this.nome = nome;
        this.altura = altura;
    }

    public String getNome() {
        return "Nome: " + nome;
    }

    public void setNome(String nome) {
        if (!nome.isEmpty()) {
            this.nome = nome;
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String toString() {
    return "Pessoa [Nome: " + nome + ", Altura: " + altura + " metros]";
    }
}
