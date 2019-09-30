package se.mskogfeldt.service;

import se.mskogfeldt.domain.Trip;
import se.mskogfeldt.entity.TripEntity;

import java.util.Optional;

public interface TripService  {

    String DEFAULT_BEAN_NAME = "tripService";


    Optional<TripEntity> readTripEntity(String id);



   // void createTrip(Trip trip);
}
