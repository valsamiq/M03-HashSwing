package entities;

public class PokemonWater extends Pokemon{
    private String type;

    public PokemonWater(String type, String nom, int atk, int def, int hpt) {
        super(nom, atk, def, hpt);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "PokemonWater{ nom= " + getNom() + ", type= " + type + ", atk= " + getAtk() + ", def= " + getDef() + ", hpt= " + getHpt() + '}';
    }
}