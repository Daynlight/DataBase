package com.example.springboot;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Value;


@SpringBootApplication
public class Application {

  @Value("${server.port}")
  private int port;

  public static void main(String[] args) {
    ApplicationContext ctx = SpringApplication.run(Application.class, args);
    
    Application app = ctx.getBean(Application.class);
    System.out.println("Server is running on port: " + app.port);
  }
  
}
