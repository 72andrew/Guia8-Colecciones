package ejercicio04;

import java.util.Comparator;

/**
 *
 * @author andrew
 */
public class PeliculaComparadorDuracionMayorAMenor implements Comparator<Pelicula> {
    
    @Override
    public int compare(Pelicula peli1, Pelicula peli2){
        return Integer.compare(peli2.getDuracion(), peli1.getDuracion());
        
    } 
}
