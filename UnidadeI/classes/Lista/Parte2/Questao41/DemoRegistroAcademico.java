package POO.UnidadeI.Classes.Lista.Parte2.Questao41;

public class DemoRegistroAcademico {
    public static void main(String[] args) {
        // Criando três registros acadêmicos
        RegistroAcademico aluno1 = new RegistroAcademico("Alice", 1, 80);
        RegistroAcademico aluno2 = new RegistroAcademico("Bruno", 2, 90);
        RegistroAcademico aluno3 = new RegistroAcademico("Carla", 3, 100);

        // Exibindo os dados de cada aluno
        System.out.println(aluno1.getDados());
        System.out.println(aluno2.getDados());
        System.out.println(aluno3.getDados());
    }
}
