package vista;

import modelo.Incidencia;
import java.util.List;

public class Consola {

    // Códigos ANSI para colores y estilos
    private static final String RESET = "\u001B[0m";
    private static final String ROJO = "\u001B[31m";
    private static final String VERDE = "\u001B[32m";
    private static final String AMARILLO = "\u001B[33m";
    private static final String AZUL = "\u001B[34m";
    private static final String CYAN = "\u001B[36m";
    private static final String NEGRITA = "\u001B[1m";

    // Mostrar un mensaje genérico en color
    public static void mostrarMensaje(String mensaje) {
        System.out.println(AZUL + mensaje + RESET);
    }

    // Mensajes de error
    public static void mostrarError(String mensaje) {
        System.out.println(ROJO + NEGRITA + "✖ " + mensaje + RESET);
    }

    // Mensajes de éxito
    public static void mostrarExito(String mensaje) {
        System.out.println(VERDE + "✔ " + mensaje + RESET);
    }

    // Encabezado con estilo
    public static void mostrarEncabezado(String titulo) {
        String barra = CYAN + "===============================" + RESET;
        System.out.println(barra);
        System.out.println(NEGRITA + CYAN + "   " + titulo.toUpperCase() + RESET);
        System.out.println(barra);
    }

    /**
     * Muestra una tabla con las incidencias guardadas
     * @param incidencias lista de incidencias
     */
    public static void mostrarTablaIncidencias(List<Incidencia> incidencias) {
        if (incidencias == null || incidencias.isEmpty()) {
            mostrarError("No hay incidencias registradas.");
            return;
        }

        // Cabecera de la tabla
        String formatoCabecera = NEGRITA + String.format("| %-4s | %-12s | %-15s | %-30s |",
                "ID", "FECHA", "USUARIO", "EXCEPCIÓN") + RESET;
        String separador = CYAN + "----------------------------------------------------------------------------------------" + RESET;

        System.out.println(separador);
        System.out.println(formatoCabecera);
        System.out.println(separador);

        // Filas de la tabla
        for (Incidencia i : incidencias) {
            String fila = String.format("| %-4d | %-12s | %-15s | %-30s |",
                    i.getId(),
                    i.getFecha(),
                    i.getUsuario(),
                    i.getExcepcion());
            System.out.println(AMARILLO + fila + RESET);
        }

        System.out.println(separador);
    }

    public static void mostrarMenu(){
        byte eleccion = 0;

        do{

        }while(eleccion != 0);
    }
}

