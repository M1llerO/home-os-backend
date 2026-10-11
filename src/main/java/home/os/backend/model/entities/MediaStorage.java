package home.os.backend.model.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Entity
@Table(name = "media_storage")
public class MediaStorage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

    @Column(name = "name", nullable = false, length = 100, unique = true)
    private String name;

    @Column(name = "mount_path", nullable = false, length = 255, unique = true)
    private String mountPath;

    @Column(name = "capacity_bytes")
    private Long capacityBytes;

    @Column(name = "storage_type", length = 50)
    private String storageType;

    @Column(name = "status", nullable = false, length = 50)
    private String status = "ONLINE";

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;
}
