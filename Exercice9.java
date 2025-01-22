import java.util.Scanner;
import java.util.Arrays;

public class Exercice9 {
    public static void main(String[] args) {
        int matrice_1[][]=new int[4][4];
        int matrice_2[][]=new int[4][4];
        Scanner lecteur = new Scanner(System.in);
        System.out.println("Entrez  les valeurs de matrices");
        for (int i = 0; i < 4; i++) {
            for (int k = 0; k < 4; k++) {
                System.out.println("entre le nombre "+(i+1)+ ","+(k+1)+" de la matrice_1");
                matrice_1[i][k]=lecteur.nextInt();
                System.out.println("entre le nombre "+(i+1)+ "," +(k+1)+" de la matrice_2");
                matrice_2[i][k]=lecteur.nextInt();
            }
        }
        int matrice_2_trs[][]=new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int k = 0; k < 4; k++) {
                matrice_2_trs[k][i]=matrice_2[i][k];
            }
        }
        System.out.println("soient les matrices suivantes ");
        System.out.println(Arrays.deepToString(matrice_1));
        System.out.println(Arrays.deepToString(matrice_2));
        System.out.println("la matrices transposé de la 2éme matrice  ");
        for (int i = 0; i < 4; i++) {
            System.out.print("(");
            for (int k = 0; k < 4; k++) {
                System.out.print(matrice_2_trs[i][k]);
                System.out.print(' ');

                
            }
            System.out.print(")");
            System.out.println();
        }
        System.out.println(Arrays.deepToString(matrice_2_trs));


        int matrice_produit[][]=new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int p = 0; p < 4; p++) {
                matrice_produit[i][p]=matrice_1[i][p]*matrice_2_trs[i][p];
            }
        }
        System.out.println("le produit de ces deux matrice est :");

        for (int i = 0; i < 4; i++) {
            System.out.print("(");
            for (int k = 0; k < 4; k++) {
                System.out.print(matrice_produit[i][k]);
                System.out.print(' ');

                
            }
            System.out.print(")");
            System.out.println();
        }
        System.out.println(Arrays.deepToString(matrice_produit));



    }
}
 

    


