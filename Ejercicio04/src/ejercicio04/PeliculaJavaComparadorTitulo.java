package ejercicio04;

import java.util.Comparator;

/**
 *
 * @author andrew
 */
public class PeliculaJavaComparadorTitulo implements Comparator<Pelicula> {

    @Override
    public int compare(Pelicula peli1, Pelicula peli2) {
        return peli1.titulo.compareTo(peli2.titulo);
    }
    
}
