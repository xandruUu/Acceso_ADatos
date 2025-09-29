package vista;

import java.time.LocalDate;
import java.util.Scanner;

public class Escaner {
    public static String pedirString(String dato){

        Scanner sc = new Scanner(System.in);

        Consola.mostrarMensaje(dato);
        String datos = sc.nextLine();
        return datos;

    }

    public static void pedirByte (byte opcion){

        Scanner sc = new Scanner(System.in);

        Consola.mostrarMensaje(String.valueOf(opcion));

        opcion = sc.nextByte();

    }


}
