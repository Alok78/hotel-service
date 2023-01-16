package com.pratice.hotelserevice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pratice.hotelserevice.entity.Hotel;

public interface HotelRepository extends MongoRepository<Hotel, String>
{

}
