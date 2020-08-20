import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * Una entrada con texto
 * <p>
 * Una entrada es un contenido que el usuario comparte en su muro con la comunidad.
 * Las entradas con imagenes se crean a partir de un autor y un contenido.
 *
 * @author DAM
 * @version 1.0
 */

public class EntradaTexto extends Entrada {
    // Contenido de la entrada.
    private String mensaje;


    /**
     * Constructor - Construye entradas a partir de un autor y un contenido.
     * Las entradas se crean sin ningun ' me gusta'.
     * La fecha de publicacion coincide con el momento en el que se crea la entrada.
     *
     * @param texto Contenido de la entrada.
     */
    public EntradaTexto(String usuario, String texto) {
        super(usuario);
        mensaje = texto;
    }


    /**
     * Devuelve el contenido de la entrada.
     *
     * @return Devuelve el contenido de la entrada.
     */
    public String getUsuarioYMensaje() {
        return ("Usuario : " + getUsuario() + "\nMEnsaje: " + mensaje);
    }

    /**
     * Devuelve una cadena con toda la informacion de la entrada.
     *
     * @return Devuelve una cadena con toda la informacion de la entrada.
     */
    @Override
    public String toString() {
        String aDevolver = "";
        aDevolver += "Usuario: " + getUsuario() + "\n";
        aDevolver += "Likes: " + getMeGustas() + "\n";
        aDevolver += mensaje + "\n";
        aDevolver += "Publicado hace " + getMomentoPublicacion() + "\n";
        ArrayList<String> comentarios = getComentarios();
        // Comprobamos si hay comentarios
        if(comentarios.size() == 0){
            aDevolver += "No hay comentarios\n";
        }
        else{
            aDevolver += "Comentarios: \n";
            for(String comentarioActual : comentarios){
                aDevolver += comentarioActual + "\n";
            }
        }
        return aDevolver;
    }
}