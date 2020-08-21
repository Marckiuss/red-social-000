import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class EntradaEvento extends Entrada {

    private String evento;

    public EntradaEvento(String usuario, String evento) {
        super(usuario);
        this.evento = evento;
    }

    @Override
    public String toString() {
        String aDevolver = "";
        aDevolver += super.toString();
        aDevolver += evento + "\n";
        return aDevolver;
    }
}
