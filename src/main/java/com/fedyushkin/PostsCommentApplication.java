package com.fedyushkin;

import com.fedyushkin.controller.PostController;
import com.fedyushkin.controller.UserController;
import com.fedyushkin.entity.Post;
import com.fedyushkin.entity.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PostsCommentApplication {

    public static void main(String[] args) {
        SpringApplication.run(PostsCommentApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo (PostController postController, UserController userController){
        return (args) -> {
            long id1 = postController.addPost(new Post("Microservices with Spring Boot.", "With Spring Boot, your microservices can start small and iterate fast."));
            long id2 = postController.addPost(new Post("Microservice resilience with Spring Cloud.", "The distributed nature of microservices brings challenges."));
            long id3 = userController.createUser(new User("pavel2303", "23031999Fp", "Pavel", "Fedyushkin"));
        };
    }
}
