package modele;

public class Orientation {
    public static final int VERTICALE = 0;
    public static final int HORIZONTALE = 1;

    private int orientation;

    public Orientation(int orientation) {
        this.orientation = orientation;
    }

    public boolean estVerticale() {
        return orientation == VERTICALE;
    }

    public boolean estHorizontale() {
        return orientation == HORIZONTALE;
    }
}


