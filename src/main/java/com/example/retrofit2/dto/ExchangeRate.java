package com.example.retrofit2.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.Map;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExchangeRate {

    private Boolean success;
    private String base;
    private String date;
    private Rates rates;

//    JacksonParser - GsonParser
//    Map<String, String> rates;
}
