package POO.UnidadeI.classes.faculdade;

public class RegistroAcademico {
    String nome;
    String matricula;
    int codigoDoCurso;
    int percentualDeCobranca;

    void inicializaRegistroAcademico(String n, String m, int c, int p){
        nome = n;
        matricula = m;
        codigoDoCurso = c;
        percentualDeCobranca = p;
    }

    double calculaMensalidade(){
        return 100.0 * codigoDoCurso * (percentualDeCobranca)/100;
    }
}
