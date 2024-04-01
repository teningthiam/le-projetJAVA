package modeTexte;

import modele.Coup;
import modele.Grille;
import modele.JoueurHumain;
import modele.JoueurOrdinateur;
import modele.Position;

import java.util.ArrayList;
import java.util.List;

public class PartieTest {

    private static List<Coup> coupsJoues = new ArrayList<>(); 

    public static void main(String[] args) {
        // Initialisation de la grille
        int tailleGrille = 5; 
        Grille grille = new Grille(tailleGrille);

        // Initialisation des joueurs
        JoueurHumain joueur1 = new JoueurHumain("Joueur 1");
        JoueurOrdinateur joueur2 = new JoueurOrdinateur("Joueur 2");
        while (true) {
            // Joueur 1 joue
            Coup coupJoueur1 = joueur1.jouerCoup(grille);
            if (coupJoueur1 != null) {
                coupsJoues.add(coupJoueur1);
                
            }

            Coup coupJoueur2 = joueur2.jouerCoup(grille);
            if (coupJoueur2 != null) {
                coupsJoues.add(coupJoueur2);
            }


        }
    }
}