package com.sshacker.tutorialpoint;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LifeCycleConfig {
    @Bean(initMethod = "init", destroyMethod = "cleanup")
    public LifeCycle lifeCycle() {
        return new LifeCycle();
    }
}
