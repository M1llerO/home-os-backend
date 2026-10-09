package home.os.backend.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "media_files")
public class MediaFile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "storage_id", nullable = false)
    private MediaStorage storage;

    @Column(name = "filename", nullable = false, length = 255)
    private String filename;

    @Column(name = "filepath", nullable = false, length = 1000)
    private String filepath;

    @Column(name = "file_type", nullable = false, length = 50)
    private String fileType;

    @Column(name = "file_size")
    private Long fileSize;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    protected MediaFile() {
    }

    public MediaFile(MediaStorage storage, String filename, String filepath, String fileType) {
        this.storage = storage;
        this.filename = filename;
        this.filepath = filepath;
        this.fileType = fileType;
    }

    public MediaFile(MediaStorage storage, String filename, String filepath, String fileType, Long fileSize) {
        this.storage = storage;
        this.filename = filename;
        this.filepath = filepath;
        this.fileType = fileType;
        this.fileSize = fileSize;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MediaStorage getStorage() {
        return storage;
    }

    public void setStorage(MediaStorage storage) {
        this.storage = storage;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
