import java.util.Scanner;
public class Exercice1{
    public static void main(String[] args) {
        Scanner A=new Scanner(System.in);
        System.out.println("Entrez la valeur de votre temps en seconde");
        int t=A.nextInt();
        int heurs=t/3600;
        int minute=(t%3600)/60;
        int seconde=(t%3600)%60;
        System.out.println("votre temps est "+heurs+" heurs "+minute+" minute "+seconde+" seconde ");
    
    
    }

}
        
    