package modele;
import java.util.LinkedList;

public class AlignementCase {


	private Orientation orientation;
	private LinkedList<Case>  lesCases;
	private int position;
	
	public AlignementCase(Orientation orientation, LinkedList<Case> lesCases, int position) {
		this.orientation = orientation;
		this.lesCases = lesCases;
		this.position = position;
	}
	// Méthode pour ajouter une case à l'alignement
    public void ajouterCase(Case c) {
        lesCases.add(c);
    }

	public Orientation getOrientation() {
		return orientation;
	}

	public LinkedList<Case> getLesCases() {
		return lesCases;
	}

	public int getPosition() {
		return position;
	}
}

