    
    import java.util.Scanner;
    import java.util.Arrays;

    public class Exercice8 {
        public static void main(String[] args) {
            int mat[][]=new int [4][5];
            Scanner lecteur = new Scanner(System.in);
            System.out.println("Entrez les valeurs de matrices");
            for (int i = 0; i < 4; i++) {
                for (int k = 0; k < 5; k++) {
                    System.out.println("entre le nombre "+(i+1)+ "," +(k+1));
                    mat[i][k]=lecteur.nextInt();
                }
            }
            System.out.println(Arrays.deepToString(mat));
            System.out.println("verifier un nombre dans cet tableau");
            int x=lecteur.nextInt();
            boolean try_to_find=false;
            for (int i = 0; i < 4; i++) {
                for (int k = 0; k < 5; k++) {
                   if ( mat[i][k]==x) {
                    try_to_find=true;
                    break;
                   }
                }
                if (try_to_find)break;
            }
            if (try_to_find) {
                System.out.println("l'entier "+x+"existe dans le tableau");
                
            }
            else {
                System.out.println("l'entier "+x+" n'existe pas dans le tableau");
    
            }
        }
    
    
        
    }
    

