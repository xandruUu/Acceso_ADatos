package vista;

import modelo.Incidencia;
import java.util.List;

public class Consola {

    public static void mostrarMenuPrincipal(String usuario) {
        int opcion;
        do {
            mostrarMensaje("--- MENÚ PRINCIPAL ---");
            mostrarMensaje("1. Insertar números (generar excepciones)");
            mostrarMensaje("2. Buscar por usuario");
            mostrarMensaje("3. Buscar por rango de fechas");
            mostrarMensaje("0. Salir");

            mostrarMensaje("Elige una opcion");
            opcion =  Escaner.pedirInt();

            switch (opcion) {
                case 1:
                    MenuExcepciones(usuario);

                    break;
                case 2:
                    ControladorIncidencias.buscarPorUsuario();

                    break;
                case 3:
                    ControladorIncidencias.buscarPorFechas();

                    break;
                case 0:
                    System.out.println("Saliendo del programa...");

            }

        } while (opcion != 0);
    }

    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }

    public static void MenuExcepciones(String usuario){

    }



}

