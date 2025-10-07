package vista;

import java.util.Scanner;

public class Escaner {
    private static final Scanner sc = new Scanner(System.in);

    public static int pedirInt(String mensaje) {
        int numero;

        Consola.mostrarMensaje(mensaje);
        numero = sc.nextInt();
        sc.nextLine();

        return numero;
    }

    public static String pedirString(String mensaje) {

        String texto;

        Consola.mostrarMensaje(mensaje);
        texto = sc.nextLine();

        return texto;
    }

}
