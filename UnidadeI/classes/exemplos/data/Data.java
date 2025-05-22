package POO.UnidadeI.Classes.Exemplos.data;

//o public é dispensável
public class Data {
    //atributos da classe (dados/objetos da classe)
    private int dia;
    private int mes;
    private int ano;

    public boolean dataEhValida(){
        
        return (dia>0 && dia<=30 && mes> 0 && mes<=12 && ano>=0);
    }

    public void inicializaData(int d, int m, int a){
        dia = d;
        mes = m;
        ano = a;
    }

    public void mostraData(){
        System.out.println(dia + "/" + mes + "/" + ano);
    }
}

