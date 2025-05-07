package POO.UnidadeI.classes.faculdade;

public class DemoRegistroAcademico {
    public static void main(String[] args) {
        RegistroAcademico michael = new RegistroAcademico();
        double valor = michael.calculaMensalidade();
        michael.inicializaRegistroAcademico("Michael", "0002", 2, 60);
        System.out.println("Mensalidade de Michael: " + valor);

        RegistroAcademico roberto = new RegistroAcademico();
        double valor2 = michael.calculaMensalidade();
        System.out.println("Mensalidade de roberto" + valor2);
    }
}
