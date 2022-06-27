package Personnage;
public class Personnage {

    //Le constructeur
    public Personnage(String name, int life, int level, int EXP, int dégat) {
        this.nom = name;
        this.vie = life;
        this.niveau = level;
        this.exp = EXP;
        this.nb_degat = dégat;
    }
    //Mettre des dégats
    public void Degat(int nb_degat) {
        this.vie = this.vie - nb_degat;
    }
    //Rajoute de la vie
    public void Life(int nb_life) {
        this.vie = this.vie + nb_life;
    }
    //Montez en niveau
    public void Level(int nb_level) {
        this.niveau = this.niveau + nb_level;
    }
    //Gagnez de l'exp
    public void EXP(int nb_exp) {
        this.exp = this.exp + nb_exp;
    }
    //Ascesseur
    public String LeNom() {
        return this.nom;
    }
    public int LaVie() {
        return this.vie;
    }
    public int LeNiveau() {
        return this.niveau;
    }
    public int Experience() {
        return this.exp;
    }
    public int nb_degat() {
        return this.nb_degat;
    }
    //Les Attributs
        private String nom;
        private int vie;
        private int niveau;
        private int exp;
        private int nb_degat;
}