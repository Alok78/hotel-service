package com.pratice.hotelserevice.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Document(value = "hotels")
@Data
@Builder
public class Hotel
{
	@Id
	private String id;
	private String name;
	private String location;
	private String about;
}
