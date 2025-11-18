package tn.esprit.prosit9.entities;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
public class AffectationHashMap {
    private Map<Employee, Departement> affectations;

    public AffectationHashMap() {
        affectations = new HashMap<>();
    }

    public void ajouterEmployeDepartement(Employee e, Departement d) {
        affectations.put(e, d);
    }

    // Instruction 3
    public void afficherEmployesEtDepartements() {
        for (Map.Entry<Employee, Departement> entry : affectations.entrySet()) {
            System.out.println(entry.getKey() + " " +entry.getValue());
        }
    }

    public void supprimerEmploye(Employee e) {
        affectations.remove(e);
    }

    public void supprimerEmployeEtDepartement(Employee e, Departement d) {
        affectations.remove(e, d);
    }

    public void afficherEmployes() {
        for (Employee e : affectations.keySet()) {
            System.out.println(e);
        }
    }

    public void afficherDepartements() {
        for (Departement d : affectations.values()) {
            System.out.println(d);
        }
    }

    public boolean rechercherEmploye(Employee e) {
        return affectations.containsKey(e);
    }

    public boolean rechercherDepartement(Departement d) {
        return affectations.containsValue(d);
    }

    public TreeMap<Employee, Departement> trierMap() {
        return new TreeMap<>(affectations);
    }
}
