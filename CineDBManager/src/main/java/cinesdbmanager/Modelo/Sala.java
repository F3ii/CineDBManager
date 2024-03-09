package cinesdbmanager.Modelo;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@IdClass(SalaCine_PK.class)
public class Sala {
    @Basic
    @Column(name = "nºbutacas", nullable = true)
    private Integer nºbutacas;
    @Basic
    @Column(name = "nºsala", nullable = true)
    private Integer nºsala;
    @Basic
    @Column(name = "vip", nullable = true)
    private Boolean vip;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_sala")
    private int idSala;
    @Id
    @Column(name="id_cine")
    private int idCine;
    @MapsId("id_cine")
    @ManyToOne
    @JoinColumn(name = "id_cine", referencedColumnName = "id_cine")
    private Cine cineByIdCine;
    @OneToMany(mappedBy = "salaByIdSala",cascade = CascadeType.ALL)
    private List<Sesion> sesionsByIdSala;

    public Sala() {
    }

    public Sala(Integer nºbutacas, Integer nºsala, Boolean vip, int idCine) {
        this.nºbutacas = nºbutacas;
        this.nºsala = nºsala;
        this.vip = vip;
        this.idCine = idCine;
        this.sesionsByIdSala=new ArrayList<Sesion>();
    }

    public Sala(Integer nºbutacas, Integer nºsala, Boolean vip, int idSala, int idCine) {
        this.nºbutacas = nºbutacas;
        this.nºsala = nºsala;
        this.vip = vip;
        this.idSala = idSala;
        this.idCine = idCine;
        this.sesionsByIdSala=new ArrayList<Sesion>();
    }

    public Sala(Integer nºbutacas, Integer nºsala, Boolean vip) {
        this.nºbutacas = nºbutacas;
        this.nºsala = nºsala;
        this.vip = vip;
        this.sesionsByIdSala=new ArrayList<Sesion>();
    }


    public Integer getNºsala() {
        return nºsala;
    }

    public void setNºsala(Integer nºsala) {
        this.nºsala = nºsala;
    }

    public Integer getNºbutacas() {
        return nºbutacas;
    }

    public void setNºbutacas(Integer nºbutacas) {
        this.nºbutacas = nºbutacas;
    }

    public Boolean getVip() {
        return vip;
    }

    public void setVip(Boolean vip) {
        this.vip = vip;
    }

    public int getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sala sala = (Sala) o;

        if (idSala != sala.idSala) return false;
        if (nºbutacas != null ? !nºbutacas.equals(sala.nºbutacas) : sala.nºbutacas != null) return false;
        if (vip != null ? !vip.equals(sala.vip) : sala.vip != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nºbutacas != null ? nºbutacas.hashCode() : 0;
        result = 31 * result + (vip != null ? vip.hashCode() : 0);
        result = 31 * result + idSala;
        return result;
    }

    public Cine getCineByIdCine() {
        return cineByIdCine;
    }

    public void setCineByIdCine(Cine cineByIdCine) {
        this.cineByIdCine = cineByIdCine;
    }

    public List<Sesion> getSesionsByIdSala() {
        return sesionsByIdSala;
    }

    public void setSesionsByIdSala(List<Sesion> sesionsByIdSala) {
        this.sesionsByIdSala = sesionsByIdSala;
    }

    @Override
    public String toString() {
        return "Sala{" +
                "nºbutacas=" + nºbutacas +
                ", vip=" + vip +
                ", idSala=" + idSala +
                ", cineByIdCine=" + cineByIdCine +
                //", sesionsByIdSala=" + sesionsByIdSala +
                '}';
    }
}
