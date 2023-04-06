package com.fedyushkin.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "posts_seq")
    @SequenceGenerator(name = "posts_seq", sequenceName = "posts_seq", allocationSize = 1)
    private Long id;

    private String title;

    private String content;

    public Post(String title, String content){
        this.title = title;
        this.content = content;
    }
}
