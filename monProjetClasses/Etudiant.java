package TP4.monProjetClasses;

import java.nio.channels.FileLockInterruptionException;

public class Etudiant {
    int id = 0;
    String nom;
    String prenom ;
    String dateNaissance ;
    Filiere filiere;

    Etudiant(Filiere filiere, String nom, String prenom, String dateNaissance) {
        this.filiere = filiere;

        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
    }

    

    public String getDateNaissaice() {
        return dateNaissance;
    }
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }

    public String setDateNaissaice() {
        return dateNaissance;
    }
    public String setNom() {
        return nom;
    }
    public String setPrenom() {
        return prenom;
    }

    public String toString() {
        return "Je suis l'étudiant " + nom + prenom + " ma date de naissance est : " + dateNaissance;
    }
}
