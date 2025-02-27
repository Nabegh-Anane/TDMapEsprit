# Object-Oriented Design and Java Programming

## Module: Interfaces and Collections - MAP

### Objective
Implement object-oriented concepts using Java by creating classes, interfaces, and implementing collections like `HashMap` and `TreeMap`.

---

### Classes

#### 1. **Employe**
- Characteristics:
  - `cin` (National ID)
  - `matricule` (Employee ID)
  - `nom` (Last Name)
  - `prenom` (First Name)

#### 2. **Departement**
- Characteristics:
  - `identifiant` (ID)
  - `nom` (Name)

---

### Requirements for Each Class
1. Two constructors (one with no parameters).
2. Getters and Setters for all fields.
3. `toString()` method for displaying object information.
4. `equals()` method to compare objects.

---

### Interface: `InterfaceSociete`

```java
public interface InterfaceSociete {
    public void ajouterEmployeDepartement(Employe e, Departement d);
    public void supprimerEmploye(Employe e);
    public void afficherLesEmployesLeursDepartements();
    public void afficherLesEmployes();
    public void afficherLesDepartements();
    public void afficherDepartement(Employe e);
    public boolean rechercherEmploye(Employe e);
    public boolean rechercherDepartement(Departement d);
}
```

---

### Implementations

#### 1. **SocieteHashMap**
- Implements `InterfaceSociete` using a `HashMap` for managing employees and their respective departments.

#### 2. **SocieteTreeMap**
- Implements `InterfaceSociete` using a `TreeMap` for managing employees and their respective departments.

---

### Features to Implement
1. Add an employee to a department.
2. Remove an employee.
3. Display all employees and their departments.
4. Display all employees.
5. Display all departments.
6. Show the department of a specific employee.
7. Search for an employee.
8. Search for a department.

---

### How to Use
1. Create instances of `Employe` and `Departement`.
2. Instantiate either `SocieteHashMap` or `SocieteTreeMap`.
3. Use the provided methods in the interface to manage employees and departments.

### Example Usage
```java
Employe emp1 = new Employe("123456", "E001", "Doe", "John");
Departement dept1 = new Departement("D01", "IT");

SocieteHashMap societe = new SocieteHashMap();
societe.ajouterEmployeDepartement(emp1, dept1);
societe.afficherLesEmployesLeursDepartements();
```

---

### Notes
- **`HashMap`**: Provides constant-time performance for basic operations (add, search, delete).
- **`TreeMap`**: Maintains the natural order of keys or a specified comparator.

