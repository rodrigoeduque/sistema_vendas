package com.rodrigoeduque.clientes;

import com.rodrigoeduque.clientes.model.entity.Cliente;
import com.rodrigoeduque.clientes.model.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClientesApplication {

    @Bean
    public CommandLineRunner run(@Autowired ClienteRepository repository) {
        return args -> {
            Cliente cliente = new Cliente().builder().cpf("07443573650").nome("Rodrigo Eustáquio Duque").build();
            repository.save(cliente);
            Cliente cliente1 = new Cliente().builder().cpf("01234567812").nome("Ana Camila Mendonça Duque").build();
            repository.save(cliente1);
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(ClientesApplication.class, args);
    }
}
