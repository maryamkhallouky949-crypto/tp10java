
package ma.projet;

import java.util.ArrayList;
import java.util.List;

public class TestPersonne {

    public static <T extends Personne> void afficherListe(
            List<T> personnes) {

        for (T p : personnes) {
            p.afficher();
          
        }
    }

    public static void main(String[] args) {

        List<Etudiant> etudiants = new ArrayList<>();

        etudiants.add(new Etudiant("Maryam", 20, "Informatique"));
        etudiants.add(new Etudiant("Sara", 21, "Mathématiques"));

        List<Enseignant> enseignants = new ArrayList<>();

        enseignants.add(new Enseignant("Ahmed", 40, "Java"));
        enseignants.add(new Enseignant("Fatima", 45, "Python"));

        System.out.println(" ETUDIANTS ");

        afficherListe(etudiants);

        System.out.println("ENSEIGNANTS");

        afficherListe(enseignants);
    }
}
