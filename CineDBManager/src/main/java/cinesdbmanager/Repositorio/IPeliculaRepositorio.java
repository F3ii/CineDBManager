package cinesdbmanager.Repositorio;

import cinesdbmanager.Modelo.Cine;
import cinesdbmanager.Modelo.Pelicula;
import cinesdbmanager.Modelo.Sala;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPeliculaRepositorio extends JpaRepository<Pelicula,Integer> {
    @Query("SELECT p FROM Pelicula p JOIN p.sesionsByIdPelicula s WHERE s.idSesion=:idSesion")
    Pelicula peliculaSesion(
            @Param("idSesion") Integer idSesion
    );
}
