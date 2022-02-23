package ejercicio3;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author andrew
 */
public class Alumno {
    private String nombre;
    private String apellido;
    private ArrayList<Integer> notas;

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, ArrayList<Integer> notas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }
    
    public double notaFinal(){
        int sumatoria=0;
        double promedio;

        for(int nota:notas){
            sumatoria += nota;
        }
        
        promedio = ((double)sumatoria/(double)notas.size());
        return promedio;
    }

    @Override
    public String toString() {
        return "Nombre= " + nombre + "\tApellido= " + apellido + "\tNotas= " + notas;
    }
    
}
