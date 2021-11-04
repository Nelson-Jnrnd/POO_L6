/**
 * Authors:     Alen Bijelic, Nelson Jeanrenaud
 * Date:        04.11.2021
 *
 * Description:
 */
public class Personne
{
    private String nom;
    private String prenom;

    /**
     * Constructor
     * @param nom Nom de la personne
     * @param prenom Prénom de la personne
     */
    Personne(String nom, String prenom)
    {
        this.nom = nom;
        this.prenom = prenom;
    }

    /**
     * Permet d'afficher le prénom et le nom de la personne
     * @return String composé du prénom et du nom
     */
    public String toString()
    {
        return prenom + " " + nom;
    }
}
