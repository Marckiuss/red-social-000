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

    /**
     * Constructor - Construye e inicializa un muro vacio.
     */
    public Muro() {
        //Inicialización del ArrayList entradas.
        entradas = new ArrayList<>();
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
    @Override
    public String toString() {
        String aDevolver = "";
        for (Entrada entradaActual : entradas) {
            aDevolver += entradaActual + "\n\n";
        }
        return aDevolver;
    }
}

