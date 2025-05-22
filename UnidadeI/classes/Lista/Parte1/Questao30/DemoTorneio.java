package POO.UnidadeI.Classes.Lista.Parte1.Questao30;

public class DemoTorneio {
    public static void main(String[] args) {
        BeachTenis dupla = new BeachTenis("Ana", "Beatriz");

        // Registrando partidas
        dupla.registrarVitoria(2, 0);
        dupla.registrarDerrota(1, 2);
        dupla.registrarVitoria(2, 1);

        // Acessando dados com getters
        System.out.println("Jogador 1: " + dupla.getJogador1());
        System.out.println("Jogador 2: " + dupla.getJogador2());
        System.out.println("Vitórias: " + dupla.getVitorias());
        System.out.println("Derrotas: " + dupla.getDerrotas());
        System.out.println("Total de jogos: " + dupla.getTotalJogos());
        System.out.println("Saldo de sets: " + dupla.getSaldoSets());

    }
}
