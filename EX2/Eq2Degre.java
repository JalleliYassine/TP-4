package TP4.EX2;

import java.security.Guard;

public class Eq2Degre {

    Double r1;
    Double r2;

    Double delta; 

    Double a;
    Double b;
    Double c;

    Eq2Degre(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;

        delta = (b*b) - (4*a*c);
    }

    public void afficheDescriminant() {
        if (delta < 0) {
            System.out.print("Cas complexe");
        } else {
            System.out.print("Descriminant = "+ delta);
        }
    }

    public void resoudre() {
        if (delta < 0) {
            System.out.println("Cas complexe");
        } else if (delta>0) {
            r1= (-b - Math.sqrt(delta)) / 2*a;
            r2= (-b + Math.sqrt(delta)) / 2*a;
        }
    }


    public void afficheSolutions() {
        System.out.println("les solutions sont : "+ r1 + " ," + r2);
    }

}
