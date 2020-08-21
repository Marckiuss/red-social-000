import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Clase de test para el muro de la red social
 *
 * @author DAM
 * @version 1.0
 */
public class MuroTest {
    @Test
    public void test01() {

        Muro muro = new Muro();

        EntradaTexto entrada01 = new EntradaTexto("Pepe", "Hawai!");
        EntradaFoto entrada02 = new EntradaFoto("Luis", "https://bit.ly/2W1dO09", "Gracias");
        EntradaTexto entrada03 = new EntradaTexto("Kim", "Llueve fuera...");
        EntradaFoto entrada04 = new EntradaFoto("Cristina", "https://bit.ly/3cY9vtD", "Una foto de mi nevera");
        EntradaEvento entrada05 = new EntradaEvento("Marc", "Ha cambiado su nombre de usuario");

        muro.addEntrada(entrada01);
        muro.addEntrada(entrada02);
        muro.addEntrada(entrada03);
        muro.addEntrada(entrada04);
        muro.addEntrada(entrada05);

        System.out.println(muro);
        String resultado = "Usuario: Pepe\nLikes: 0\nPublicado hace 10 segundos\nNo hay comentarios\nHawai!\n\n\n";
        resultado += "Usuario: Luis\nLikes: 0\nPublicado hace 10 segundos\nNo hay comentarios\nUrl: https://bit.ly/2W1dO09\nTitulo: Gracias\n\n\n";
        resultado += "Usuario: Kim\nLikes: 0\nPublicado hace 10 segundos\nNo hay comentarios\nLlueve fuera...\n\n\n";
        resultado += "Usuario: Cristina\nLikes: 0\nPublicado hace 10 segundos\nNo hay comentarios\nUrl: https://bit.ly/3cY9vtD\nTitulo: Una foto de mi nevera\n\n\n";
        resultado += "Usuario: Marc\nLikes: 0\nPublicado hace 10 segundos\nHa cambiado su nombre de usuario\n\n\n";

        assertEquals(resultado, muro.toString());
    }

}
