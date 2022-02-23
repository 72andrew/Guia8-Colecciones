//1. Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String.
//El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
//después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si
//decide salir, se mostrará todos los perros guardados en el ArrayList.
//2. Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le
//pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.
//Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
//la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y
//se mostrará la lista ordenada.
package ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class PrincipalE1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int opcion;
        String nombreRaza;
        boolean salir = false;
        ArrayList<String> razas = new ArrayList();
        razas.add("Dogo");
        razas.add("Salchicha");
        razas.add("Yorkshire");
        do {
            System.out.println("Seleccione la Opcion:");
            System.out.println("1-Ingresar nueva raza");
            System.out.println("2-Eliminar una raza");
            System.out.println("3-Salir");

            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre");
                    nombreRaza = entrada.next();
                    nombreRaza = nombreRaza.substring(0,1).toUpperCase() + nombreRaza.substring(1,nombreRaza.length()).toLowerCase();
                    razas.add(nombreRaza);
                    break;
                case 2:
                    eliminarRaza(razas);
                    imprimirListaOrdenada(razas);
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
            }
        } while (!salir);
        imprimirListaOrdenada(razas);
    }

    public static void imprimirListaOrdenada(ArrayList<String> razas) {
        System.out.println("\nLista de Razas:");
        Collections.sort(razas);
        for (String raza : razas) {
            System.out.printf("* %s\n",raza);
        }
        System.out.println("");
    }

    public static void eliminarRaza(ArrayList<String> razas) {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        String nombreRaza;
        boolean eliminado = false;
        System.out.println("Ingrese la raza que quiere eliminar");
        nombreRaza = entrada.next();

        Iterator<String> it = razas.iterator();
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase(nombreRaza)) {
                it.remove();
                System.out.println("Raza eliminada"); 
                eliminado = true;
            }
        }
        if (!eliminado) {
            System.out.println("No se encontró la raza");
        }
    }

}
