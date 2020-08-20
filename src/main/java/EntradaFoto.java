import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * Una entrada con imagenes
 * <p>
 * Una entrada es un contenido que el usuario comparte en su muro con la comunidad.
 * Las entradas con imagenes se crean a partir de un autor, un titulo
 * para la imagen y la url de la imagen.
 *
 * @author DAM
 * @version 1.0
 */
public class EntradaFoto extends Entrada {
    // URL de la imagen.
    private String urlImagen;
    //Título de la entrada.
    private String titulo;

    /**
     * Constructor - Construye entradas a partir de un autor, el titulo de la imagen y su URL.
     * Las entradas se crean sin ningun ' me gusta'.
     * La fecha de publicacion coincide con el momento en el que se crea la entrada.
     *
     * @param titulo Titulo de la imagen.
     * @param url    URL de la imagen.
     */
    public EntradaFoto(String usuario, String url, String titulo) {
        super(usuario);
        this.urlImagen = url;
        this.titulo = titulo;
    }

    /**
     * Devuelve el URL de la imagen.
     *
     * @return Devuelve el URL de la imagen.
     */
    public String getUrlImagen() {

        return urlImagen;
    }

    /**
     * Devuelve el titulo de la imagen.
     *
     * @return Devuelve el titulo de la imagen.
     */
    public String getTituloImagen() {
        return titulo;
    }

    /**
     * Devuelve la fecha de publicacion.
     *
     * @return Devuelve la fecha de publicacion.
     */
    @Override
    public String toString() {
        String aDevolver = "";
        aDevolver += "Usuario: " + getUsuario() + "\n";
        aDevolver += "Likes: " + getMeGustas() + "\n";
        aDevolver += "Url: " + urlImagen + "\n";
        aDevolver += "Titulo: " + titulo + "\n";
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