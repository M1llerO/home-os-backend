package home.os.backend.entities;

import jakarta.persistence.*;
import org.hibernate.boot.registry.selector.spi.StrategyCreator;

@Entity
@Table(name = "rooms")

public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private long id;

    @Column(name = "name", nullable = false,length = 50)
    private String name;

    @Column(name= "description", length = 255)
    private String description;

    protected Room() {
    }

    public Room(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
