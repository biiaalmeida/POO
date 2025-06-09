package POO.UnidadeII.Arrays.pascal;

import java.util.Scanner;

public class Pascal {
    public static void main(String[] args) {
        int nLinhas;
        Scanner sc = new Scanner(System.in);
        System.out.println("Linhas: ");
        nLinhas = sc.nextInt();

        int[][] tri = new int [nLinhas][]; 
        
        for (int l = 0; l < tri.length; l++) {
            tri[l] = new int[l+2];
            tri[l][0] = 1; //primeiro elemento da linha = 1 
            tri[l][tri[l].length-1]= 1; //ultimo elemento =1

            for (int c = 0; c < tri[l].length-1; c++) {
                tri[l][c] = tri[l-1][c] + tri[l-1][c-1];
            }
        }

        for (int l = 0; l < tri.length; l++) {
            for (int c = 0; c < tri[l].length; c++) {
                System.out.print(tri[l][c] + " ");
            }
        }

        sc.close();
    }
}
