package home.os.backend.controllers;

import home.os.backend.model.entities.Room;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RoomController {

    @RequestMapping("*/api/rooms")
    public Iterable<Room> getAll() {

        List<Room> list = new ArrayList<Room>();

    }
}
