package com.example.retrofit2.service.integration;

import com.example.retrofit2.configuration.RetrofitClientInstance;
import com.example.retrofit2.dto.ExchangeRate;
import org.springframework.stereotype.Component;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;

@Component
public class ExchangeRateServiceImpl implements ExchangeRateService {

    @Override
    public ExchangeRate getExchangeCourseForDate(String date, String from, String to, String symbols) throws IOException {
        Retrofit retrofitInstance = RetrofitClientInstance.getRetrofitInstance();
        ExchangeRateServiceClient exchangeRateServiceClient = retrofitInstance.create(ExchangeRateServiceClient.class);
        Call<ExchangeRate> response = exchangeRateServiceClient.getExchangeCourseForDate(date, from, to, symbols);
        Response<ExchangeRate> execute = response.execute();
        ExchangeRate exchangeRate = execute.body();
        System.out.println(exchangeRate);

        return exchangeRate;
    }
}
