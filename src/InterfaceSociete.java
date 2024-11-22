public interface InterfaceSociete {
    void ajouterEmployeDepartement(Employe e, Departement d);
    void supprimerEmploye(Employe e);
    void afficherLesEmployesLeursDepartements();
    void afficherLesEmployes();
    void afficherLesDepartements();
    void afficherDepartement(Employe e);
    boolean rechercherEmploye(Employe e);
    boolean rechercherDepartement(Departement d);
}

