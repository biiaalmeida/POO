package POO.UnidadeI.Classes.Exemplos.eventos;

public class EventoAcademico {
    String nomeDoEvento;
    String localDoEvento;
    int numeroDeParticipantes;

    EventoAcademico (String nomeDoEvento, String localDoEvento, int numeroDeParticipantes){
        this.nomeDoEvento = nomeDoEvento;
        this.localDoEvento = (localDoEvento.isEmpty()? "UFERSA" : localDoEvento);
        this.numeroDeParticipantes = (numeroDeParticipantes>0 ? numeroDeParticipantes:1);
    }

    void mostraEvento(){
        System.out.println("Nome:" + nomeDoEvento);
        System.out.println("Local: " + localDoEvento);
        System.out.println("Participantes: " + numeroDeParticipantes);
    }
}
