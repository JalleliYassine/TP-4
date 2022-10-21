package TP4.monProjetClasses;

public class Filiere {
    int id = 0;
    String code;
    String libelle ;

    Filiere(String code, String libelle) {
        this.code = code;
        this.libelle = libelle;
    }

    public String getCode() {
        return code;
    }
    public String getLibelle() {
        return libelle;
    }

    public  void setCode(String code) {
        this.code = code;
    }
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String toString() {
        return "Filière : "+ libelle;
    }
}
