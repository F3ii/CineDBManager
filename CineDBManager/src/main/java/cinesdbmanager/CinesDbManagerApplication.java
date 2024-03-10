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
        Cine cine=new Cine("GranCasa, C. de María Zambrano, 35, 50018 Zaragoza","Cine Gran Casa");
        Sesion sesion=new Sesion(new Date(12,3,2024),new Time((long) 12.2),4.5);
        Pelicula pelicula=new Pelicula("Dune","Denis Villeneuve",18);

        Cine cine2=new Cine("Puerto Venecia, 50021 Zaragoza","Cine Puerto Venecia");
        Sesion sesion2=new Sesion(new Date(12,3,2024),new Time((long) 12.2),5.5);
        Pelicula pelicula2=new Pelicula("El Zorro","Adrian Goiginger",18);

        Pelicula pelicula3=new Pelicula("The Fallout","Megan Park",16);
        Pelicula pelicula4=new Pelicula("Oppenheimer","Christopher Nolan",16);

//        sala.setCineByIdCine(cine);
//        ArrayList<Sala>salas=new ArrayList<>();
//        salas.add(sala);
//        cine.setSalasByIdCine(salas);

//
//        ArrayList<Sesion>sesiones=new ArrayList<>();
//        sesiones.add(sesion);
//        pelicula.setSesionsByIdPelicula(sesiones);

//        //Pruebas Inserccion
        AppConfig.getCineServicio().insertarCine(cine);
        System.out.println(AppConfig.getCineServicio().idCineObjeto(cine));
        Sala sala=new Sala(1234,1,true,AppConfig.getCineServicio().idCineObjeto(cine));
        sala.setCineByIdCine(AppConfig.getCineServicio().buscarCine(AppConfig.getCineServicio().idCineObjeto(cine)));
        AppConfig.getSalaServicio().insertarSala(sala);
        sesion.setSalaByIdSala(sala);
        AppConfig.getPeliculaServicio().insertarPelicula(pelicula);
        sesion.setPeliculaByIdPelicula(AppConfig.getPeliculaServicio().buscarPelicula(AppConfig.getPeliculaServicio().idPeliculaObjeto(pelicula)));
        AppConfig.getSesionServicio().insertSesion(sesion);

        AppConfig.getCineServicio().insertarCine(cine2);
        System.out.println(AppConfig.getCineServicio().idCineObjeto(cine2));
        Sala sala2=new Sala(1234,2,true,AppConfig.getCineServicio().idCineObjeto(cine2));
        sala2.setCineByIdCine(AppConfig.getCineServicio().buscarCine(AppConfig.getCineServicio().idCineObjeto(cine2)));
        AppConfig.getSalaServicio().insertarSala(sala2);
        sesion2.setSalaByIdSala(sala2);
        AppConfig.getPeliculaServicio().insertarPelicula(pelicula2);
        sesion2.setPeliculaByIdPelicula(AppConfig.getPeliculaServicio().buscarPelicula(AppConfig.getPeliculaServicio().idPeliculaObjeto(pelicula2)));
        AppConfig.getSesionServicio().insertSesion(sesion2);

        Sala sala3=new Sala(245,3,false,AppConfig.getCineServicio().idCineObjeto(cine2));
        sala3.setCineByIdCine(AppConfig.getCineServicio().buscarCine(AppConfig.getCineServicio().idCineObjeto(cine2)));
        AppConfig.getSalaServicio().insertarSala(sala3);

        Sala sala4=new Sala(100,1,true,AppConfig.getCineServicio().idCineObjeto(cine2));
        sala4.setCineByIdCine(AppConfig.getCineServicio().buscarCine(AppConfig.getCineServicio().idCineObjeto(cine2)));
        AppConfig.getSalaServicio().insertarSala(sala4);

        Sala sala5=new Sala(150,3,true,AppConfig.getCineServicio().idCineObjeto(cine));
        sala5.setCineByIdCine(AppConfig.getCineServicio().buscarCine(AppConfig.getCineServicio().idCineObjeto(cine)));
        AppConfig.getSalaServicio().insertarSala(sala5);

        System.out.println(AppConfig.getSalaServicio().buscarSalaporIds(1,1));
        //AppConfig.getSalaServicio().eliminarSalaPorIdCineSala(1,1);
//      //PRUEBAS
////        ArrayList<Sala>salas2=new ArrayList<>();
////        salas2.add(sala);
////        cine.setSalasByIdCine(salas2);
//
//        //Pruebas update
//        cine.setNombre("Nuevo");
//        AppConfig.getCineServicio().actualizarCine(cine);
//
//        sesion.setPrecio(5.0);
//        AppConfig.getSesionServicio().actualizarSesion(sesion);
//
//        pelicula.setPgEdad(13);
//        AppConfig.getPeliculaServicio().actualizarPelicula(pelicula);
////
////        sala.setVip(false);
////        AppConfig.getSalaServicio().actualizarSala(sala);
//
//
//        //Listar todo
//        ArrayList<Cine>cines= (ArrayList<Cine>) AppConfig.getCineServicio().listarTodo();
//        cines.forEach(c -> {
//            System.out.println(c);
//        });
//
//        ArrayList<Sesion>sesiones1= (ArrayList<Sesion>) AppConfig.getSesionServicio().listarTodo();
//        sesiones1.add(sesion);
//        sesiones1.forEach(s->{
//            System.out.println(s);
//        });
//
//        ArrayList<Pelicula>peliculas= (ArrayList<Pelicula>) AppConfig.getPeliculaServicio().listarTodo();
//        peliculas.add(pelicula);
//        peliculas.forEach(p->{
//            System.out.println(p);
//        });
//
//        ArrayList<Sala>salas1= (ArrayList<Sala>) AppConfig.getSalaServicio().listarTodo();
//        salas1.add(sala);
//        salas1.forEach(s1->{
//            System.out.println(s1);
//        });
        //Pruebas eliminar
//        AppConfig.getCineServicio().eliminarCinePorID(cine.getIdCine());
//        System.out.println("Cine eliminado");
//        System.out.println(AppConfig.getCineServicio().idCineMaximo().toString());
        System.out.println("");
    }

}
