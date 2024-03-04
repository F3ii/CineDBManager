package cinesdbmanager.Repositorio;

import cinesdbmanager.Modelo.Cine;
import cinesdbmanager.Modelo.Sala;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ISalaRepositorio extends JpaRepository<Sala,Integer> {

}
