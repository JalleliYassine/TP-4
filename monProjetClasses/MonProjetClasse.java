package TP4.monProjetClasses;

public class MonProjetClasse {
    public static void main(String[] args) {
        Filiere lm=new Filiere("LM", "Informatique et Multimédia");
        Filiere tlcom=new Filiere("tlcom", "Télécom");
        Filiere iot=new Filiere("IOT", "Systèmes embarqués et IOT");

        Etudiant rashid=new Etudiant(lm, "Rashid", "Mohammed", "1992/01/02");
        Etudiant chakib=new Etudiant(lm, "Yves", "Chakib", "1992/04/06");
        Etudiant manel=new Etudiant(tlcom, "Alaoui", "Manel", "2003/02/02");
        Etudiant meriem=new Etudiant(tlcom, "Bouhlel", "Meriem", "1992/09/02");
        Etudiant mourad=new Etudiant(iot, "Salemi", "Mourad", "2004/10/02");

        System.out.println(lm.toString());
        System.out.println(rashid.toString());
        System.out.println(chakib.toString());

        System.out.println(tlcom.toString());
        System.out.println(manel.toString());
        System.out.println(meriem.toString());

        System.out.println(iot.toString());
        System.out.println(mourad.toString());
    }
}
