import java.util.ArrayList;

public class EntradaConComentarios extends Entrada {
    private ArrayList<String> comentarios;

    public EntradaConComentarios(String usuario) {
        super(usuario);
        comentarios = new ArrayList<>();
    }

    public ArrayList<String> getComentarios() {
        return comentarios;
    }

    public void addComentarios(String comentario) {
        comentarios.add(comentario);
    }

    @Override
    public String toString() {
        String aDevolver = "";
        aDevolver += super.toString();
        if (!comentarios.isEmpty()) {
            aDevolver += "Comentarios:";
            for (String comentarioActual : comentarios) {
                aDevolver += comentarioActual + "\n";
            }
        } else {
            aDevolver += "No hay comentarios\n";
        }
        return aDevolver;
    }

}

