package modele;

import java.util.LinkedList;
import java.util.List;

public class Partie {
	    private Grille grille;
	    private Joueur joueur1;
	    private Joueur joueur2;
	    private List<Coup> coupsJoues;

	    public Partie(int taille, Joueur joueur1, Joueur joueur2) {
	        this.grille = new Grille(taille);
	        this.joueur1 = joueur1;
	        this.joueur2 = joueur2;
	        this.coupsJoues = new LinkedList<>();
	    }

	    public void jouer() {
	       
	    }

	    public void annulerDernierCoup() {
	        
	    }
	}

