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

    //Insertar salas
    public boolean insertarSala(Sala sala){
        salaRepositorio.save(sala);
        return true;
    }

    //Actualizar pelicula
    public boolean actualizarSala(Sala sala){
        if(salaRepositorio.getReferenceById(sala.getIdSala())!=null){
            salaRepositorio.save(sala);
        }
        return true;
    }

    //Recuperar el id maximo que hay guardado en la bd
    public Integer idSalaMaximo(){
        return salaRepositorio.maximaSala();
    }

    //Listar todas las salas de la bd
    public List<Sala> listarTodo(){return salaRepositorio.findAll();}

    //Listar todas las salas que hay en un cine
    public List<Sala> salaCine(Integer idCine){
        return salaRepositorio.salaCine(idCine);
    }

    //Eliminar una sala por su id
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
