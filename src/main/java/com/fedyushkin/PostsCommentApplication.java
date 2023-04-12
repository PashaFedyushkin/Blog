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
            long id1 = userController.createUser(new User("pavel2303", "23031999Fp", "Pavel", "Fedyushkin"));
            long id2 = userController.createUser(new User("nikitos06", "1406Nikita", "Nikita", "Lisouski"));
            long id3 = userController.createUser(new User("makmur1999", "12021999Maks", "Maksim", "Murashko"));
        };
    }
}
