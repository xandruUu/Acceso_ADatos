package modelo;

import java.time.LocalDate;

public class Incidencia {

    private LocalDate fecha;
    private String hora;
    private String usuario;
    private String excepcion;

    public Incidencia(LocalDate fecha, String hora, String usuario, String excepcion) {
        this.fecha = fecha;
        this.hora = hora;
        this.usuario = usuario;
        this.excepcion = excepcion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
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
                ", fecha=" + fecha +
                ", hora='" + hora + '\'' +
                ", usuario='" + usuario + '\'' +
                ", excepcion='" + excepcion + '\'' +
                '}';
    }
}
