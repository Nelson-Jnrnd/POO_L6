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

    public Lecon(String matiere, String salle, int jourSemaine, int periodeDebut, int duree) {
        this.matiere = matiere;
        this.salle = salle;
        this.jourSemaine = jourSemaine;
        this.periodeDebut = periodeDebut;
        this.duree = duree;
    }

    // TODO: peut etre plus simple avec des printf et format()
    public static String horaire()
    {
        /*StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < PERIODE_DEBUT.length; ++i)
        {
            if(i == 0) {
                stringBuilder.append(String.valueOf(EMPTY_CHAR).repeat(PADDING_HORAIRE));
                for (int k = 0; k < JOURS_SEMAINE.length; ++k) {
                    stringBuilder.append(LINE_CHAR + String.valueOf(EMPTY_CHAR) + JOURS_SEMAINE[k]);
                    stringBuilder.append(String.valueOf(EMPTY_CHAR).repeat(COLUMN_WIDTH - 2 - JOURS_SEMAINE[k].length()));
                }
                stringBuilder.append(LINE_CHAR);
            }
            for(int j = 0; j < JOURS_SEMAINE.length; ++j)
            {

            }
        }

        return stringBuilder.toString();*/
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
            // TODO: Transformer en boucle pour pouvoir écrire la leçon
            horaire.append(String.valueOf(emptyColumn).repeat(JOURS_SEMAINE.length));
            // Ajout du padding sans horaire
            horaire.append(emptyPadding);
            // Affichage d'une ligne complète
            // TODO: Transformer en boucle pour pouvoir enlever les traietillé si une leçon s'étend sur plusieurs périodes
            horaire.append(String.valueOf(fullColumn).repeat(JOURS_SEMAINE.length));

        }

        return horaire.toString();
    }

    // TODO: enlever à la fin
    // sert juste pour tester localement
    public static void main(String[] args) {
        String horaire = horaire();
        System.out.println(horaire);
    }
}
