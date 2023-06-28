package com.star_airlines.service;
import com.star_airlines.pojo.Flights;
import com.star_airlines.pojo.Hotel;
import com.star_airlines.pojo.Record;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public interface SearchService {
    List<Flights> searchFlight(String depart, String arrival, LocalDate date, Integer type);

    Flights getFlight(Integer id);

    List<Hotel> searchHotel(String arrival);

    Hotel getHotel(Integer id);

    Record searchRecord(Integer flightId, Integer userId);


    Integer getFlightPrice(Integer id);

    Record getRecord(String id);

    Integer getHotelPrice(Integer hotelId);


    List<String> searchDepart();

    List<String> searchArrival();

    List<Map<String,String>> searchAllHotel();
}
