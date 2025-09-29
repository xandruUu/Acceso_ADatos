package modelo;

import java.time.LocalDate;

public class Incidencia {

    private int id ;
    private LocalDate fecha;
    private String hora;
    private String usuario;
    private String excepcion;

    public Incidencia(int id, LocalDate fecha,String hora, String usuario, String excepcion) {
        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
        this.usuario = usuario;
        this.excepcion = excepcion;
    }

    public double getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getHora(){
        return hora;
    }

    public void setHora(String hora){
        this.hora = hora;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getExcepcion() {
        return excepcion;
    }

    public void setExcepcion(String excepcion) {
        this.excepcion = excepcion;
    }

    @Override
    public String toString() {
        return "Incidencia{" +
                "id=" + id +
                ", fecha=" + fecha +
                ", hora=" + hora +
                ", usuario='" + usuario + '\'' +
                ", excepcion='" + excepcion + '\'' +
                '}';
    }
}
