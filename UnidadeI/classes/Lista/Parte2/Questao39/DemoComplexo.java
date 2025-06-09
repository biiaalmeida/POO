package POO.UnidadeI.Classes.Lista.Parte2.Questao39;

public class DemoComplexo {
    public static void main(String[] args) {
        Complexo num1 = new Complexo(1, 4);
        System.out.println("Numero 1: " + num1);
        Complexo num2 = new Complexo(1);
        System.out.println("Numero 2: " + num2.toString());
        Complexo num3 = new Complexo();
        System.out.println("Numero 3: " + num3.toString());
        Complexo num4 = new Complexo(1, -3);
        System.out.println("Numero 4: " + num4.toString());
    }
}
