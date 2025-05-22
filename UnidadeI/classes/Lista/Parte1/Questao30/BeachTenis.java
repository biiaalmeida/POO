/*30. Escreva uma classe para representar um time de um esporte qualquer em um campeonato desse esporte. 
Que atributos devem ser representados nessa classe? 
R: jogador1, jogador2, vitorias, derrotas, setVencidos, setsPerdidos

Quais métodos ela deve conter? 
- registrarVitoria(int setsVencidos, int setsPerdidos)
- registrarDerrota(int setsVencidos, int setsPerdidos)
-getTotalJogos() - Retorna a soma de vitórias e derrotas.
- getSaldoSets() - Calcula e retorna a diferença entre sets vencidos e perdidos.
- mostrarEstatisticas() - Exibe todas as informações do time.

Escreva um aplicativo de teste que demonstre as capacidades da classe criada. */
package POO.UnidadeI.Classes.Lista.Parte1.Questao30;

public class BeachTenis {
    private String jogador1;
    private String jogador2;
    private int vitorias = 0;
    private int derrotas = 0;
    private int setsVencidos = 0;
    private int setsPerdidos = 0;

    public BeachTenis(String jogador1, String jogador2) {
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
    }

    public String getJogador1() {
        return jogador1;
    }

    public String getJogador2() {
        return jogador2;
    }

    public int getVitorias() {
        return vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public int getSetsVencidos() {
        return setsVencidos;
    }

    public int getSetsPerdidos() {
        return setsPerdidos;
    }

    public int getSaldoSets() {
        return setsVencidos - setsPerdidos;
    }

    public int getTotalJogos() {
        return vitorias + derrotas;
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
    
}