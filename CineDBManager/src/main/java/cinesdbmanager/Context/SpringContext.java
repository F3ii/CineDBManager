package cinesdbmanager.Context;

import cinesdbmanager.CinesDbManagerApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class SpringContext {
    private static final ConfigurableApplicationContext context;
    /*
        Constructor estático, para que solo haya una instancio de la clase que se encarga de leer el fichero
        y generar contexto
     */
    static {
        try {
            // Create the ConfigurableApplicationContext from context
            // config file.
            context = SpringApplication.run(CinesDbManagerApplication.class);
        } catch (Throwable ex) {
            // Log the exception.
            System.err.println("Initial ConfigurableApplicationContext creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static ConfigurableApplicationContext getContext() {
        return context;
    }
}
