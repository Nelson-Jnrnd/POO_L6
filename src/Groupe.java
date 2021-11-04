import java.util.Arrays;

public class Groupe {

    private int numero;
    private int trimestre;
    private String orientation;

    private Etudiant[] groupe;
    private String nom;

    public Groupe(String nom, Etudiant[] groupe){
        if(groupe.length > 0)
            this.groupe = Arrays.copyOf(groupe, groupe.length);
        this.nom = nom;
    }
    public String horaire(){
        StringBuilder stringBuilder = new StringBuilder("-- Horaire du groupe " + nom
                + " (" + nombreEtudiants() + " etudiants)");
        return stringBuilder.toString();
    }
    public String nom(){
        return nom;
    }
    public int nombreEtudiants(){
        return groupe.length;
    }
    public void definirLecons(){

    }
}
