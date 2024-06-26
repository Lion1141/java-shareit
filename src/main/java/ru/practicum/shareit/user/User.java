package ru.practicum.shareit.user;

import lombok.*;

import javax.persistence.*;
import java.util.Objects;

@Data
//Вернул @Data так как не смог переопределить метод hashcode
//без которого падали тесты github
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "email", nullable = false, unique = true)
    private String email;
}


