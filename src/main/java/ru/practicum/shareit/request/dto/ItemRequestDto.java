package ru.practicum.shareit.request.dto;

import ru.practicum.shareit.user.User;

import java.time.LocalDate;

public class ItemRequestDto {
    Long id;
    String description;
    User requestor;
    LocalDate created;
}
