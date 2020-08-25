import java.util.ArrayList;

/**
 * El muro de nuestra red social.
 * <p>
 * El muro es el lugar donde los usuarios publicaran sus entradas.
 *
 * @author DAM
 * @version 1.0
 */
public class Muro {
    // Entradas de todo tipo
    private ArrayList<Entrada> entradas;
    private ArrayList<String> urlFotos;

    /**
     * Constructor - Construye e inicializa un muro vacio.
     */
    public Muro() {
        //Inicialización del ArrayList entradas.
        entradas = new ArrayList<>();
        urlFotos = new ArrayList<>();
    }

    /**
     * Anade una entrada al muro.
     *
     * @param entrada La entrada de texto a anadir.
     */
    public void addEntrada(Entrada entrada) {
        entradas.add(entrada);
    }

    public void mostrarDetallesTodasLasEntradas(){
        for(Entrada entradaActual : entradas){
            entradaActual.mostrarDetallesPorPantalla();
        }

    }

    public String [] getUrlFotos(){
        String aImprimir = "";
        int tamanoArray = entradas.size();
        String[] urlFotos = new String[tamanoArray];
        int contador = 0;
        for(Entrada entradaActual : entradas){
            contador ++ ;
            EntradaFoto foto = (EntradaFoto)entradaActual;
            urlFotos[contador] = foto.getUrlImagen() + "\n";
            aImprimir += foto.getUrlImagen() + "\n";
        }
        System.out.println(aImprimir);
        return urlFotos;
        
    }

    @Override
    public String toString() {
        String aDevolver = "";
        for (Entrada entradaActual : entradas) {
            aDevolver += entradaActual + "\n\n";
        }
        return aDevolver;
    }
}