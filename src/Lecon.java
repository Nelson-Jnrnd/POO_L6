public class Lecon {
    private static String[] JOURS_SEMAINE = {"Lun", "Mar", "Mer", "Jeu", "Ven"};

    private String matiere;
    private String salle;
    private int jourSemaine;
    private int periodeDebut;
    private int duree;

    public Lecon(String matiere, String salle, int jourSemaine, int periodeDebut, int duree) {
        this.matiere = matiere;
        this.salle = salle;
        this.jourSemaine = jourSemaine;
        this.periodeDebut = periodeDebut;
        this.duree = duree;
    }

    public static String horaire(){
        return "";
    }
}
