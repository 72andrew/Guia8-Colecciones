package ejercicio04;


/**
 *
 * @author andrew
 */
public class Pelicula implements Comparable<Pelicula>{
    String titulo;
    String director;
    int duracion;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, int duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    @Override
    public int compareTo(Pelicula pelicula){
        return Integer.compare(duracion, pelicula.duracion);
    }
    
    @Override
    public String toString() {
        return String.format("Pelicula:%s\tDirector:%s\tDuracion:%d", titulo, director, duracion);
    }
    
    
}
