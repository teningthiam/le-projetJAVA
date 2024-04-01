package modele;
import modeTexte.PartieTest;
public class Grille {
	 int taille;
	    Case[][] cases;

	    public Grille(int taille) {
	        this.taille = taille;
	        cases = new Case[taille][taille];
}
}
