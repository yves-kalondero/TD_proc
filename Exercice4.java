import java.util.Scanner;
public class Exercice4 {
    public static void main(String[] args) {
        Scanner A=new Scanner(System.in);
      System.out.println("Entrez votre nombre");
      int nombre=A.nextInt();
      System.out.println("vos nombres sont:");
      for(int i=0;i<=10;i++){

        System.out.println(nombre-(+i));
        
      }  
    }
}
