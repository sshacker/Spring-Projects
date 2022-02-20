package com.sshacker.tutorialpoint;

import org.springframework.context.annotation.Bean;

public class TeacherConfig {
    @Bean
    public Teacher teacher() {
        return new Teacher();
    }
}
