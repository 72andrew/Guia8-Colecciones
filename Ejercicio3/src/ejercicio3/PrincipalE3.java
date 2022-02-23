package ejercicio3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class PrincipalE3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        ArrayList<Alumno> alumnos = new ArrayList();

        int opcion = 0;
        boolean salir = false;
        char salida;

        do {
            System.out.println("\nElija una opcion");
            System.out.println("1 - Ingresar nuevo alumno");
            System.out.println("2 - Calcular Promedio");
            System.out.println("3 - Imprimir todos los alumnos");
            System.out.println("4 - Salir");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    cargarNuevoAlumno(alumnos);
                    break;
                case 2:
                    calcularPromedio(alumnos);
                    break;
                case 3:
                    mostrarAlumnos(alumnos);
                    break;

                case 4:
                    System.out.println("Esta Seguro? S/N");
                    salida = entrada.next().toUpperCase().charAt(0);
                    if(salida == 'S'){
                        salir = true;
                    }
                    break;
                default:
                    System.out.println("Opcion incorrecta\n");
            }



        } while (!salir);

    }

    public static void mostrarAlumnos(ArrayList<Alumno> alumnos) {
        for (Alumno alumno : alumnos) {
            System.out.println(alumno.toString());
        }
    }

    public static void calcularPromedio(ArrayList<Alumno> alumnos) {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        boolean encontrado = false;
        
        System.out.println("Ingrese el nombre del alumno");
        String nombreBuscar = entrada.next();

        for (Alumno alumno : alumnos) {
            if (alumno.getNombre().equalsIgnoreCase(nombreBuscar)) {
                System.out.printf("\nEl promedio de %s %s es: %.2f\n",alumno.getNombre(),alumno.getApellido(), alumno.notaFinal());
                encontrado = true;
            }
        }
        if(!encontrado){
            System.out.println("ALUMNO INEXISTENTE");
        }
    }

    public static void cargarNuevoAlumno(ArrayList<Alumno> alumnos) {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Alumno alumno = new Alumno();
        ArrayList<Integer> notas = new ArrayList();
        String nombre;
        String apellido;
        int nota;

        System.out.print("Nombre:");
        nombre = entrada.next();
        nombre = nombre.substring(0, 1).toUpperCase() + nombre.substring(1, nombre.length()).toLowerCase();
        alumno.setNombre(nombre);

        System.out.print("Apellido:");
        apellido = entrada.next();
        apellido = apellido.substring(0, 1).toUpperCase() + apellido.substring(1, apellido.length()).toLowerCase();
        alumno.setApellido(apellido);

        for (int i = 0; i < 3; i++) {
            System.out.printf("Ingrese Nota %d:", (i + 1));
            nota = entrada.nextInt();
            notas.add(nota);
        }

        alumno.setNotas(notas);
        alumnos.add(alumno);
    }
}
