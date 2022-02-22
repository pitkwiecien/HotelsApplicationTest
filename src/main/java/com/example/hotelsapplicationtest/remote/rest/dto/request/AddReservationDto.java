package com.example.hotelsapplicationtest.remote.rest.dto.request;

import java.util.List;

public class AddReservationDto {
    private List<RoomReservationDto> roomsReservation;
    private PersonDto person;

    public AddReservationDto() {
    }

    public AddReservationDto(List<RoomReservationDto> roomsReservation, PersonDto person) {
        this.roomsReservation = roomsReservation;
        this.person = person;
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
