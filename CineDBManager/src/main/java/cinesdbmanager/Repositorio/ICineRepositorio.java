package cinesdbmanager.Repositorio;

import cinesdbmanager.Modelo.Cine;
import cinesdbmanager.Modelo.Sala;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICineRepositorio extends JpaRepository<Cine,Integer> {
    @Query("SELECT MAX(c.idCine) FROM Cine c")
    Integer maximoCine();
}
