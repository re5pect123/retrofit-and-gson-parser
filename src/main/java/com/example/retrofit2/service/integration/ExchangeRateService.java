package com.example.retrofit2.service.integration;

import com.example.retrofit2.dto.ExchangeRate;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public interface ExchangeRateService {

    ExchangeRate getExchangeCourseForDate(String date, String from, String to, String symbols) throws IOException;
}
