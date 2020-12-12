package com.kodilla.good.patterns.challenges;
import com.kodilla.good.patterns.challenges.FlightConnectionService.FlightSearchEngine;
import com.kodilla.good.patterns.challenges.MovieStore.MovieStore;
import com.kodilla.good.patterns.challenges.ProductOrderService.ProductOrderService;

public class challengesMain {
    public static void main(String[] args) {
        Module13Problem1("!");
        Module13Problem2();

        Module13Problem4("GDN", "KRK");
    }

    public static void Module13Problem1(String delimiter){
        MovieStore movieStore = new MovieStore();
        System.out.println("Problem 13.1 \"Functional titles iteration\"");
        movieStore.joinTitles(delimiter);
        System.out.println("");
    }

    private static void Module13Problem2() {
        System.out.println("Problem 13.2 \"Product ordering service\"");
        ProductOrderService productOrderService = new ProductOrderService();
        productOrderService.manageOrder();
        System.out.println("");
    }

    private static void Module13Problem4(String departureAirport, String arrivalAirport) {
        System.out.println("Problem 13.3 \"FlightsSearchEngine\"");
        FlightSearchEngine flightSearchEngine = new FlightSearchEngine();
        flightSearchEngine.flightsFromChosenAirport(departureAirport);
        flightSearchEngine.flightsToChosenAirport(arrivalAirport);
        flightSearchEngine.connectingFlights(departureAirport, arrivalAirport);
    }
}
