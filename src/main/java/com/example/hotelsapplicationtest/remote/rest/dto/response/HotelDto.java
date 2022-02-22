package com.example.hotelsapplicationtest.remote.rest.dto.response;

import java.util.List;

public class HotelDto {
    private Integer id;
    private String name;
    private List<HotelRoomDto> rooms;

    public HotelDto() {
    }

    public HotelDto(Integer id, String name, List<HotelRoomDto> rooms) {
        this.id = id;
        this.name = name;
        this.rooms = rooms;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<HotelRoomDto> getRooms() {
        return rooms;
    }

    public void setRooms(List<HotelRoomDto> rooms) {
        this.rooms = rooms;
    }
}
