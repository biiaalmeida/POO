package POO.UnidadeII.Arrays.extrato;

import java.util.ArrayList;

public class Extrato {
    private float saldoFinal;
    private ArrayList<Float> transacoes;

    public Extrato(){
        saldoFinal =  0;
        transacoes =  new ArrayList<>();
    }

    public String toString() {
       String str = "================\n";
        for (int i = 0; i < transacoes.size(); i++) {
            str += (i + " : " + transacoes.get(i) + "\n");
        }
        // for (Double double1 : transacoes) {
        //     str += (double1 + "\n");          
        // }
        str += ("Saldo: " + saldo + "\n================\n");
        return str;
    }
}
