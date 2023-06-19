package com.hossain.json;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hossain.json.entity.Json;
import com.hossain.json.service.JsonService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@SpringBootApplication
public class JsonFileReadApplication {

    public static void main(String[] args) {
        SpringApplication.run(JsonFileReadApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(JsonService service){
        return args -> {
            ObjectMapper objectMapper = new ObjectMapper();
            TypeReference<List<Json>> typeReference = new TypeReference<List<Json>>() {};
            InputStream inputStream = TypeReference.class.getResourceAsStream("/User.json");
            try {
                List<Json> jsons = objectMapper.readValue(inputStream, typeReference);
                service.save(jsons);
                System.out.println("Users saved");
            }catch (IOException e){
                System.out.println("Unable to save users: " + e.getMessage());
            }
        };
    }

}
