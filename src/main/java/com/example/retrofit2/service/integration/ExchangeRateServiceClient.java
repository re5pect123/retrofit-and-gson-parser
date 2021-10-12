package com.example.retrofit2.service.integration;

import com.example.retrofit2.dto.ExchangeRate;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ExchangeRateServiceClient {

    @GET("/{date}")
    Call<ExchangeRate> getExchangeCourseForDate(@Path ("date") String date, @Query("from") String from, @Query("to") String to, @Query("symbols") String symbols);

}
