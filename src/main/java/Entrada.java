public class Entrada {
    // Usuario que crea la entrada.
    private String usuario;
    // Fecha de publicacion de la entrada.
    private String momentoPublicacion;
    // Numero de 'me gusta' de la entrada.
    private int cantidadMeGustas;

    /**
     * constructor de la clase entrada
     *
     * @param usuario
     */
    public Entrada(String usuario) {
        this.usuario = usuario;
        this.momentoPublicacion = "10 segundos";
        cantidadMeGustas = 0;
    }

    /**
     * Devuelve la fecha de publicacion.
     *
     * @return Devuelve la fecha de publicacion.
     */
    public String getMomentoPublicacion()
    {
        return momentoPublicacion;
    }

    public String getUsuario() {
        return usuario;
    }

    public int getMeGustas() {
        return cantidadMeGustas;
    }

    public void meGusta(){
        cantidadMeGustas ++;
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
        aDevolver += "Publicado hace 10 segundos\n";
        return aDevolver;

    }
}



