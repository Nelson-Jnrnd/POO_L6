import java.util.Arrays;
import java.util.LinkedList;

public class Groupe {

    private int numero;
    private int trimestre;
    private String orientation;

    /**
     * On fait l'hypopthèse que les groupes ne changent pas d'effectifs une fois crées
     */
    private Etudiant[] groupe;
    private LinkedList<Lecon> leconsSuivies;
    private String nom;

    public Groupe(String nom, String orientation, int numero, int trimestre, Etudiant[] groupe){
        if(groupe.length > 0)
            this.groupe = Arrays.copyOf(groupe, groupe.length);
        this.nom = nom;
        this.orientation = orientation;
        this.trimestre = trimestre;
        this.numero = numero;
        leconsSuivies = new LinkedList<>();
    }
    public String horaire(){
        StringBuilder stringBuilder = new StringBuilder("-- Horaire du groupe " + nom
                + " (" + nombreEtudiants() + " etudiants)");
        stringBuilder.append(Lecon.horaire(leconsSuivies));
        return stringBuilder.toString();
    }
    public String nom(){
        return nom;
    }
    public int nombreEtudiants(){
        return groupe.length;
    }
    public void definirLecons(Lecon[] lecons){
        leconsSuivies = new LinkedList<>(); // TOOD  peut-être changer jsp
        leconsSuivies.addAll(Arrays.asList(lecons));
    }
    
}
