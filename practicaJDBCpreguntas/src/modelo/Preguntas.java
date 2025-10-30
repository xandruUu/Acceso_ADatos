package modelo;

public class Preguntas {
    private int idPregunta;
    private int numeroPregunta;
    private String textopregunta;

    public Preguntas(int idPregunta,  int numeroPregunta, String textopregunta) {
        this.idPregunta = idPregunta;
        this.numeroPregunta = numeroPregunta;
        this.textopregunta = textopregunta;
    }

    public Preguntas(int numeroPregunta, String textopregunta) {
        this.numeroPregunta = numeroPregunta;
        this.textopregunta = textopregunta;
    }

    public int getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    }

    public int getNumeroPregunta() {
        return numeroPregunta;
    }

    public void setNumeroPregunta(int numeroPregunta) {
        this.numeroPregunta = numeroPregunta;
    }

    public String getTextopregunta() {
        return textopregunta;
    }

    public void setTextopregunta(String textopregunta) {
        this.textopregunta = textopregunta;
    }

    @Override
    public String toString() {
        return "Preguntas{" +
                "idPregunta=" + idPregunta +
                ", numeroPregunta=" + numeroPregunta +
                ", textopregunta='" + textopregunta + '\'' +
                '}';
    }
}
