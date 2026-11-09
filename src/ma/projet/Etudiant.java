
package ma.projet;

public class Etudiant extends Personne {

    private String filiere;

    public Etudiant(String nom, int age, String filiere) {
        super(nom, age);
        this.filiere = filiere;
    }

    @Override
    public void afficher() {
        System.out.println("Etudiant : " + nom);
        System.out.println("Age : " + age);
        System.out.println("Filiere : " + filiere);
    }
}
