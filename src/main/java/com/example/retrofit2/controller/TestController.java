package com.example.retrofit2.controller;

import com.example.retrofit2.dto.ExchangeRate;
import com.example.retrofit2.service.integration.ExchangeRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class TestController {

    @Autowired
    private ExchangeRateService exchangeRateService;

    @GetMapping("test")
    public String test() throws IOException {
        ExchangeRate exchangeCourseForDate = exchangeRateService.getExchangeCourseForDate("2021-09-12", "EUR", "RSD", "RSD");
        System.out.println(exchangeCourseForDate);
        return "test";
    }


}
