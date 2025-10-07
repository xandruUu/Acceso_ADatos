package controlador;

import modelo.Incidencia;
import modelo.ListaIncidencias;
import vista.Consola;
import vista.Escaner;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class ControladorIncidencias {

    public static void iniciar() {
        String nombreUsuario = Escaner.pedirString("Introduce el nombre de usuario");
        Consola.menuPrincipal(nombreUsuario);
    }

    public static void registrarExcepcion(String nombreUsuario, int opcion) {
        try {
            switch (opcion) {
                case 1:
                    throw new IOException("IOException");

                case 2:
                    throw new FileNotFoundException("FileNotFoundException");

                case 3:
                    throw new Exception("Exception genérica");

                default:

                    Consola.mostrarError("Opción no válida.");
                    break;
            }
        } catch (Exception miError) {
            Incidencia miIncidencia = new Incidencia(
                    LocalDate.now(),
                    LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")),
                    nombreUsuario,
                    miError.getClass().getSimpleName()
            );

            ListaIncidencias.guardarIncidencia(miIncidencia);
            Consola.mostrarExito("Incidencia registrada: " + miIncidencia);
        }
    }

    public static void buscarPorUsuario() {

        String usuarioBuscado = Escaner.pedirString("Introduce el usuario a buscar");
        List<Incidencia> lista = ListaIncidencias.obtenerIncidencias();

        boolean encontrado = false;

        for (Incidencia miIncidencia : lista) {
            if (miIncidencia.getUsuario().equalsIgnoreCase(usuarioBuscado)) {
                Consola.mostrarInfo(miIncidencia.toString());
                encontrado = true;
            }
        }

        if (!encontrado) {
            Consola.mostrarAdvertencia("No se encontraron incidencias para el usuario: " + usuarioBuscado);
        }
    }


    public static void buscarPorFechas() {
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String fecha1 = Escaner.pedirString("Introduce fecha inicial (dd/MM/yyyy)");
        String fecha2 = Escaner.pedirString("Introduce fecha final (dd/MM/yyyy)");

        LocalDate fechaInicio = LocalDate.parse(fecha1, formatoFecha);
        LocalDate fechaFin = LocalDate.parse(fecha2, formatoFecha);

        List<Incidencia> lista = ListaIncidencias.obtenerIncidencias();

        boolean encontrado = false;
        for (Incidencia miIncidencia : lista) {
            //desarrollar busqueda por fecha

        }


        if (!encontrado) {
            Consola.mostrarAdvertencia("No se encontraron incidencias entre esas fechas.");
        }
    }


    public static Incidencia parsearLinea(String linea) {
        String[] partes = linea.split(";");

        if (partes.length != 4){
            return null;
        }

        LocalDate fecha = LocalDate.parse(partes[0]);
        String hora = partes[1];
        String excepcion = partes[2];
        String usuario = partes[3];

        return new Incidencia(fecha, hora, excepcion,usuario);


    }
}
