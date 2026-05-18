package com.terrencetyson.com.contentcalendar.config;

import com.terrencetyson.com.contentcalendar.model.Content;
import com.terrencetyson.com.contentcalendar.repository.ContentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {

    private final ContentRepository repository;
    private final ObjectMapper objectMapper;

    public DataLoader(ContentRepository repository, ObjectMapper objectMapper) {
        this.repository = repository;
        this.objectMapper = objectMapper;
    }


    @Override
    public void run(String... args) throws Exception {
        try(InputStream inputStream = TypeReference.class.getResourceAsStream("/data/content.json")) {
            repository.saveAll(objectMapper.readValue(inputStream, new TypeReference<List<Content>>(){}));
        }
    }
}
