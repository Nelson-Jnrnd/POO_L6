import java.util.LinkedList;

public class Lecon {
    private static final String[] JOURS_SEMAINE = {"Lun", "Mar", "Mer", "Jeu", "Ven"};
    private static final String[] PERIODE_DEBUT = {"8:30", "9:15", "10:25", "11:15", "12:00", "13:15", "14:00", "14:55", "15:45", "16:35", "17:20"};

    private static final char LINE_CHAR     = '|';
    private static final char COLUMN_CHAR   = '-';
    private static final char EMPTY_CHAR    = ' ';

    private static final int COLUMN_WIDTH   = 13; // Minimum 11 pour permettre un affichage correcte des leçons
    private static final int PADDING_HORAIRE = 6;

    private String matiere;
    private String salle;
    private int jourSemaine;
    private int periodeDebut;
    private int duree;
    private Professeur professeur;

    public Lecon(String matiere, String salle, int jourSemaine, int periodeDebut, int duree) throws RuntimeException {
        if(periodeDebut + duree > PERIODE_DEBUT.length){
            throw new RuntimeException("Le cours sort de l'affichage de l'horaire");
        }

        this.matiere = matiere;
        this.salle = salle;
        this.jourSemaine = jourSemaine;
        this.periodeDebut = periodeDebut;
        this.duree = duree;
    }

    public Lecon(String matiere, String salle, int jourSemaine, int periodeDebut, int duree, Professeur professeur) throws RuntimeException {
        this(matiere, salle, jourSemaine, periodeDebut, duree);
        this.professeur = professeur;
    }

    public static String horaire(LinkedList<Lecon> lecons)
    {
        StringBuilder horaire = new StringBuilder();

        for(int i = 0; i < PERIODE_DEBUT.length; ++i)
        {
            String fullColumn = String.format(String.format("%%-%ds%c", COLUMN_WIDTH, LINE_CHAR), String.valueOf(COLUMN_CHAR).repeat(COLUMN_WIDTH));
            String emptyColumn = String.format(String.format("%%-%ds%c", COLUMN_WIDTH, LINE_CHAR), String.valueOf(EMPTY_CHAR).repeat(COLUMN_WIDTH));
            String emptyPadding = String.format(String.format("\n%%%ds", PADDING_HORAIRE), LINE_CHAR);

            // Affichage de l'en-tête
            if(i == 0)
            {
                // Ajout du padding sans horaire
                horaire.append(emptyPadding);
                for (String s : JOURS_SEMAINE) {
                    // Affichage des jours de la semaine
                    horaire.append(String.format(String.format("%%-%ds%c", COLUMN_WIDTH, LINE_CHAR), EMPTY_CHAR + s));
                }
                // Ajout du padding sans horaire
                horaire.append(emptyPadding);
                // Affichage d'une ligne complète
                horaire.append(String.valueOf(fullColumn).repeat(JOURS_SEMAINE.length));
            }

            // Ajout du padding avec l'horaire
            horaire.append(String.format(String.format("\n%%%ds", PADDING_HORAIRE), PERIODE_DEBUT[i] + LINE_CHAR));

            // Affichage d'une ligne où seront écrites les leçons
            for(int j = 0; j < JOURS_SEMAINE.length; ++j){
                boolean leconALieu = false;
                for(Lecon lecon : lecons){
                    if(lecon.periodeDebut == i && lecon.jourSemaine == j){
                        String leconFormat = String.format("%s   %s %s", lecon.matiere, lecon.salle, lecon.professeur != null ? lecon.professeur.abreviation() : "");
                        horaire.append(String.format(String.format("%%-%ds%c", COLUMN_WIDTH, LINE_CHAR), leconFormat));
                        leconALieu = true;
                        break;
                    }
                }
                if (!leconALieu){
                    horaire.append(emptyColumn);
                }
            }

            // Ajout du padding sans horaire
            horaire.append(emptyPadding);

            // Affichage d'une ligne complète
            for(int j = 0; j < JOURS_SEMAINE.length; ++j){
                boolean leconSurPlusieursPeriode = false;
                for(Lecon lecon : lecons){
                    if(j == lecon.jourSemaine && i >= lecon.periodeDebut && i < lecon.periodeDebut + lecon.duree - 1){
                        horaire.append(emptyColumn);
                        leconSurPlusieursPeriode = true;
                        break;
                    }
                }
                if(!leconSurPlusieursPeriode){
                    horaire.append(fullColumn);
                }
            }
        }

        return horaire.toString();
    }
}