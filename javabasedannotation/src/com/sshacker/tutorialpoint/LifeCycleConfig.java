package com.sshacker.tutorialpoint;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class LifeCycleConfig {
    @Bean(initMethod = "init", destroyMethod = "cleanup")
    @Scope("prototype")
    public LifeCycle lifeCycle() {
        return new LifeCycle();
    }
}
