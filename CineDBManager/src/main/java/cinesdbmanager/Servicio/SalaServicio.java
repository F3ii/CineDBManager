package cinesdbmanager.Servicio;

import cinesdbmanager.Modelo.Cine;
import cinesdbmanager.Modelo.Sala;
import cinesdbmanager.Repositorio.ISalaRepositorio;
import jakarta.validation.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaServicio {
    @Autowired
    private ISalaRepositorio salaRepositorio;
    public boolean insertarSala(Sala sala){
        salaRepositorio.save(sala);
        return true;
    }
    public boolean actualizarSala(Sala sala){
        if(salaRepositorio.getReferenceById(sala.getIdSala())!=null){
            salaRepositorio.save(sala);
        }
        return true;
    }
    public Integer idSalaMaximo(){
        return salaRepositorio.maximaSala();
    }
    public List<Sala> listarTodo(){return salaRepositorio.findAll();}
    public List<Sala> salaCine(Integer idCine){
        return salaRepositorio.salaCine(idCine);
    }
    public boolean eliminarSalaPorID(Integer id) {
        Sala borrado = salaRepositorio.getReferenceById(id);
        try {
            salaRepositorio.delete(borrado);
        }catch (ConstraintViolationException e ){
            return false;
        }
        return true;
    }
}
