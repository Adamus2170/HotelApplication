package com.example.hotelsapplicationtest.remote.rest.dto.response;

public class OffersDto {
    private List<HotelDto> hotels;

    public OffersDto(){

    }

    public OffersDto(List<HotelDto> hotels) {
        this.hotels = hotels;
    }

    public List<HotelDto> getHotels() {
        return hotels;
    }

    public void setHotels(List<HotelDto> hotels) {
        this.hotels = hotels;
    }
}
