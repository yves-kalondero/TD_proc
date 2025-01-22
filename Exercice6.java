import java.util.*;
import java.lang.Math;
public class Exercice6 {
    public static void main(String[] args) {
    
    Scanner lect=new Scanner(System.in);
    try{
 System.out.println("entrer le coefficient à x^2:");
 double a =lect.nextDouble(); 
 System.out.println("entrer le coefficient à x:");
 double b=lect.nextDouble();
 System.out.println("entrer le coefficient independant:");
 double c=lect.nextDouble();
 double deltat=deltat(a, b, c);
 if (deltat>0){
    System.out.println("l'equation a deux racines réelles distinctes qui sont:");
    double x1=(-b+Math.sqrt(deltat))/(2*a);
    double x2=(-b-Math.sqrt(deltat))/(2*a);
    affichage(x1, x2);
 }
 else if(deltat==0){
    System.out.println("l'equation a deux racines réelles confondues qui sont:");  
double x1=-(b/2*a);
   double x2=x1;
   affichage(x1, x2);
      
   }  
   
   else  {
   
  
  deltat=-(deltat);
   double z1=-b/2*a;
   double z2=-(Math.sqrt(deltat))/(2*a);
   double z3=(Math.sqrt(deltat))/(2*a);
   affichagecomplexe(z1, z2, z3);
  }
}
catch(InputMismatchException e){
   System.out.println("coefficient incorrect.veillez réesayez");
}
}
public static Double deltat(double a,double b,double c){
   return b*b-(4*a*c);
} 
public static void affichage(double x1,double x2){
   System.out.println("la solution de votre equation est x1:"+x1+ "et x2:"+x2);
}
public static void affichagecomplexe(double Wz1,double Wz2,double Wz3){
   System.out.println("la solution complexe de votre equation sont: z1="+Wz1+" "+Wz2+"i et z2="+Wz1+" "+Wz3+"i");

}  
}      

     
 
 


