package cinesdbmanager.Repositorio;

import cinesdbmanager.Modelo.Cine;
import cinesdbmanager.Modelo.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IPeliculaRepositorio extends JpaRepository<Pelicula,Integer> {
}
