package cinesdbmanager.Servicio;

import cinesdbmanager.Modelo.Cine;
import cinesdbmanager.Modelo.Sala;
import cinesdbmanager.Modelo.Sesion;
import cinesdbmanager.Repositorio.ISesionRepositorio;
import jakarta.validation.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SesionServicio {
    @Autowired
    private ISesionRepositorio sesionRepositorio;
    public boolean insertSesion(Sesion sesion){
        sesionRepositorio.save(sesion);
        return true;
    }
    public boolean actualizarSesion(Sesion sesion){
        if(sesionRepositorio.getReferenceById(sesion.getIdSesion())!=null){
            sesionRepositorio.save(sesion);
        }
        return true;
    }
    public List<Sesion> listarTodo(){return sesionRepositorio.findAll();}
    public boolean eliminarSesionPorID(Integer id) {
        Sesion borrado = sesionRepositorio.getReferenceById(id);
        try {
            sesionRepositorio.delete(borrado);
        }catch (ConstraintViolationException e ){
            return false;
        }
        return true;
    }
}
