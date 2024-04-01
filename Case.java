package modele;


public class Case {
    private int value;
    private boolean selected;

    public Case(int value) {
        this.value = value;
        this.selected = false;
    }

    public int getValue() {
        return value;
    }

    public boolean isSelected() {
        return selected;
    }

    public void select() {
        this.selected = true;
    }
}