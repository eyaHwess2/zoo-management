package tn.esprit.prosit9.entities;

import java.util.Objects;

public class Departement implements Comparable<Departement>{
    private int id;
    private String nom;
    private int nbrEmpolyes;

    public Departement(){}

    public Departement(int nbrEmpolyes, String nom) {
        this.nbrEmpolyes = nbrEmpolyes;
        this.nom = nom;
    }

    public int getNbrEmpolyes() {
        return nbrEmpolyes;
    }

    public void setNbrEmpolyes(int nbrEmpolyes) {
        this.nbrEmpolyes = nbrEmpolyes;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Departement that = (Departement) o;
        return id == that.id && Objects.equals(nom, that.nom);
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", nbrEmpolyes=" + nbrEmpolyes +
                '}';
    }

    @Override
    public int compareTo(Departement o) {
        return Integer.compare(this.id, o.id);
    }
}
