package cinesdbmanager.Modelo;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
public class Pelicula {
    @Basic
    @Column(name = "nombre", nullable = true, length = 25)
    private String nombre;
    @Basic
    @Column(name = "director", nullable = true, length = 25)
    private String director;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pelicula")
    private int idPelicula;
    @Basic
    @Column(name = "pg_edad", nullable = true)
    private Integer pgEdad;
    @OneToMany(mappedBy = "peliculaByIdPelicula")
    private List<Sesion> sesionsByIdPelicula;

    public Pelicula() {
    }

    public Pelicula(String nombre, String director, Integer pgEdad) {
        this.nombre = nombre;
        this.director = director;
        this.pgEdad = pgEdad;
        this.sesionsByIdPelicula=new ArrayList<Sesion>();
    }

    public Pelicula(String nombre, String director, int idPelicula, Integer pgEdad) {
        this.nombre = nombre;
        this.director = director;
        this.idPelicula = idPelicula;
        this.pgEdad = pgEdad;
        this.sesionsByIdPelicula=new ArrayList<Sesion>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    public Integer getPgEdad() {
        return pgEdad;
    }

    public void setPgEdad(Integer pgEdad) {
        this.pgEdad = pgEdad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pelicula pelicula = (Pelicula) o;

        if (idPelicula != pelicula.idPelicula) return false;
        if (nombre != null ? !nombre.equals(pelicula.nombre) : pelicula.nombre != null) return false;
        if (director != null ? !director.equals(pelicula.director) : pelicula.director != null) return false;
        if (pgEdad != null ? !pgEdad.equals(pelicula.pgEdad) : pelicula.pgEdad != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nombre != null ? nombre.hashCode() : 0;
        result = 31 * result + (director != null ? director.hashCode() : 0);
        result = 31 * result + idPelicula;
        result = 31 * result + (pgEdad != null ? pgEdad.hashCode() : 0);
        return result;
    }

    public List<Sesion> getSesionsByIdPelicula() {
        return sesionsByIdPelicula;
    }

    public void setSesionsByIdPelicula(List<Sesion> sesionsByIdPelicula) {
        this.sesionsByIdPelicula = sesionsByIdPelicula;
    }

    @Override
    public String toString() {
        return nombre;
        /*return "Pelicula{" +
                "nombre='" + nombre + '\'' +
                ", director='" + director + '\'' +
                ", idPelicula=" + idPelicula +
                ", pgEdad=" + pgEdad +
                //", sesionsByIdPelicula=" + sesionsByIdPelicula +
                '}';*/
    }
}
