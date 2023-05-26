package com.softek.hibernate1;

import com.softek.hibernate1.modelo.Piloto;
import com.softek.hibernate1.repository.*;
import com.softek.hibernate1.service.IPilotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Hibernate1Application implements CommandLineRunner {

    @Autowired
    private IPilotoService pServicio;
    public static void main(String[] args) {
        SpringApplication.run(Hibernate1Application.class, args);
    }

     @Override
    public void run(String... args) throws Exception {
        System.out.println("\n***************************");
        System.out.println("SPRING APPLICATION STARTED");
        System.out.println("***************************\n");

//         System.out.println("\nPilotos por Temporada \n" + pServicio.pilotosPorTemporada(1L));
         System.out.println("\nPilotos por Escuderia \n");
         for (Piloto p : pServicio.pilotosPorEscuderia("Mercedes")){
             System.out.println("\n" + p + "\n");
         }
         System.out.println("\nPilotos por Sueldo Minimo \n");
         for (Piloto p : pServicio.pilotosPorSueldoMinimo(1400000)){
             System.out.println("\n" + p + "\n");
         }
         System.out.println("\npilotos que cobren por publicidad entre 2 valores\n" +
                 pServicio.pilotosPublicidadEntre(30500, 40100));
         System.out.println("\npilotos no italianos:\n");
         for (Piloto p : pServicio.pilotosNoItalianos()) {
             System.out.println("\n" + p + "\n");
         }
         System.out.println("\n obtener Telefonos De Alonso\n" + pServicio.obtenerTelefonosDeAlonso() );





    }
}
