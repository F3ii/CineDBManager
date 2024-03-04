package cinesdbmanager.Servicio;

import cinesdbmanager.Modelo.Cine;
import cinesdbmanager.Repositorio.ICineRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
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

    public Cine buscarCinePorID(Cine id){
        return cineRepositorio.getReferenceById(id.getIdCine());
    }
}
