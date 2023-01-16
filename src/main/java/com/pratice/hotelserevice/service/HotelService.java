package com.pratice.hotelserevice.service;

import java.util.List;

import com.pratice.hotelserevice.entity.Hotel;

public interface HotelService 
{
	Hotel createHotel(Hotel hotel);
	List<Hotel> getAllHotel();
	Hotel getHotelById(String id);
}
