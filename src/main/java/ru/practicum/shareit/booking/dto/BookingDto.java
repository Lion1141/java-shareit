package ru.practicum.shareit.booking.dto;

import ru.practicum.shareit.booking.Status;
import ru.practicum.shareit.item.model.Item;

import java.time.LocalDate;

public class BookingDto {
    private Long id;
    private LocalDate start;
    private LocalDate end;
    private Item item;
    private String booker;
    private Status status;
}
