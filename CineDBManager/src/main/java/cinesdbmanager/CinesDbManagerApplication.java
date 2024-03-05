package cinesdbmanager;

import cinesdbmanager.Context.AppConfig;
import cinesdbmanager.Modelo.Cine;
import cinesdbmanager.Modelo.Pelicula;
import cinesdbmanager.Modelo.Sala;
import cinesdbmanager.Modelo.Sesion;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;

@SpringBootApplication
public class CinesDbManagerApplication {
    public static void main(String[] args) {
        Cine cine=new Cine("asdasd","asdas",12);
        Sala sala=new Sala(567,true,1);
        Sesion sesion=new Sesion(new Date(12,3,2024),new Time((long) 12.2),4.5,456);
        Pelicula pelicula=new Pelicula("Prueba","Steve",1254,18);

        sala.setCineByIdCine(cine);
        ArrayList<Sala>salas=new ArrayList<>();
        salas.add(sala);
        cine.setSalasByIdCine(salas);
        sesion.setSalaByIdSala(sala);
        sesion.setPeliculaByIdPelicula(pelicula);
        ArrayList<Sesion>sesiones=new ArrayList<>();
        sesiones.add(sesion);

        //Pruebas Inserccion
        AppConfig.getCineServicio().insertarCine(cine);
        AppConfig.getSalaServicio().insertarSala(sala);
        AppConfig.getPeliculaServicio().insertarPelicula(pelicula);
        AppConfig.getSesionServicio().insertSesion(sesion);

      //PRUEBAS
       // ArrayList<Sala>salas=new ArrayList<>();
        salas.add(sala);
        cine.setSalasByIdCine(salas);

        //Pruebas update
        cine.setNombre("Nuevo");
        AppConfig.getCineServicio().actualizarCine(cine);

        sala.setNºbutacas(45);
        AppConfig.getSalaServicio().actualizarSala(sala);

        sesion.setPrecio(5.0);
        AppConfig.getSesionServicio().actualizarSesion(sesion);

        pelicula.setPgEdad(13);
        AppConfig.getPeliculaServicio().actualizarPelicula(pelicula);


        //Listar todo
        ArrayList<Cine>cines= (ArrayList<Cine>) AppConfig.getCineServicio().listarTodo();
        cines.forEach(c -> {
            System.out.println(c);
        });

        ArrayList<Sesion>sesiones1= (ArrayList<Sesion>) AppConfig.getSesionServicio().listarTodo();
        sesiones1.add(sesion);
        sesiones1.forEach(s->{
            System.out.println(s);
        });

        ArrayList<Pelicula>peliculas= (ArrayList<Pelicula>) AppConfig.getPeliculaServicio().listarTodo();
        peliculas.add(pelicula);
        peliculas.forEach(p->{
            System.out.println(p);
        });

        ArrayList<Sala>salas1= (ArrayList<Sala>) AppConfig.getSalaServicio().listarTodo();
        salas1.add(sala);
        salas1.forEach(s1->{
            System.out.println(s1);
        });
        System.out.println("Cambio realizado");
        //Pruebas eliminar
        System.out.println("Prueba rama2");

    }

}
