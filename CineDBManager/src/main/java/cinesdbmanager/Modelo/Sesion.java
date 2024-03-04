package cinesdbmanager.Modelo;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;

@Entity
public class Sesion {
    @Basic
    @Column(name = "fecha", nullable = true)
    private Date fecha;
    @Basic
    @Column(name = "hora", nullable = true)
    private Time hora;
    @Basic
    @Column(name = "precio", nullable = true, precision = 2)
    private Double precio;
    @Id
    @Column(name = "id_sesion", nullable = false)
    private int idSesion;
    @ManyToOne
    @JoinColumn(name = "id_sala", referencedColumnName = "id_sala")
    private Sala salaByIdSala;
    @ManyToOne
    @JoinColumn(name = "id_pelicula", referencedColumnName = "id_pelicula")
    private Pelicula peliculaByIdPelicula;

    public Sesion() {
    }

    public Sesion(Date fecha, Time hora, Double precio, int idSesion) {
        this.fecha = fecha;
        this.hora = hora;
        this.precio = precio;
        this.idSesion = idSesion;
    }

    public Sesion(Date fecha, Time hora, Double precio, int idSesion, Sala salaByIdSala, Pelicula peliculaByIdPelicula) {
        this.fecha = fecha;
        this.hora = hora;
        this.precio = precio;
        this.idSesion = idSesion;
        this.salaByIdSala = salaByIdSala;
        this.peliculaByIdPelicula = peliculaByIdPelicula;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getIdSesion() {
        return idSesion;
    }

    public void setIdSesion(int idSesion) {
        this.idSesion = idSesion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sesion sesion = (Sesion) o;

        if (idSesion != sesion.idSesion) return false;
        if (fecha != null ? !fecha.equals(sesion.fecha) : sesion.fecha != null) return false;
        if (hora != null ? !hora.equals(sesion.hora) : sesion.hora != null) return false;
        if (precio != null ? !precio.equals(sesion.precio) : sesion.precio != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fecha != null ? fecha.hashCode() : 0;
        result = 31 * result + (hora != null ? hora.hashCode() : 0);
        result = 31 * result + (precio != null ? precio.hashCode() : 0);
        result = 31 * result + idSesion;
        return result;
    }

    public Sala getSalaByIdSala() {
        return salaByIdSala;
    }

    public void setSalaByIdSala(Sala salaByIdSala) {
        this.salaByIdSala = salaByIdSala;
    }

    public Pelicula getPeliculaByIdPelicula() {
        return peliculaByIdPelicula;
    }

    public void setPeliculaByIdPelicula(Pelicula peliculaByIdPelicula) {
        this.peliculaByIdPelicula = peliculaByIdPelicula;
    }

    @Override
    public String toString() {
        return "Sesion{" +
                "fecha=" + fecha +
                ", hora=" + hora +
                ", precio=" + precio +
                ", idSesion=" + idSesion +
                ", salaByIdSala=" + salaByIdSala.toString() +
                ", peliculaByIdPelicula=" + peliculaByIdPelicula.toString() +
                '}';
    }
}
