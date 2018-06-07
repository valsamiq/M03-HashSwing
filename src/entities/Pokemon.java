package entities;

public abstract class Pokemon implements Catchable{
    private String nom;
    private int atk;
    private int def;
    private int hpt;

    public Pokemon(String nom, int atk, int def, int hpt) {
        this.nom = nom;
        this.atk = atk;
        this.def = def;
        this.hpt = hpt;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getHpt() {
        return hpt;
    }

    public void setHpt(int hpt) {
        this.hpt = hpt;
    }

    @Override
    public String toString() {
        return "Pokemon{" + "nom=" + nom + ", atk=" + atk + ", def=" + def + ", hpt=" + hpt + '}';
    }
    
}
