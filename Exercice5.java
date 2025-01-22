import java.util.Scanner;
public class Exercice5 {
    public static void main(String[] args) {
       Scanner A=new Scanner(System.in);
       System.out.println("Entrez le no nombre");
       int nombre=A.nextInt();
        while(nombre>0) {
            int somme=0;

       for(int i=1;i<=nombre;i++){
         somme=somme+(nombre-(+i));
        if(somme>=nombre){
            i=nombre+1;
            System.out.println("la somme est:"+somme);
        }
        
       }
       break;
    }



}}
