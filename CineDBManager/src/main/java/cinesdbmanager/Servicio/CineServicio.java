package cinesdbmanager.Servicio;

import cinesdbmanager.Modelo.Cine;
import cinesdbmanager.Repositorio.ICineRepositorio;
import jakarta.transaction.Transactional;
import jakarta.validation.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CineServicio {
    @Autowired
    private ICineRepositorio cineRepositorio;

    //Insertar cine
    public boolean insertarCine(Cine cine){
        cineRepositorio.save(cine);
        return true;
    }

    //Actualizar cine
    @Transactional
    public boolean actualizarCine(Cine cine){
        if(cineRepositorio.getReferenceById(cine.getIdCine())!=null){
            cineRepositorio.save(cine);
        }
        return true;
    }
    //Recuperar un cine por su id
    public Cine buscarCine(Integer id){
        return cineRepositorio.getReferenceById(id);
    }

    //Recuperar el id de un cine mediante su id pasando el objeto por parametro
    public Integer idCineObjeto(Cine cine){
        return cineRepositorio.getReferenceById(cine.getIdCine()).getIdCine();
    }

    //Listar todos los cines que hay en la bd
    public List<Cine>listarTodo(){return cineRepositorio.findAll();}

    //Recuperar el id maximo que hay guardado en la bd
    public Integer idCineMaximo(){
        return cineRepositorio.maximoCine();
    }

    //Eliminar el cine por id
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
