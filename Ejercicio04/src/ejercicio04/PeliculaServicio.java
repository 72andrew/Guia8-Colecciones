package ejercicio04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author andrew
 */
public class PeliculaServicio {

    private Scanner scan;
    private ArrayList<Pelicula> peliculas;

    
    public PeliculaServicio() {
        this.peliculas = new ArrayList<>();
        this.scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
    }
    
    public void ordenarDuracionMenorAMayor(){
        Collections.sort(peliculas);
        
    }
    
        public void ordenarDuracionMayorAMenor(){
        Collections.sort(peliculas,new PeliculaComparadorDuracionMayorAMenor());
        
    }
    
    public void ingresarNuevaPelicula() {

        String titulo;
        String director;
        int duracion;

        System.out.println("Ingrese el titulo");
        titulo = scan.next();
        System.out.println("Ingrese el director");
        director = scan.next();
        System.out.println("Ingrese la duracion en minutos");
        duracion = scan.nextInt();
        crearPelicula(titulo, director, duracion);

    }

    public void crearPelicula(String titulo, String director, int duracion) {
        Pelicula pelicula = new Pelicula();

        pelicula.setTitulo(titulo);
        pelicula.setDirector(director);
        pelicula.setDuracion(duracion);

        addPelicula(pelicula);
    }

    private void addPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
    }

    public void printArrayList() {
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
    }

    public void mostrarDuracion1Hora() {
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getDuracion() > 60) {
                System.out.println(pelicula);
            }
        }
    }
    
    
    
}
