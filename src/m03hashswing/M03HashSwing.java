package m03hashswing;
import entities.Pokemon;
import java.util.HashMap;

public class M03HashSwing {

    public static void main(String[] args) {
        Main main = new Main();
        main.setLocationRelativeTo(null);
        main.setVisible(true);
    }
    public static HashMap<String, Pokemon> Pokemons= new HashMap<String, Pokemon>();
}