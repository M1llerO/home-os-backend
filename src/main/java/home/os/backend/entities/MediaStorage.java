package home.os.backend.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

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

    protected MediaStorage() {
    }

    public MediaStorage(String name, String mountPath) {
        this.name = name;
        this.mountPath = mountPath;
    }

    public MediaStorage(String name, String mountPath, Long capacityBytes, String storageType) {
        this.name = name;
        this.mountPath = mountPath;
        this.capacityBytes = capacityBytes;
        this.storageType = storageType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMountPath() {
        return mountPath;
    }

    public void setMountPath(String mountPath) {
        this.mountPath = mountPath;
    }

    public Long getCapacityBytes() {
        return capacityBytes;
    }

    public void setCapacityBytes(Long capacityBytes) {
        this.capacityBytes = capacityBytes;
    }

    public String getStorageType() {
        return storageType;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
