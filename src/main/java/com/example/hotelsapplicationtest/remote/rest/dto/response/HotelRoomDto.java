package com.example.hotelsapplicationtest.remote.rest.dto.response;

public class HotelRoomDto {
    private Integer id;
    private Integer beds;
    private Float price;

    public HotelRoomDto() {
    }

    public HotelRoomDto(Integer id, Integer beds, Float price) {
        this.id = id;
        this.beds = beds;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBeds() {
        return beds;
    }

    public void setBeds(Integer beds) {
        this.beds = beds;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
