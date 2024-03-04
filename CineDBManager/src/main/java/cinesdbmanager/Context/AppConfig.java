package cinesdbmanager.Context;

import cinesdbmanager.Servicio.CineServicio;
import cinesdbmanager.Servicio.PeliculaServicio;
import cinesdbmanager.Servicio.SalaServicio;
import cinesdbmanager.Servicio.SesionServicio;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScans({
        @ComponentScan(basePackages = "cinesdbmanager.Servicio")
})      // anotacion no necesaria
@EnableJpaRepositories(basePackages = "cinesdbmanager.Repositorio")    // anotacion no necesaria
public class AppConfig {
    public static CineServicio getCineServicio(){
        return SpringContext.getContext().getBean(CineServicio.class);
    }
    public static PeliculaServicio getPeliculaServicio(){
        return SpringContext.getContext().getBean(PeliculaServicio.class);
    }
    public static SalaServicio getSalaServicio(){
        return SpringContext.getContext().getBean(SalaServicio.class);
    }
    public static SesionServicio getSesionServicio(){
        return SpringContext.getContext().getBean(SesionServicio.class);
    }
}
