package com.terrencetyson.com.contentcalendar;

import com.terrencetyson.com.contentcalendar.config.ContentCalendarProperties;
import com.terrencetyson.com.contentcalendar.model.Content;
import com.terrencetyson.com.contentcalendar.model.Status;
import com.terrencetyson.com.contentcalendar.model.Type;
import com.terrencetyson.com.contentcalendar.repository.ContentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.util.Arrays;

@EnableConfigurationProperties(ContentCalendarProperties.class)
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	

}
