package POO.UnidadeI.Classes.Lista.Parte2.Questao42;

public class DemoTrio {
    public static void main (String[] args){
        //testando tipos inteiros
        Trio <Integer> testeInt = new Trio <>(1,1,1);
        testeInt.imprimeAtributos();
        System.out.println("Numeros iguais: " +  testeInt.contagemIguais());

        //testando double
        Trio <Double> testeDouble = new Trio <>(2.5, 2.5, 3.0);
        testeDouble.imprimeAtributos();
        System.out.println("Numeros iguais: " + testeDouble.contagemIguais());

        //testando String 
        Trio <String> testeString = new Trio<>("A", "B", "C");
        testeString.imprimeAtributos();
        System.out.println("Letras iguais: " + testeString.contagemIguais());

    }
}
