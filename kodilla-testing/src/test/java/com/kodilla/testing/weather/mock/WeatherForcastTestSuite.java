package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.*;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class WeatherForcastTestSuite {
    @Mock
    private Temperatures temperaturesMock;

    @Test
    void testCalculateForecastWithMock() {
        //Given
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();
        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }

    @Test
    void testCalculateAverageTemperatureWithMock() {
        //Given
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Poznan", 23.7);
        temperaturesMap.put("Lodz", 24.5);
        temperaturesMap.put("Krotoszyn", 23.8);
        temperaturesMap.put("Kalisz", 24.1);
        temperaturesMap.put("Wagrowiec", 22.0);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        //When
        double averageTemperature = weatherForecast.calculateAverageTemperature();
        //Then
        Assertions.assertEquals(23.62, averageTemperature);
    }

    @Test
    void testCalculateTemperatureMedianFromOddNumberOfRecordWithMock() {
        //FOR ODD NUMBER OF RECORDS
        //Given
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Gdynia", 18.7);
        temperaturesMap.put("Milicz", 21.9);
        temperaturesMap.put("Baranowo", 20.1);
        temperaturesMap.put("Wenecja", 20.0);
        temperaturesMap.put("Krosnice", 20.5);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        //When
        double median = weatherForecast.calculateMedianTemperature();
        //Then

        Assertions.assertEquals(20.1, median);
    }

    @Test
    void testCalculateTemperatureMedianFromEvenNumberOfRecordWithMock() {
        //FOR EVEN NUMBER OF RECORDS
        //Given
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Gdynia", 18.7);
        temperaturesMap.put("Milicz", 21.9);
        temperaturesMap.put("Baranowo", 20.1);
        temperaturesMap.put("Wenecja", 20.0);
        temperaturesMap.put("Krosnice", 20.5);
        temperaturesMap.put("Swinoujscie", 20.3);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        //When
        double median = weatherForecast.calculateMedianTemperature();
        //Then
        Assertions.assertEquals(20.2, median);
    }
}

