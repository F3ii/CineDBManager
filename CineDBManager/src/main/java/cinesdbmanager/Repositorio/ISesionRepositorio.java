package cinesdbmanager.Repositorio;

import cinesdbmanager.Modelo.Sala;
import cinesdbmanager.Modelo.Sesion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ISesionRepositorio extends JpaRepository<Sesion,Integer> {
    @Query("SELECT MAX(s.idSesion) FROM Sesion s")
    Integer maximoSesion();
}
