import java.util.LinkedList;

/**
 * Authors:     Alen Bijelic, Nelson Jeanrenaud
 * Date:        04.11.2021
 *
 * Description:
 */
public class Professeur extends Personne
{
    private String abreviation;

    private LinkedList<Lecon> leconsEnseignes;
    /**
     * Constructeur
     * @param nom Nom du professeur
     * @param prenom Prénom du professeur
     * @param abreviation Abréviation du professeur
     */
    Professeur(String nom, String prenom, String abreviation)
    {
        super(nom, prenom);
        this.abreviation = abreviation;
        this.leconsEnseignes = new LinkedList<>();
    }

    /**
     * Getter pour l'abreviation du professeur
     * @return String de l'abréviation du professeur
     */
    public String abreviation()
    {
        return abreviation;
    }

    /**
     * Permet d'afficher le titre de professeur, son prénom, son nom et son abréviation
     * @return String avec les informations du professeur
     */
    public String toString()
    {
        return "Prof. " + super.toString() + " (" + abreviation() + ")";
    }

    /**
     * Créer une grille avec l'horaire hebdomadaire du professeur
     * @return String avec l'horaire hebdomadaire du professeur
     */
    public String horaire()
    {
        return "";
    }
}
