package cinesdbmanager.Servicio;

import cinesdbmanager.Modelo.Cine;
import cinesdbmanager.Repositorio.ICineRepositorio;
import jakarta.validation.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CineServicio {
    @Autowired
    private ICineRepositorio cineRepositorio;
    public boolean insertarCine(Cine cine){
        cineRepositorio.save(cine);
        return true;
    }
    public boolean actualizarCine(Cine cine){
        if(cineRepositorio.getReferenceById(cine.getIdCine())!=null){
            cineRepositorio.save(cine);
        }
        return true;
    }
    public List<Cine>listarTodo(){return cineRepositorio.findAll();}
    public Integer idCineMaximo(){
        return cineRepositorio.maximoCine();
    }
    public boolean eliminarCinePorID(Integer id) {
        Cine borrado = cineRepositorio.getReferenceById(id);
        try {
            cineRepositorio.delete(borrado);
        }catch (ConstraintViolationException e ){
            return false;
        }
        return true;
    }
}
