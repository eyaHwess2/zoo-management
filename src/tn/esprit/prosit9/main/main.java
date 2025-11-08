package tn.esprit.prosit9.main;

import tn.esprit.prosit9.entities.Employee;
import tn.esprit.prosit9.entities.SocieteArrayList;

public class main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        Employee e1 = new Employee(1, "Ali", "Ben", "IT", 3);
        Employee e2 = new Employee(2, "eya", "hwess", "RH", 2);
        Employee e3 = new Employee(3, "ghzela", "bayrem", "IT", 1);

        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);

        System.out.println("miste des employees :");
        societe.displayEmploye();

        System.out.println("recherche par nom 'Sana' : " + societe.rechercherEmploye("eya"));

        System.out.println("t par ID :");
        societe.trierEmployeParId();
        societe.displayEmploye();

        System.out.println("tri par dep, Nom et Grade :");
        societe.trierEmployeParNomDépartementEtGrade();
        societe.displayEmploye();

        System.out.println("sup de eya");
        societe.supprimerEmploye(e2);
        societe.displayEmploye();
    }
}
