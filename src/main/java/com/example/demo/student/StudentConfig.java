package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.APRIL;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student mariam = new Student (
                    "Mariam",
                    "Mariam@gmail.com",
                    LocalDate.of(2000, APRIL, 12)

            );

            Student una = new Student (
                    "Una",
                    "Una@gmail.com",
                    LocalDate.of(2001, APRIL, 14)

            );

            repository.saveAll(
                    List.of(mariam, una)
            );
        };
    }
}
