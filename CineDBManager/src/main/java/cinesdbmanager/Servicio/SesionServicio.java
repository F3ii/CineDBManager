package cinesdbmanager.Servicio;

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

    //Insertar Sesion
    public boolean insertSesion(Sesion sesion){
        sesionRepositorio.save(sesion);
        return true;
    }

    //Actualizar sesion
    public boolean actualizarSesion(Sesion sesion){
        if(sesionRepositorio.getReferenceById(sesion.getIdSesion())!=null){
            sesionRepositorio.save(sesion);
        }
        return true;
    }

    //Recuperar el id maximo que hay guardado en la bd
    public Integer idSesionMaxima(){
        return sesionRepositorio.maximoSesion();
    }

    //Listar todas las sesiones de la bd
    public List<Sesion> listarTodo(){return sesionRepositorio.findAll();}

    //Eliminar sesion por su id
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
