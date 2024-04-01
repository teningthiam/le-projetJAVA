package modele;

public class JoueurOrdinateur extends Joueur {
	
    public JoueurOrdinateur(String nom) {
        super(nom);
    }

    @Override
    public Coup jouerCoup(Grille grille) {
        return null;
    }
}
