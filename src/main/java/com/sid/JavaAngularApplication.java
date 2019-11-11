package com.sid;

import com.sid.domain.Tache;
import com.sid.service.TacheService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.stream.Stream;

@SpringBootApplication
public class JavaAngularApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaAngularApplication.class, args);
    }

    @Bean
    CommandLineRunner start(TacheService tacheService){
        return args->{
            Stream.of("tache1", "tache2", "tache3", "tache4", "tache5").forEach(t->{
                tacheService.AjouterTache(new Tache(null,t, LocalDate.now(),false));
                tacheService.listTaches().forEach(System.out::println);
            });
        };
    }
}
