package cinesdbmanager.Modelo;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
public class Cine {
    @Basic
    @Column(name = "direccion", nullable = true, length = 50)
    private String direccion;
    @Basic
    @Column(name = "nombre", nullable = true, length = 25)
    private String nombre;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cine")
    private int idCine;
    @OneToMany(mappedBy = "cineByIdCine")
    private List<Sala> salasByIdCine;

    public Cine() {
    }

    public Cine(String direccion, String nombre) {
        this.direccion = direccion;
        this.nombre = nombre;
    }

    public Cine(String direccion, String nombre, int idCine) {
        this.direccion = direccion;
        this.nombre = nombre;
        this.idCine = idCine;
        this.salasByIdCine=new ArrayList<Sala>();
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdCine() {
        return idCine;
    }

    public void setIdCine(int idCine) {
        this.idCine = idCine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cine cine = (Cine) o;

        if (idCine != cine.idCine) return false;
        if (direccion != null ? !direccion.equals(cine.direccion) : cine.direccion != null) return false;
        if (nombre != null ? !nombre.equals(cine.nombre) : cine.nombre != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = direccion != null ? direccion.hashCode() : 0;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + idCine;
        return result;
    }

    public List<Sala> getSalasByIdCine() {
        return salasByIdCine;
    }

    public void setSalasByIdCine(List<Sala> salasByIdCine) {
        this.salasByIdCine = salasByIdCine;
    }

    @Override
    public String toString() {
        return "Cine{" +
                "direccion='" + direccion + '\'' +
                ", nombre='" + nombre + '\'' +
                ", idCine=" + idCine +
                //", salasByIdCine=" + salasByIdCine +
                '}';
    }
}
