public class Main {
    public static void main(String[] args) {
        SocieteHashMap societe = new SocieteHashMap();

        Employe e1 = new Employe("00000000", "ID01", "Pato", "Alexander");
        Employe e2 = new Employe("11111111", "ID02", "Ibrahimoviç", "Zlatan");

        Departement d1 = new Departement(1, "AC");
        Departement d2 = new Departement(2, "SS");

        societe.ajouterEmployeDepartement(e1, d1);
        societe.ajouterEmployeDepartement(e2, d2);

        societe.afficherLesEmployesLeursDepartements();

        System.out.println("Tri par CIN:");
        societe.triParCIN().forEach((e, d) -> System.out.println(e + " -> " + d));

        System.out.println("Tri par Nom:");
        societe.triParNom().forEach((e, d) -> System.out.println(e + " -> " + d));
    }
}
