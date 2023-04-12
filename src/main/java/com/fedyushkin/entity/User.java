package com.fedyushkin.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.hibernate.validator.constraints.UniqueElements;

@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "users_seq")
    @SequenceGenerator(name = "users_seq", sequenceName = "users_seq", allocationSize = 1)
    private Long id;

    @NotNull
    @Size(max = 30, message = "Login should not be more than 30 characters.")
    private String login;

    @NotNull
    @Size(min = 6, max = 20, message = "Password should be between 6 and 20 characters.")
    private String password;

    @NotNull
    private String name;

    @NotNull
    private String surname;

    public User(String login, String password, String name, String surname){
        this.login = login;
        this.password = password;
        this.name = name;
        this.surname = surname;
    }
}
