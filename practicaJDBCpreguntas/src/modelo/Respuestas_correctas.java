package modelo;

public class Respuestas_correctas {
    private int idPregunta;
    private int idRespuestaCorrecta;
    private String letraCorrecta;

    public Respuestas_correctas( int idRespuestaCorrecta, int idPregunta, String letraCorrecta) {
        this.idRespuestaCorrecta = idRespuestaCorrecta;
        this.idPregunta = idPregunta;
        this.letraCorrecta = letraCorrecta;
    }

    public Respuestas_correctas(int idPregunta, String letraCorrecta) {
        this.idPregunta = idPregunta;
        this.letraCorrecta = letraCorrecta;
    }

    public int getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    }

    public int getIdRespuestaCorrecta() {
        return idRespuestaCorrecta;
    }

    public void setIdRespuestaCorrecta(int idRespuestaCorrecta) {
        this.idRespuestaCorrecta = idRespuestaCorrecta;
    }

    public String getLetraCorrecta() {
        return letraCorrecta;
    }

    public void setLetraCorrecta(String letraCorrecta) {
        this.letraCorrecta = letraCorrecta;
    }

    @Override
    public String toString() {
        return "Respuestas_correctas{" +
                "idPregunta=" + idPregunta +
                ", idRespuestaCorrecta=" + idRespuestaCorrecta +
                ", letraCorrecta='" + letraCorrecta + '\'' +
                '}';
    }
}
