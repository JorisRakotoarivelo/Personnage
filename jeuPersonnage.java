import java.util.Scanner;
import Personnage.*;
public class jeuPersonnage {
    public static void main(String[] args) {
        Personnage UnSorcier = new Personnage ("Sorcier", 200, 1, 200, 100);

        //Information sur le personnage
        System.out.println("info sur le personnage -----> Nom = " + UnSorcier.LeNom());
        System.out.println("info sur le personnage -----> Vie = " + UnSorcier.LaVie());
        System.out.println("info sur le personnage -----> Niveaux = " + UnSorcier.LeNiveau());
        System.out.println("info sur le personnage -----> exp = " + UnSorcier.Experience());

        //Le sorcier reçois des dégats
        System.out.println("Le sorcier a reçu 100 points de dégat");
        UnSorcier.Degat(100);
        System.out.println("Il lui reste maintenant " + UnSorcier.LaVie() + " point de vie");

        //Le sorcier reçois de la vie
        System.out.println("Le sorcier prend une potion et reçois 50 points de vie");
        UnSorcier.Life(50);
        System.out.println("Il lui reste maintenant " + UnSorcier.LaVie() + " point de vie");

        //Un ennemie est arrivé
        System.out.println("Un ennemie est arrivé");

        //Information sur le gobelin
        Personnage UnGobelin = new Personnage ("Gobelin", 100, 5, 1000, 100);
        System.out.println("info sur le personnage -----> Nom = " + UnGobelin.LeNom());
        System.out.println("info sur le personnage -----> Vie = " + UnGobelin.LaVie());
        System.out.println("info sur le personnage -----> Niveaux = " + UnGobelin.LeNiveau());
        System.out.println("info sur le personnage -----> exp = " + UnGobelin.Experience());
    
        //Création d'un nouveau personnage.
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Un nouveau joueur est arrivée dans le monde.");
            System.out.println("Veuillez saisir votre pseudo : ");
            Personnage Newpersonnage = new Personnage(sc.nextLine(), 100, 1, 200, 100);
            System.out.println("Vous avez saisi : " + Newpersonnage.LeNom());
            System.out.println("info sur le personnage -----> Nom = " + Newpersonnage.LeNom());
            System.out.println("info sur le personnage -----> Vie = " + Newpersonnage.LaVie());
            System.out.println("info sur le personnage -----> Niveaux = " + Newpersonnage.LeNiveau());
            System.out.println("info sur le personnage -----> exp = " + Newpersonnage.Experience());

            //En plus à mettre.
            System.out.println(Newpersonnage.LeNom() + " se balade dans la foret et tombe sur un gobelin");

            //Le nouveau personnage attaque le gobelin. 
            System.out.println(Newpersonnage.LeNom() + " attaque le gobelin ");
            System.out.println(Newpersonnage.LeNom() + " inflige " + Newpersonnage.nb_degat() + " points de dégat au " + UnGobelin.LeNom());
            UnGobelin.Degat(100);
            System.out.println("Le " + UnGobelin.LeNom() + " est tombée à " + UnGobelin.LaVie() + " point de vie ");

            //Le gobelin meurt quand sa vie est égal à 0.
            if (UnGobelin.LaVie() == 0) {
                System.out.println("Le " + UnGobelin.LeNom() + " vient de mourir");
                System.out.println("Bravo, vous avez gagnez de l'exp");
            }
            //Le personnage reçois de l'exp
            if (UnGobelin.LeNiveau() <= 5) {
                Newpersonnage.EXP(200);
                System.out.println("Vous avez " + Newpersonnage.Experience() + " points d'exp ");
            }
            //Passage d'un niveau
            if (Newpersonnage.Experience() == 400) {
                Newpersonnage.Level(1);
                System.out.println("Vous êtes passé niveau " + Newpersonnage.LeNiveau());
            }

            //Le sorcier rencontre le nouveau personnage et donne au 2 potions de 50 points de vie chacune.
            System.out.println("Le " + UnSorcier.LeNom() + " rencontre " + Newpersonnage.LeNom());
            System.out.println("Le " + UnSorcier.LeNom() + " donne 2 potions de 50 points de vie à " + Newpersonnage.LeNom() + " et les bois");
            Newpersonnage.Life(50 * 2);
            System.out.println(Newpersonnage.LeNom() + " à maintenant " + Newpersonnage.LaVie() + " points de vie");

            //Info sur le personnage après le level up
            System.out.println("info sur le personnage -----> Nom = " + Newpersonnage.LeNom());
            System.out.println("info sur le personnage -----> Vie = " + Newpersonnage.LaVie());
            System.out.println("info sur le personnage -----> Niveaux = " + Newpersonnage.LeNiveau());
            System.out.println("info sur le personnage -----> exp = " + Newpersonnage.Experience());
        }
    }
}
