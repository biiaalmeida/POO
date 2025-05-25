/*30. Escreva uma classe para representar um time de um esporte qualquer em um campeonato desse esporte. 
Que atributos devem ser representados nessa classe? Quais métodos ela deve conter? 
Escreva um aplicativo de teste que demonstre as capacidades da classe criada. */
package POO.UnidadeI.Classes.Lista.Parte1.Questao30;

public class BeachTenis {
    String jogador1;
    String jogador2;
    int vitorias;
    int derrotas;
    int setsVencidos;
    int setsPerdidos;

    public BeachTenis(String jogador1, String jogador2) {
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
        vitorias = 0;
        derrotas = 0;
        setsVencidos = 0;
        setsPerdidos = 0;
    }

    public void registrarVitoria(int setsVencidos, int setsPerdidos) {
        vitorias++;
        this.setsVencidos += setsVencidos;
        this.setsPerdidos += setsPerdidos;
    }

    public void registrarDerrota(int setsVencidos, int setsPerdidos) {
        derrotas++;
        this.setsVencidos += setsVencidos;
        this.setsPerdidos += setsPerdidos;
    }
    
    public int saldoSets() {
        return setsVencidos - setsPerdidos;
    }

    public int totalJogos() {
        return vitorias + derrotas;
    }   
}