package POO.Guanabara;
//package horadosistema; 
import java.util.Date;

public class HoraDoSistema {
    public static void main (String[] args){
        Date relogio = new Date();
        System.out.println("A hora do sistema é");
        System.out.print(relogio.toString());
    }
}