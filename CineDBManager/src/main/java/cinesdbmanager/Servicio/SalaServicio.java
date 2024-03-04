package cinesdbmanager.Servicio;

import cinesdbmanager.Modelo.Cine;
import cinesdbmanager.Modelo.Sala;
import cinesdbmanager.Repositorio.ISalaRepositorio;
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
    public List<Sala> listarTodo(){return salaRepositorio.findAll();}
}
