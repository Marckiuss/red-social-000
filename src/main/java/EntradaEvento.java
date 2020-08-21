import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class EntradaEvento extends Entrada {

    private String evento;

    public EntradaEvento(String usuario, String evento) {

        super(usuario);
        this.evento = evento;
    }

    public String getEvento(){

        return evento;
    }

    @Override
    public String toString(){
        String aDevolver = "";

        aDevolver += "Usuario: " + getUsuario() + "\n";
        aDevolver += "Likes: " + getMeGustas() + "\n";
        aDevolver += "Evento: " + evento + "\n";
        aDevolver += "Publicado hace: " + getMomentoPublicacion() + "\n";
        return aDevolver;
    }
}
