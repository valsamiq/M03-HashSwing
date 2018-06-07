package entities;

public class PokemonFire extends Pokemon {

    public PokemonFire(String nom, int atk, int def, int hpt) {
        super(nom, atk, def, hpt);
    }

    @Override
    public String toString() {
        return "PokemonWater{ nom= " + getNom() + ", atk= " + getAtk() + ", def= " + getDef() + ", hpt= " + getHpt() + '}';
    }
}