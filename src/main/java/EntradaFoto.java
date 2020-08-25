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
public class EntradaFoto extends EntradaConComentarios {
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
     * @param urlImagen   URL de la imagen.
     */
    public EntradaFoto(String usuario, String urlImagen, String titulo) {
        super(usuario);
        this.urlImagen = urlImagen;
        this.titulo = titulo;
    }

    public void mostrarDetallesPorPantalla(){
        System.out.println(urlImagen + "\n" + titulo);
    }

    public String getUrlImagen(){
        return urlImagen;
    }

    @Override
    public String toString() {
        String aDevolver = "";
        aDevolver += super.toString();
        aDevolver += "Url: " + urlImagen + "\n";
        aDevolver += "Titulo: " + titulo + "\n";
        return aDevolver;
    }
}