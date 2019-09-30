package se.mskogfeldt.dao;

import se.mskogfeldt.entity.TripEntity;

import java.util.Optional;

public interface TripDao {

    void createTrip(TripEntity tripEntity);

    Optional<TripEntity> readTripEntity(String id);
}
