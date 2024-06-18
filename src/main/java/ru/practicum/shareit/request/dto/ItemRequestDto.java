package ru.practicum.shareit.request.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.practicum.shareit.user.User;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemRequestDto {
    Long id;
    String description;
    User requester;
    LocalDate created;

    public ItemRequestDto(Long id, String description) {
        this.id = id;
        this.description = description;
    }
}
