package com.weather.controller.service;

import com.weather.Config;
import com.weather.exception.IncorrectHttpClientException;
import com.weather.exception.MissingApiKeyException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith({MockitoExtension.class})
class RequestWeatherServiceTest {

    @Mock
    private Config config;
    @Mock
    private HttpClient client;
    @Mock
    private HttpResponse<Object> httpResponse;

    private RequestService requestService;

    @BeforeEach
    void setup() throws IOException{
        requestService = new RequestWeatherService(config, client);
        when(config.getApiKey()).thenReturn("RandomKey");
    }

    @Test
    void whenApiKeyIsNullShouldThrowException() throws IOException {

        when(config.getApiKey()).thenReturn(null);

        assertThrows(MissingApiKeyException.class, () -> requestService.sendRequestToWeatherAPI(""));
    }

    @Test
    void whenConfigThrowsIOExceptionShouldThrowException() throws IOException {
        //when
        when(config.getApiKey()).thenThrow(IOException.class);

        //then
        assertThrows(MissingApiKeyException.class, () -> requestService.sendRequestToWeatherAPI(""));
    }

    @Test
    void shouldReturnNotNullResult() throws IOException, InterruptedException {
        when(client.send(any(), any())).thenReturn(httpResponse);
        when(httpResponse.body()).thenReturn("{}");

        var result = requestService.sendRequestToWeatherAPI("Berlin");
        assertNotNull(result);
    }

    @Test
    void whenClientIsIncorrectShouldThrowException() throws IOException, InterruptedException {

        when(client.send(any(), any())).thenThrow(IncorrectHttpClientException.class);
        assertThrows(IncorrectHttpClientException.class, () -> requestService.sendRequestToWeatherAPI(""));
    }



}