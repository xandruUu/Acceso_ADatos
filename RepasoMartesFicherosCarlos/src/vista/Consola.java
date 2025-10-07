package vista;

import controlador.ControladorIncidencias;

public class Consola {

    // ====== Colores ANSI ======
    public static final String RESET = "\u001B[0m";
    public static final String ROJO = "\u001B[31m";
    public static final String VERDE = "\u001B[32m";
    public static final String AMARILLO = "\u001B[33m";
    public static final String AZUL = "\u001B[34m";
    public static final String MORADO = "\u001B[35m";
    public static final String CIAN = "\u001B[36m";

    // ====== Métodos de mensajes ======
    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public static void mostrarInfo(String mensaje) {
        System.out.println(AZUL + mensaje + RESET);
    }

    public static void mostrarExito(String mensaje) {
        System.out.println(VERDE + mensaje + RESET);
    }

    public static void mostrarError(String mensaje) {
        System.out.println(ROJO + mensaje + RESET);
    }

    public static void mostrarAdvertencia(String mensaje) {
        System.out.println(AMARILLO + mensaje + RESET);
    }

    // ====== Menú principal ======
    public static void menuPrincipal(String usuario) {
        int opcion;
        do {
            mostrarMensaje(CIAN + "\n╔══════════════════════════════════════════════╗" + RESET);
            mostrarMensaje(CIAN + "║" + RESET + AMARILLO + "      MENÚ PRINCIPAL - Usuario: " + usuario + "        " + RESET + CIAN + "║" + RESET);
            mostrarMensaje(CIAN + "╠══════════════════════════════════════════════╣" + RESET);
            mostrarMensaje(CIAN + "║" + RESET + "  1. Insertar números (generar excepciones) " + CIAN +  "  ║" + RESET);
            mostrarMensaje(CIAN + "║" + RESET + "  2. Buscar por usuario                      " + CIAN + " ║" + RESET);
            mostrarMensaje(CIAN + "║" + RESET + "  3. Buscar por rango de fechas              " + CIAN + " ║" + RESET);
            mostrarMensaje(CIAN + "║" + RESET + "  0. Salir                                   " + CIAN + " ║" + RESET);
            mostrarMensaje(CIAN + "╚══════════════════════════════════════════════╝" + RESET);

            opcion = Escaner.pedirInt("👉 Elige una opción");

            switch (opcion) {
                case 1:
                    menuExcepciones(usuario);
                    break;

                case 2:
                    ControladorIncidencias.buscarPorUsuario();
                    break;

                case 3:
                    ControladorIncidencias.buscarPorFechas();
                    break;

                case 0:
                    mostrarAdvertencia("👋 Saliendo del programa...");
                    break;

                default:

                    mostrarError("❌ Opción no válida, intenta de nuevo.");
            }

        } while (opcion != 0);
    }

    // ====== Submenú de excepciones ======
    public static void menuExcepciones(String usuario) {
        mostrarMensaje(MORADO + "\n╔══════════════════════════════════════╗" + RESET);
        mostrarMensaje(MORADO + "║" + RESET + "         SUBMENÚ DE EXCEPCIONES  " + MORADO + "     ║" + RESET);
        mostrarMensaje(MORADO + "╠══════════════════════════════════════╣" + RESET);
        mostrarMensaje(MORADO + "║" + RESET + "  1. Levantar IOException             " + MORADO + "║" + RESET);
        mostrarMensaje(MORADO + "║" + RESET + "  2. Levantar FileNotFoundException   " + MORADO + "║" + RESET);
        mostrarMensaje(MORADO + "║" + RESET + "  3. Levantar Exception genérica      " + MORADO + "║" + RESET);
        mostrarMensaje(MORADO + "╚══════════════════════════════════════╝" + RESET);

        int opcion = Escaner.pedirInt("👉 Elige una opción");
        ControladorIncidencias.registrarExcepcion(usuario, opcion);
    }
}
