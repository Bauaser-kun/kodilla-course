package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder  {
    public static void findFlight(Flight flight) throws RouteNotFoundException{
        Map<String, Boolean> flightsMap = new HashMap<>();
        for (int i =1; i<=20; i++) {
            if (i % 2 ==0) {
                flightsMap.put("Airport" + i, true);
            } else {
                flightsMap.put("Airport" + i, false);
            }
        }
        if (flight.getDepartureAirport() == flight.getArrivalAirport()){
            throw  new RouteNotFoundException("Arrival and departure airports are the same.");
        }
            if (!flightsMap.containsKey(flight.getDepartureAirport())) {
                throw new RouteNotFoundException("Departure airport does not exist.");
            }

            if (!flightsMap.containsKey(flight.getArrivalAirport())) {
                throw new RouteNotFoundException("Arrival airport does not exist.");
            }

            if (!flightsMap.get(flight.getDepartureAirport())) {
                throw new RouteNotFoundException("Departure airport not available.");
            }

            if (!flightsMap.get(flight.getArrivalAirport())) {
                throw new RouteNotFoundException("Arrival airport not available.");
            }
    }


    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();

        try {
            flightFinder.findFlight(new Flight("Airport1", "Airport2"));
            System.out.println("The choosen route is available.");
        } catch (RouteNotFoundException e) {
            System.out.println("There is a problem with your flight: " + e.getMessage());
        } finally {
            System.out.println("Thank you for using FlightFinder.");
            System.out.println("");
        }


        try {
            flightFinder.findFlight(new Flight("Airport4", "Airport3"));
            System.out.println("The choosen route is available.");
        } catch (RouteNotFoundException e) {
            System.out.println("There is a problem with your flight: " + e.getMessage());
        } finally {
            System.out.println("Thank you for using FlightFinder.");
            System.out.println("");
        }

        try {
            flightFinder.findFlight(new Flight("Airport5", "Airport5"));
            System.out.println("The choosen route is available.");
        } catch (RouteNotFoundException e) {
            System.out.println("There is a problem with your flight: " + e.getMessage());
        } finally {
            System.out.println("Thank you for using FlightFinder.");
            System.out.println("");
        }

        try {
            flightFinder.findFlight(new Flight("Airport27", "Airport8"));
            System.out.println("The choosen route is available.");
        } catch (RouteNotFoundException e) {
            System.out.println("There is a problem with your flight: " + e.getMessage());
        } finally {
            System.out.println("Thank you for using FlightFinder.");
            System.out.println("");
        }

        try {
            flightFinder.findFlight(new Flight("Airport9", "Airport30"));
            System.out.println("The choosen route is available.");
        } catch (RouteNotFoundException e) {
            System.out.println("There is a problem with your flight: " + e.getMessage());
        } finally {
            System.out.println("Thank you for using FlightFinder.");
            System.out.println("");
        }

        try {
            flightFinder.findFlight(new Flight("Airport10", "Airport12"));
            System.out.println("The choosen route is available.");
        } catch (RouteNotFoundException e) {
            System.out.println("There is a problem with your flight: " + e.getMessage());
        } finally {
            System.out.println("Thank you for using FlightFinder.");
        }
        System.out.println("");
    }
}
