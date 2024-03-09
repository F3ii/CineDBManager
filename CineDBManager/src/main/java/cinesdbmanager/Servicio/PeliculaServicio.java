package cinesdbmanager.Servicio;

import cinesdbmanager.Modelo.Cine;
import cinesdbmanager.Modelo.Pelicula;
import cinesdbmanager.Repositorio.IPeliculaRepositorio;
import jakarta.validation.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeliculaServicio {
    @Autowired
    private IPeliculaRepositorio peliculaRepositorio;

    //Funcion para insertar pelicula
    public boolean insertarPelicula(Pelicula pelicula){

        peliculaRepositorio.save(pelicula);
        return true;
    }

    //Actualizar pelicula
    public boolean actualizarPelicula(Pelicula pelicula){
        if(peliculaRepositorio.getReferenceById(pelicula.getIdPelicula())!=null){
            peliculaRepositorio.save(pelicula);
        }
        return true;
    }

    //
    public Integer idPeliculaObjeto(Pelicula pelicula){
        return peliculaRepositorio.getReferenceById(pelicula.getIdPelicula()).getIdPelicula();
    }

    //Recuperar una pelicula por su id
    public Pelicula buscarPelicula(Integer id){
        return peliculaRepositorio.getReferenceById(id);
    }

    //Recuperar el id maximo que hay guardado en la bd
    public Integer idPeliculaMaximo(){
        return peliculaRepositorio.maximaPelicula();
    }

    //Listar todas las pelicuas de la bd
    public List<Pelicula> listarTodo(){return peliculaRepositorio.findAll();}

    //Eliminar la pelicula por id
    public boolean eliminarPeliculaPorID(Integer id) {
        Pelicula borrado = peliculaRepositorio.getReferenceById(id);
        try {
            peliculaRepositorio.delete(borrado);
        }catch (ConstraintViolationException e ){
            return false;
        }
        return true;
    }
}
