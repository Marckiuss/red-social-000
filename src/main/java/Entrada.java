import java.util.ArrayList;

public class Entrada {
    // Usuario que crea la entrada.
    protected String usuario;
    // Fecha de publicacion de la entrada.
    protected String momentoPublicacion;
    // Numero de 'me gusta' de la entrada.
    protected int cantidadMeGusta;
    // Comentarios de la entrada.
    protected ArrayList<String> comentarios;

    /**
     * constructor de la clase entrada
     *
     * @param usuario
     */
    public Entrada(String usuario) {
        this.usuario = usuario;
        this.momentoPublicacion = "10 segundos";
        cantidadMeGusta = 0;
        comentarios = new ArrayList<>();
    }

    /**
     * Anade un 'me gusta' a la entrada.
     */
    public void meGusta() {
        cantidadMeGusta += 1;
    }

    /**
     * Anade un comentario a a la entrada.
     *
     * @param text El comentario a anadir.
     */
    public void addComentario(String text) {
        comentarios.add(text);
    }

    /**
     * Devuelve la fecha de publicacion.
     *
     * @return Devuelve la fecha de publicacion.
     */
    public String getMomentoPublicacion() {
        return momentoPublicacion;
    }

    /**
     * Devuelve una cadena con toda la informacion de la entrada.
     *
     * @return Devuelve una cadena con toda la informacion de la entrada.
     */
    @Override
    public String toString() {

        return "";
    }
}



