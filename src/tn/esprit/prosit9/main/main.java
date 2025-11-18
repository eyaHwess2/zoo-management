package tn.esprit.prosit9.main;

import tn.esprit.prosit9.entities.*;

import java.util.TreeSet;

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


        //prosit 10

        DepartementHashSet dhs = new DepartementHashSet();

        Departement dep1 = new Departement(30, "RH");
        Departement dep2 = new Departement(15, "IT");
        Departement dep3 = new Departement(20, "Finance");

        dhs.ajouterDepartement(dep1);
        dhs.ajouterDepartement(dep2);
        dhs.ajouterDepartement(dep3);

        dhs.displayDepartement();

        System.out.println("Rechercher 'IT' : " + dhs.rechercherDepartement("IT"));
        System.out.println("Rechercher 'Marketing' : " + dhs.rechercherDepartement("Marketing"));

        System.out.println("Rechercher dep1 : " + dhs.rechercherDepartement(dep1));

        dhs.supprimerDepartement(dep2);
        dhs.displayDepartement();

        TreeSet<Departement> tries = dhs.trierDepartementById();
        for (Departement d : tries) {
            System.out.println(d);
        }



        // prosit 11
        AffectationHashMap map = new AffectationHashMap();

        Employee a1 = new Employee(10, "Aymen", "Khaled", "IT", 3);
        Employee a2 = new Employee(11, "Mariem", "Salah", "RH", 2);
        Employee a3 = new Employee(12, "Yassine", "Mokni", "Finance", 4);

        Departement d1 = new Departement(100, "IT");
        Departement d2 = new Departement(200, "RH");
        Departement d3 = new Departement(300, "Finance");

        map.ajouterEmployeDepartement(a1, d1);
        map.ajouterEmployeDepartement(a2, d2);
        map.ajouterEmployeDepartement(a3, d3);

        map.afficherEmployesEtDepartements();

        map.ajouterEmployeDepartement(a1, d3);
        map.afficherEmployesEtDepartements();

        map.supprimerEmploye(a2);
        map.afficherEmployesEtDepartements();

        map.supprimerEmployeEtDepartement(a1, d3);
        map.afficherEmployesEtDepartements();

        map.afficherEmployes();
        map.afficherDepartements();

        System.out.println(map.rechercherEmploye(a3));
        System.out.println(map.rechercherDepartement(d2));

        System.out.println(map.trierMap());
    }
}
