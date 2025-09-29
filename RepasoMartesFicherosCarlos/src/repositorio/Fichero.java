package repositorio;
import java.io.*;
import java.time.LocalDate;

public class Fichero {

    private String ruta;

    public Fichero(String ruta) {
        this.ruta = ruta;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    @Override
    public String toString() {
        return "Fichero{" +
                "ruta='" + ruta + '\'' +
                '}';
    }

    public void addDato(String dato){

        // anadir la linea al fichero

    }

    public String buscarDato(String dato, int columna){

        // anadir la linea al fichero

        return "";
    }

    public String buscarDato(LocalDate fechaInicial, LocalDate fechaFinal){

        // anadir la linea al fichero

        return "";
    }

    private static void leerFichero() {
        String cadena = "";

        FileReader fichero = null;
        BufferedReader lector = null;


        try {

            fichero = new FileReader("Datos/incidencias.txt");
            lector = new BufferedReader(fichero);

            do{
                cadena = lector.readLine();
                if(cadena!=null){
                    System.out.println(cadena);
                }
            }while(cadena!=null);

        } catch (FileNotFoundException e) {
            System.out.println("No he encontrado el fichero");
        } catch (IOException e) {
            System.out.println("Error de Lectira");
        } catch (Exception e) {
            System.out.println("Error inesperado");
            e.printStackTrace();
        }finally {
            try{
                if (lector != null){
                    lector.close();
                }
                if(fichero != null){
                    fichero.close();
                }
            } catch (Exception e) {

            }
        }
    }

    private static void escribirFichero(String dato){
        FileWriter fichero = null;

        try{
            fichero = new FileWriter("data/incidencias.txt", true   );
            fichero.write(dato);
        }catch (IOException e){
            System.out.println("Error de escritura");

        }finally{
            try{
                if(fichero !=null){
                    fichero.close();
                }

            } catch (Exception e) {

            }
        }
    }

}

