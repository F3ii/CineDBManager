package cinesdbmanager.Repositorio;

import cinesdbmanager.Modelo.Cine;
import cinesdbmanager.Modelo.Sala;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ISalaRepositorio extends JpaRepository<Sala,Integer> {
    @Query("SELECT s FROM Sala s where s.cineByIdCine.idCine=:idCine")
    List<Sala> salaCine(
            @Param("idCine") Integer idCine
    );
    @Query("SELECT MAX(s.idSala) FROM Sala s")
    Integer maximaSala();
}
