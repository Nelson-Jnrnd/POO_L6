public class Main {
    public static void main(String[] argv){
        Etudiant etudiant1 = new Etudiant("Bijelic", "Alen", 1234);
        Professeur professeur1 = new Professeur("Donini", "Pier", "PDO");
        System.out.println(etudiant1);
        System.out.println(professeur1);

        Etudiant etudiant2 = new Etudiant("Némar", "Jean", 444);
        Groupe groupe1 = new Groupe("super groupe", "ICL", 1, 3, new Etudiant[]{etudiant1, etudiant2});
        Lecon POO = new Lecon("POO", "H02", 4, 5, 2);
        groupe1.definirLecons(new Lecon[] {POO});
    }
}
