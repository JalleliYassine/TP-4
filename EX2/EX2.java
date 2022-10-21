package TP4.EX2;
import java.util.*;

public class EX2 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a: ");  
        Double a= sc.nextDouble();

        System.out.print("Enter b: ");  
        Double b= sc.nextDouble();

        System.out.print("Enter c: ");  
        Double c= sc.nextDouble();
        sc.close();

        Eq2Degre eq= new Eq2Degre(a, b, c);

        eq.afficheDescriminant();

        eq.resoudre();

        eq.afficheSolutions();
    }
}
