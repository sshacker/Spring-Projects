package com.sshacker.tutorialpoint;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(Teacher.class)
public class StudentConfig {
    @Bean
    public Student student() {
        return new Student();
    }
}
