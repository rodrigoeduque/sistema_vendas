package com.rodrigoeduque.clientes;

import com.rodrigoeduque.clientes.model.entity.Cliente;
import com.rodrigoeduque.clientes.model.entity.ServicoPrestado;
import com.rodrigoeduque.clientes.model.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@SpringBootApplication
public class ClientesApplication {

    @Bean
    public CommandLineRunner run(@Autowired ClienteRepository repository) {
        return args -> {



            Cliente cliente = new Cliente().builder().cpf("07443573650").nome("Rodrigo Eustáquio Duque").build();
            repository.save(cliente);
            Cliente cliente1 = new Cliente().builder().cpf("81314277065").nome("Ana Camila Mendonça Duque").build();
            repository.save(cliente1);
            Cliente cliente2 = new Cliente().builder().cpf("65237811000").nome("FierceCarbine Kyed").build();
            repository.save(cliente2);
            Cliente cliente3 = new Cliente().builder().cpf("22239709073").nome("Ciogoduk Lumdvoel").build();
            repository.save(cliente3);



        };
    }

    public static void main(String[] args) {
        SpringApplication.run(ClientesApplication.class, args);
    }
}
