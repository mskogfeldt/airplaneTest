package se.mskogfeldt.service;

import se.mskogfeldt.domain.Trip;

public interface TripService  {

    String DEFAULT_BEAN_NAME = "tripService";


    void createTrip(Trip trip);
}
