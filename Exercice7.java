import java.util.Scanner;
public class Exercice7 {
    public static void main(String[] args) {
        int[]tab=new int[10];
        Scanner A=new Scanner(System.in);
        int somme=0;
        int produit=1;
        for(int i=0;i<tab.length;i++){
            System.out.println("entrer la valeur du nombre :"+(i+1));
            int nombre=A.nextInt();
            somme=somme+nombre;
            produit=produit*nombre;
            double moyenne=somme/(i+1);
            System.out.println("la somme de vos nombres "+somme);
            System.out.println("le produit de vos nombres est "+produit);
            System.out.println("la moyenne de vos nombres est "+moyenne);



        }
    }
    
}
