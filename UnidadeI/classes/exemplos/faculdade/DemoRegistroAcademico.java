/*Crie a classe executável DemoRegistroAcademico onde o objeto michael, do tipo RegistroAcademico, é criado e seus atributos são inicializados com o método inicializaRegistroAcademico. 
Por fim, calcule e informe o valor da mensalidade de michael.*/
package POO.UnidadeI.classes.exemplos.faculdade;

public class DemoRegistroAcademico {
    public static void main(String[] args) {
        RegistroAcademico michael = new RegistroAcademico( "michael", 2, 2, 60);
        System.out.println("Mensalidade michael: " + michael.calculaMensalidade());

        RegistroAcademico roberto = new RegistroAcademico("roberto", 2, 3, 50);
        System.out.println("Mensalidade michael: " + roberto.calculaMensalidade());

        /*RegistroAcademico michael = new RegistroAcademico();
        double valor = michael.calculaMensalidade();
        michael.inicializaRegistroAcademico("Michael", "0002", 2, 60);
        System.out.println("Mensalidade de Michael: " + valor);

        RegistroAcademico roberto = new RegistroAcademico();
        double valor2 = michael.calculaMensalidade();
        System.out.println("Mensalidade de roberto" + valor2);*/
    }
}
