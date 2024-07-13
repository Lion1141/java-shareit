package ru.practicum.shareit.item.model;

import lombok.*;
import org.hibernate.Hibernate;
import ru.practicum.shareit.request.ItemRequest;
import ru.practicum.shareit.user.User;

import javax.persistence.*;
import java.util.Objects;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "items")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "description", nullable = false)
    private String description;
    @Column(name = "available", nullable = false)
    private Boolean available;
    @ManyToOne
    @JoinColumn(name = "owner_id", nullable = false)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private User owner;
    @ManyToOne
    @JoinColumn(name = "request_id")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ItemRequest request;

    public Item(String name, String description, Boolean available) {
        this.name = name;
        this.description = description;
        this.available = available;
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

    @Override
    public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) {
                return false;
            }
            Item item = (Item) o;
            return (Objects.equals(name, item.name)) &&
                    (Objects.equals(description, item.description));
        }
}
