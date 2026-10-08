package home.os.backend.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "device_types")

public class DeviceType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

    @OneToOne
    @Column(name = "name", nullable = false, length = 50, unique = true)
    private String name;

}
