package cinesdbmanager.Servicio;

import cinesdbmanager.Modelo.Cine;
import cinesdbmanager.Modelo.Pelicula;
import cinesdbmanager.Repositorio.IPeliculaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeliculaServicio {
    @Autowired
    private IPeliculaRepositorio peliculaRepositorio;
    public boolean insertarPelicula(Pelicula pelicula){
        peliculaRepositorio.save(pelicula);
        return true;
    }
    public boolean actualizarPelicula(Pelicula pelicula){
        if(peliculaRepositorio.getReferenceById(pelicula.getIdPelicula())!=null){
            peliculaRepositorio.save(pelicula);
        }
        return true;
    }
    public List<Pelicula> listarTodo(){return peliculaRepositorio.findAll();}
}