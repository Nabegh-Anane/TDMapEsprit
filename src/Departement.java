import java.util.Objects;

public class Departement {
    private int id;
    private String nom;

    // Constructeur sans paramètre
    public Departement() {}

    // Constructeur avec paramètres
    public Departement(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    // Getters et Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    // Méthode toString
    @Override
    public String toString() {
        return "Departement [id=" + id + ", nom=" + nom + "]";
    }

    // Méthode equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departement that = (Departement) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
