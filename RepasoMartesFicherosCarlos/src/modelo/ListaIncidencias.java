package modelo;

import repositorio.Fichero;
import vista.Consola;

import java.io.IOException;
import java.util.List;

public class ListaIncidencias {

    public static void guardarIncidencia(Incidencia miIncidencia) {
        try {
            Fichero.escribirIncidencia(miIncidencia);
        } catch (IOException e) {
            if (!miIncidencia.getExcepcion().equals("IOException forzada")) {
                Consola.mostrarError("Error al guardar la incidencia.");
            }
        }
    }


    public static List<Incidencia> obtenerIncidencias() {
        List<Incidencia> milista = Fichero.leerIncidencias();

        for (Incidencia miIncidencia : milista) {

            Consola.mostrarMensaje(String.valueOf(miIncidencia));
        }
        return milista;
    }
}
