package POO.UnidadeI.Classes.Lista.Parte2.Questao37e38;

public class DemoLampada {
       public static void main(String[] args) {
              Lampada lampada = new Lampada();
      
              lampada.acende();
              lampada.apaga();
              lampada.acende(); // Deve contar 2 acendimentos

              lampada.apaga();
              lampada.acende(); // Conta como 3

              System.out.println(lampada.mostraEstado()); // Deve estar ligada
              System.out.println("Está ligada? " + lampada.estaLigada());
              lampada.foiAcessa(); // Mostra 3 vezes
       }
}
