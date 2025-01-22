import java.util.Scanner;
public class Exercice2 {
    public static void main(String[]args){
        int c;
Scanner A=new Scanner(System.in);
System.out.println("Entrez le premier nombre");
int a=A.nextInt();
System.out.println("Entrez le deuxième nombre");
int b=A.nextInt();
if((a*b)<0){
c=a;
a=b;
b=c;
System.out.println("la valeur de a devient "+a);
System.out.println("la valeur de b devient "+b);


}
else{
    a=a+b;
    b=a*b;
    System.out.println("la valeur de a devient "+a);
    System.out.println("le valeur de b devient "+b);

}
    }
}
