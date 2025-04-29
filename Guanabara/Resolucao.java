package POO.Guanabara;
import java.awt.Dimension;
import java.awt.Toolkit;

public class Resolucao {
    public static void main(String[] args){
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        
        System.out.println("A resolução é:");
        System.out.println(screenSize.width + " x " + screenSize.height);
    }
}