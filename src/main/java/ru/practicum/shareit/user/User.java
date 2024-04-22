package ru.practicum.shareit.user;

import lombok.*;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class User {
    private Long id;
    private String name;
    private String email;
}
