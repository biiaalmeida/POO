package POO.UnidadeI.Classes.Lista.Parte1.Questao30;

public class DemoTorneio {
    public static void main(String[] args) {
        BeachTenis dupla1 = new BeachTenis("Ana", "Beatriz");

        // Registrando partidas
        dupla1.registrarVitoria(2, 0);
        dupla1.registrarDerrota(1, 2);
        dupla1.registrarVitoria(2, 1);
        
        System.out.println("Dados da dupla");
        System.out.println("Jogador 1: " + dupla1.jogador1);
        System.out.println("Jogador 2: " + dupla1.jogador2);
        System.out.println("Vitórias: " + dupla1.vitorias);
        System.out.println("Derrotas: " + dupla1.derrotas);
        System.out.println("Total de jogos: " + dupla1.totalJogos());
        System.out.println("Saldo de sets: " + dupla1.saldoSets());
    }
}
