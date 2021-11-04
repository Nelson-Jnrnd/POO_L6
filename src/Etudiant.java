/**
 * Authors:     Alen Bijelic, Nelson Jeanrenaud
 * Date:        04.11.2021
 *
 * Description:
 */
public class Etudiant extends Personne
{
    private int matricule;

    /**
     * Constructeur
     * @param nom Nom de l'étudiant
     * @param prenom Prénom de l'étudiant
     * @param matricule Matricule de l'étudiant
     */
    Etudiant(String nom, String prenom, int matricule)
    {
        super(nom, prenom);
        this.matricule = matricule;
    }

    /**
     * Permet d'afficher le titre d'étudiant, son prénom, son nom et son matricule
     * @return String avec les informations de l'étudiant
     */
    public String toString()
    {
        return "Etud. " + super.toString() + " (#" + matricule + ")";
    }
}