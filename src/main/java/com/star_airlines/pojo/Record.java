package com.star_airlines.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Record {
    private String id;
    private Integer userId;
    private Integer flightId;
    private Integer hotelId;
    private Integer days;
    private Integer carId;
    private Integer price;
    private Integer type;
    private LocalDateTime updateTime;
    private Integer usePoint=0;
}
