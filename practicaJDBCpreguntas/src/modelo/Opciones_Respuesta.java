package modelo;

public class Opciones_Respuesta {
    private int idOpcion;
    private int idPregunta;
    private String letraOpcion;
    private String textoOpcion;

    public Opciones_Respuesta(int idOpcion, int idPregunta, String letraOpcion, String textoOpcion) {
        this.idOpcion = idOpcion;
        this.idPregunta = idPregunta;
        this.letraOpcion = letraOpcion;
        this.textoOpcion = textoOpcion;
    }


    public Opciones_Respuesta(int idPregunta, String letraOpcion, String textoOpcion) {
        this.idPregunta = idPregunta;
        this.letraOpcion = letraOpcion;
        this.textoOpcion = textoOpcion;
    }

    public int getIdOpcion() {
        return idOpcion;
    }

    public void setIdOpcion(int idOpcion) {
        this.idOpcion = idOpcion;
    }

    public int getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    }

    public String getLetraOpcion() {
        return letraOpcion;
    }

    public void setLetraOpcion(String letraOpcion) {
        this.letraOpcion = letraOpcion;
    }

    public String getTextoOpcion() {
        return textoOpcion;
    }

    public void setTextoOpcion(String textoOpcion) {
        this.textoOpcion = textoOpcion;
    }

    @Override
    public String toString() {
        return "Opciones_Respuesta{" +
                "idOpcion=" + idOpcion +
                ", idPregunta=" + idPregunta +
                ", letraOpcion='" + letraOpcion + '\'' +
                ", textoOpcion='" + textoOpcion + '\'' +
                '}';
    }
}
