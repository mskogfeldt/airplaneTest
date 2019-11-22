package se.mskogfeldt.dao.impl;

import se.mskogfeldt.entity.BusinessClassSeatEntity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class TripBookedBusinessClassSeatsDaoImpl {


    Map<String, Map<String, List<BusinessClassSeatEntity>>> bookedBusinessSeats = new HashMap<>();

    public void createNewBusinessClassSeatsForTrip(String tripId, Map<String, List<BusinessClassSeatEntity>> businessClassSeatEntitiesClassSeatEntities){
        if (bookedBusinessSeats.containsKey(tripId)) {
            throw new RuntimeException("Trip already exists");
        }
        bookedBusinessSeats.put(tripId, businessClassSeatEntitiesClassSeatEntities);
    }

    public Optional<Map<String, List<BusinessClassSeatEntity>>> read(String id) {
        return Optional.ofNullable(bookedBusinessSeats.get(id));
    }


    public void delete (String tripId){
        if (bookedBusinessSeats.containsKey(tripId)){
            throw  new RuntimeException("Cannot find Trip with this ID");
        }
        bookedBusinessSeats.remove(tripId);
    }

}
