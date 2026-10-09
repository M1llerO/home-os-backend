package home.os.backend.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table (name="devices")

public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false, updatable = false)
    private Long id;

    @Column(name="name", nullable = false, length = 100)
    private String name;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name="device_type_id",nullable = false)
    private Long deviceTypeId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="room_id")
    private Long roomId;

    @Column(name="mqtt_topic", length = 255)
    private String mqttTopic;

    @CreationTimestamp
    @Column(name="created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    protected Device() {
    }

    public Device(String name) {
        this.name = name;
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

    public Long getDeviceTypeId() {
        return deviceTypeId;
    }

    public void setDeviceTypeId(Long deviceTypeId) {
        this.deviceTypeId = deviceTypeId;
    }

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    public String getMqttTopic() {
        return mqttTopic;
    }

    public void setMqttTopic(String mqttTopic) {
        this.mqttTopic = mqttTopic;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
