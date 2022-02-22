package com.example.hotelsapplicationtest.remote.rest.dto.response;

import com.example.hotelsapplicationtest.domain.model.Status;
import com.example.hotelsapplicationtest.remote.rest.dto.request.PersonDto;
import com.example.hotelsapplicationtest.remote.rest.dto.request.RoomReservationDto;

import java.util.List;

public class ReservationDto {
    private Integer id;
    private Status status;
    private List<RoomReservationDto> roomsReservation;
    private PersonDto person;

    public ReservationDto() {
    }

    public ReservationDto(Integer id, Status status, List<RoomReservationDto> roomsReservation, PersonDto person) {
        this.id = id;
        this.status = status;
        this.roomsReservation = roomsReservation;
        this.person = person;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<RoomReservationDto> getRoomsReservation() {
        return roomsReservation;
    }

    public void setRoomsReservation(List<RoomReservationDto> roomsReservation) {
        this.roomsReservation = roomsReservation;
    }

    public PersonDto getPerson() {
        return person;
    }

    public void setPerson(PersonDto person) {
        this.person = person;
    }
}
