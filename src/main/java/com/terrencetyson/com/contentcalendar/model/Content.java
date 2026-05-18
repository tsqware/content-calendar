package com.terrencetyson.com.contentcalendar.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

public record Content(
        @Id
        Integer id,
        @NotBlank
        String title,
        String description,
        Status status,
        Type contentType,
        LocalDateTime dateCreated,
        LocalDateTime dateUpdated,
        String url
) {

}
