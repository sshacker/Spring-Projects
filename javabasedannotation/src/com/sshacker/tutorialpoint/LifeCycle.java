package com.sshacker.tutorialpoint;

public class LifeCycle {
    public void init() {
        System.out.println("init");
    }

    public void cleanup() {
        System.out.println("cleanup");
    }

    public void cycle() {
        System.out.println("life cycle");
    }
}
