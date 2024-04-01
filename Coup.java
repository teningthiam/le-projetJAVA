package modele;

public class Coup extends Joueur{
	private Joueur joueur;
	private Position positionCase;
	private Orientation orientation; 
 public Coup(String nom, Joueur joueur, Position positionCase, Orientation orientation) {
		super(nom);
		this.joueur = joueur;
		this.positionCase = positionCase;
		this.orientation = orientation;
	}
		@Override
	Position jouerCoup(Grille grille) {
		// TODO Auto-generated method stub
		return null;
	}

}
