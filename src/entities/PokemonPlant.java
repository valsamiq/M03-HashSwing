package entities;

public class PokemonPlant extends Pokemon {

    public PokemonPlant(String nom, int atk, int def, int hpt) {
        super(nom, atk, def, hpt);
    }

    @Override
    public String toString() {
        return "PokemonWater{ nom= " + getNom() + ", atk= " + getAtk() + ", def= " + getDef() + ", hpt= " + getHpt() + '}';
    }
}