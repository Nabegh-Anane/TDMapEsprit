import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;

public class SocieteHashMap implements InterfaceSociete {
    private HashMap<Employe, Departement> employeDepartementMap = new HashMap<>();

    @Override
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        employeDepartementMap.put(e, d);
    }

    @Override
    public void supprimerEmploye(Employe e) {
        employeDepartementMap.remove(e);
    }

    @Override
    public void afficherLesEmployesLeursDepartements() {
        employeDepartementMap.forEach((e, d) ->
                System.out.println(e + " appartient au département " + d));
    }

    @Override
    public void afficherLesEmployes() {
        employeDepartementMap.keySet().forEach(System.out::println);
    }

    @Override
    public void afficherLesDepartements() {
        employeDepartementMap.values().stream().distinct().forEach(System.out::println);
    }

    @Override
    public void afficherDepartement(Employe e) {
        Departement d = employeDepartementMap.get(e);
        if (d != null) {
            System.out.println("L'employé " + e + " appartient au département " + d);
        } else {
            System.out.println("Aucun département trouvé pour cet employé.");
        }
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        return employeDepartementMap.containsKey(e);
    }

    @Override
    public boolean rechercherDepartement(Departement d) {
        return employeDepartementMap.containsValue(d);
    }

    public TreeMap<Employe, Departement> triParCIN() {
        TreeMap<Employe, Departement> sortedMap = new TreeMap<>((e1, e2) -> e1.getCin().compareTo(e2.getCin()));
        sortedMap.putAll(employeDepartementMap);
        return sortedMap;
    }

    public TreeMap<Employe, Departement> triParNom() {
        TreeMap<Employe, Departement> sortedMap = new TreeMap<>((e1, e2) -> e1.getNom().compareTo(e2.getNom()));
        sortedMap.putAll(employeDepartementMap);
        return sortedMap;
    }
}
