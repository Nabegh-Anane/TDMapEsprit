import java.util.Objects;

public class Employe {
    private String cin;
    private String matricule;
    private String nom;
    private String prenom;

    // Constructeur sans paramètre
    public Employe() {}

    // Constructeur avec paramètres
    public Employe(String cin, String matricule, String nom, String prenom) {
        this.cin = cin;
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
    }

    // Getters et Setters
    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    // Méthode toString
    @Override
    public String toString() {
        return "Employe [cin=" + cin + ", matricule=" + matricule + ", nom=" + nom + ", prenom=" + prenom + "]";
    }

    // Méthode equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employe employe = (Employe) o;
        return Objects.equals(cin, employe.cin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cin);
    }
}

