package cinesdbmanager.Repositorio;

import cinesdbmanager.Modelo.Sala;
import cinesdbmanager.Modelo.Sesion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ISesionRepositorio extends JpaRepository<Sesion,Integer> {
    @Query("SELECT MAX(s.idSesion) FROM Sesion s")
    Integer maximoSesion();
    @Query("SELECT s FROM Sesion s where s.salaByIdSala.idSala=:idSala")
    List<Sesion> sesionSala(
            @Param("idSala") Integer idSala
    );
}
