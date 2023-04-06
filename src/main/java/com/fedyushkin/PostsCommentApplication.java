package com.fedyushkin;

import com.fedyushkin.controller.PostController;
import com.fedyushkin.entity.Post;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PostsCommentApplication {

    public static void main(String[] args) {
        SpringApplication.run(PostsCommentApplication.class, args);
    }

    /*@Bean
    public CommandLineRunner demo (PostController postController){
        return (args) -> {
            long id1 = postController.addPost(new Post("Microservices with Spring Boot.", "With Spring Boot, your microservices can start small and iterate fast. That’s why it has become the de facto standard for Java™ microservices. Quickstart your project with Spring Initializr and then package as a JAR. With Spring Boot’s embedded server model, you’re ready to go in minutes."));
            long id2 = postController.addPost(new Post("Microservice resilience with Spring Cloud.", "The distributed nature of microservices brings challenges. Spring helps you mitigate these. With several ready-to-run cloud patterns, Spring Cloud can help with service discovery, load-balancing, circuit-breaking, distributed tracing, and monitoring. It can even act as an API gateway."));
        };
    }*/
}
