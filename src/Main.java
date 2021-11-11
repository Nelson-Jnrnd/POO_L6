public class Main {
    public static void main(String[] argv){
        Professeur Rossier = new Professeur("Rossie", "Daniel", "DRE");
        Professeur Donini = new Professeur("Donini", "Pier", "PDO");

        Lecon POO = new Lecon("POO", "H02", 4, 5, 2);
        Lecon SYE = new Lecon("SYE", "H01", 4, 7, 3);
        Lecon TIC = new Lecon("TIC", "A23", 0, 1, 1);

        Etudiant Lennon = new Etudiant("Lennon", "John", 1234);
        Etudiant McCartney = new Etudiant("Mc Cartney", "Paul", 1234);
        Etudiant Starr = new Etudiant("Starr", "Ringo", 1234);
        Etudiant Harisson = new Etudiant("Waters", "Roger", 1234);
        Etudiant Gilmour = new Etudiant("Gilmour", "David", 1234);

        Groupe IL6_1 = new Groupe("IL6-1", "IL", 1, 6, new Etudiant[]{Lennon, McCartney, Starr, Harisson});
        Groupe SI6_1 = new Groupe("SI6-1", "SI", 1, 6, new Etudiant[]{Harisson, Gilmour});

        Personne[] heig = new Personne[]{Rossier, Donini, Lennon, McCartney, Starr, Harisson, Gilmour};

        System.out.println("-- Membre de l'école");
        for(Personne p : heig){
            System.out.println(p);
        }
        System.out.println(IL6_1.horaire());
        System.out.print(Donini.horaire());
    }
}
