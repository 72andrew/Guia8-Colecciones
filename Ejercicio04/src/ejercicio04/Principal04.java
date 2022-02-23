package ejercicio04;

import java.util.Locale;
import java.util.Scanner;

public class Principal04 {

    public static void main(String[] args) {
        PeliculaServicio peliculaServicio = new PeliculaServicio();

        int opcion = 0;

        boolean salir = false;

        peliculaServicio.crearPelicula("Forrest Gump", "Robert de Niro", 150);
        peliculaServicio.crearPelicula("Marcianos al ataque", "Tim Burton", 54);
        peliculaServicio.crearPelicula("Death Proof", "Quentin Tarantino", 121);

        do {
            System.out.println("\nINGRESE UNA OPCION");
            System.out.println("1 - Cargar Pelicula");
            System.out.println("2 - Mostrar Peliculas");
            System.out.println("3 - Pelicula de mas de 1 hora");
            System.out.println("4 - Ordenar duracion (menor a mayor)");
            System.out.println("5 - Ordenar duracion (mayor a menor)");
            System.out.println("6 - Salir");
            Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    peliculaServicio.ingresarNuevaPelicula();
                    break;
                case 2:
                    peliculaServicio.printArrayList();
                    break;
                case 3:
                    peliculaServicio.mostrarDuracion1Hora();
                    break;
                case 4:
                    peliculaServicio.ordenarDuracionMenorAMayor();
                    peliculaServicio.printArrayList();
                    break;
                case 5:
                    peliculaServicio.ordenarDuracionMayorAMenor();
                    peliculaServicio.printArrayList();
                    break;
                case 6:
                    salir = true;
                    break;
                default:
                    throw new AssertionError();
            }
        } while (!salir);
    }

}
