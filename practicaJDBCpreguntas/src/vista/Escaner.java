package vista;

import java.util.Scanner;

public class Escaner {

    private static final Scanner sc = new Scanner(System.in);

    public static int pedirInt(String preguntaMensaje) {
        int numero;

        mostrarString(preguntaMensaje + ": ");
        numero = sc.nextInt();
        sc.nextLine();

        return numero;
    }

    public static String pedirString(String preguntaMensaje) {
        String texto;

        mostrarString(preguntaMensaje + ": ");
        texto = sc.nextLine();
        return texto;
    }

    public static void mostrarString(String mensaje) {
        System.out.println(mensaje);
    }
}
