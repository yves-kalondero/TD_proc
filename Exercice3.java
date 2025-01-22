import java.util.Scanner;
public class Exercice3 {
    public static void main(String[] args) {
       Scanner A=new Scanner(System.in);
       System.out.println("Entrez le premier nombre");
        int a=A.nextInt();
        System.out.println("Entrez le premier nombre");
        int b=A.nextInt();
        System.out.println("choisissez l'operation");
        String c=A.next();
        if(c.equals("+")){
            double resultat=a+b;
            System.out.println("la somme de vos nombres est:"+resultat);
        }
        else if(c.equals("-")){
            int resultat=a-b;
            System.out.println("la difference de vos nombres est:"+resultat);

        }
        else if(c.equals("/")){
            double resultat=a/b;
            System.out.println("le quotient de vos nombres est:"+resultat); 
        }
        else if(c.equals("*")){
            double resultat=a*b;
            System.out.println("le produit de vos nombres est:"+resultat);
        }
        else{}
    }
}
