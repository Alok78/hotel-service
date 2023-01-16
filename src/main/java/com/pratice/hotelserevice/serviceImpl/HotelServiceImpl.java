package com.pratice.hotelserevice.serviceImpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pratice.hotelserevice.Exception.ResourceNotFoundException;
import com.pratice.hotelserevice.entity.Hotel;
import com.pratice.hotelserevice.repository.HotelRepository;
import com.pratice.hotelserevice.service.HotelService;

@Service
public class HotelServiceImpl implements HotelService
{
	@Autowired
	private HotelRepository hotelRepository;

	@Override
	public Hotel createHotel(Hotel hotel) {
		
		String id = UUID.randomUUID().toString();
		hotel.setId(id);
		
		return hotelRepository.save(hotel);
	}

	@Override
	public List<Hotel> getAllHotel() 
	{
		return hotelRepository.findAll();
	}

	@Override
	public Hotel getHotelById(String id) {
		return hotelRepository.findById(id).orElseThrow(() -> 
		new ResourceNotFoundException("Hotel is not found with given id :- "+id));
	}

}
