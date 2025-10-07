package repositorio;
import controlador.ControladorIncidencias;
import modelo.Incidencia;
import vista.Consola;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Fichero {

    private static final String RUTA = "Datos/incidencias.txt";

    public static void escribirIncidencia(Incidencia miIncidencia) throws IOException {

        FileWriter miFichero=null;
        String incidencia;

        try {
            miFichero = new FileWriter(RUTA, true);
            incidencia = miIncidencia.getFecha() + ";" + miIncidencia.getHora() + ";" + miIncidencia.getExcepcion() + miIncidencia.getUsuario() + "\n";
            miFichero.write(incidencia);

        } finally {
            if (miFichero != null) {
                try {
                    miFichero.close();
                } catch (Exception e) {
                    Consola.mostrarError("Error cerrando el fichero de escritura.");
                }
            }
        }
    }


    public static List<Incidencia> leerIncidencias() {

        List<Incidencia> listaIncidencias = new ArrayList<>();
        FileReader miFichero = null;
        BufferedReader miLector = null;
        String linea;
        Incidencia incidencia;

        try {

            miLector = new BufferedReader(miFichero = new FileReader(RUTA));


            while ((linea = miLector.readLine()) != null) {
                incidencia = ControladorIncidencias.parsearLinea(linea);

                if (incidencia != null) {
                    listaIncidencias.add(incidencia);

                }
            }

        } catch (FileNotFoundException e) {
            Consola.mostrarError("No se encontró el fichero.");

        } catch (IOException e) {
            Consola.mostrarError("Error de lectura en el fichero.");

        } catch (Exception e) {
            Consola.mostrarError("Error inesperado.");
            e.printStackTrace();

        } finally {
            try {
                if (miLector != null){
                    miLector.close();
                }
                if (miFichero != null){
                    miFichero.close();
                }
            } catch (Exception e) {
                Consola.mostrarError("Error cerrando el fichero de lectura.");
            }
        }

        return listaIncidencias;
    }


}
