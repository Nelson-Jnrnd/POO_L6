public class Lecon {
    private static final String[] JOURS_SEMAINE = {"Lun", "Mar", "Mer", "Jeu", "Ven"};
    private static final String[] PERIODE_DEBUT = {"8:30", "9:15", "10:25", "11:15", "12:00", "13:15", "14:00", "14:55", "15:45", "16:35", "17:20"};

    private static final char LINE_CHAR     = '|';
    private static final char COLUMN_CHAR   = '-';
    private static final char EMPTY_CHAR    = ' ';

    private static final int COLUMN_WIDTH   = 13;
    private static final int PADDING_HORAIRE = 5;

    private String matiere;
    private String salle;
    private int jourSemaine;
    private int periodeDebut;
    private int duree;

    private Professeur professeur;

    // TODO: peut etre plus simple avec des printf et format()
    public static String horaire()
    {
        StringBuilder stringBuilder = new StringBuilder();
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

        return stringBuilder.toString();
    }

    // TODO: enlever à la fin
    // sert juste pour tester localement
    public static void main(String[] args) {
        String horaire = horaire();
        System.out.println(horaire);
    }
}
