public class Main {
    public static void main(String[] argv){
        Professeur Rossier = new Professeur("Rossie", "Daniel", "DRE");
        Professeur Donini = new Professeur("Donini", "Pier", "PDO");

        Lecon POO1 = new Lecon("POO", "H02", 2, 5, 2, Donini);
        Lecon POO2 = new Lecon("POO", "H02", 3, 5, 2, Donini);
        Lecon POO3 = new Lecon("POO", "H02", 3, 7, 2, Donini);
        Lecon SYE1 = new Lecon("SYE", "G01", 0, 0, 2, Rossier);
        Lecon SYE2 = new Lecon("SYE", "H01", 3, 2, 2, Rossier);
        Lecon TIC = new Lecon("TIC", "F06", 1, 9, 1);

        Donini.addLecon(new Lecon[]{POO1, POO2, POO3});
        Rossier.addLecon(new Lecon[]{SYE1, SYE2});

        Etudiant Lennon = new Etudiant("Lennon", "John", 1234);
        Etudiant McCartney = new Etudiant("Mc Cartney", "Paul", 2341);
        Etudiant Starr = new Etudiant("Starr", "Ringo", 3241);
        Etudiant Harisson = new Etudiant("Waters", "Roger", 4321);
        Etudiant Gilmour = new Etudiant("Gilmour", "David", 4312);

        Groupe IL6_1 = new Groupe("IL6-1", "IL", 1, 6, new Etudiant[]{Lennon, McCartney, Starr, Harisson});
        Groupe SI6_1 = new Groupe("SI6-1", "SI", 1, 6, new Etudiant[]{Harisson, Gilmour});
        IL6_1.definirLecons(new Lecon[]{SYE1, SYE2, POO1, POO2, POO3, TIC});
        SI6_1.definirLecons(new Lecon[]{POO1, POO2, POO3});
        Personne[] heig = new Personne[]{Rossier, Donini, Lennon, McCartney, Starr, Harisson, Gilmour};

        System.out.println("-- Membre de l'école");
        for(Personne p : heig){
            System.out.println(p);
        }

        System.out.println();

        System.out.println(IL6_1.horaire());
        System.out.println();
        System.out.println();
        System.out.print(Donini.horaire());
    }
}