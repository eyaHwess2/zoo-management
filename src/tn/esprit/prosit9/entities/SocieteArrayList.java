package tn.esprit.prosit9.entities;
import java.util.*;

public class SocieteArrayList implements IGestion<Employee> {
    private ArrayList<Employee> employees = new ArrayList<>();

    @Override
    public void ajouterEmploye(Employee e) {
        employees.add(e);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employee e : employees) {
            if (e.getNom().equals(nom)) return true;
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employee e) {
        return employees.contains(e);
    }

    @Override
    public void supprimerEmploye(Employee e) {
        employees.remove(e);
    }

    @Override
    public void displayEmploye() {
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(employees, Comparator.comparingInt(Employee::getId));
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        Collections.sort(employees, Comparator
                .comparing(Employee::getDepartement)
                .thenComparing(Employee::getNom)
                .thenComparingInt(Employee::getGrade));
    }
}
