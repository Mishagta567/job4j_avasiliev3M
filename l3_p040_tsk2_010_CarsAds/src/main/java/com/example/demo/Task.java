package com.example.demo;


import org.springframework.data.annotation.Id;


public class Task {
    String description;
    String user;

    public Task() {
    }

    public Task(String description, String user) {
        this.description = description;
        this.user = user;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Task{" +
                "description='" + description + '\'' +
                ", user='" + user + '\'' +
                '}';
    }
}
