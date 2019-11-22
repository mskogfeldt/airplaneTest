package se.mskogfeldt.dao.impl;

import se.mskogfeldt.entity.EconomyClassSeatEntity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class TripBookedEconomyClassSeatsDaoImpl {


    Map<String, Map<String, List<EconomyClassSeatEntity>>> bookedEconomySeats = new HashMap<>();

    public void createNewBusinessClassSeatsForTrip(String tripId, Map<String, List<EconomyClassSeatEntity>> economyClassSeatEntitiesClassSeatEntities){
        if (bookedEconomySeats.containsKey(tripId)) {
            throw new RuntimeException("Trip already exists");
        }
        bookedEconomySeats.put(tripId, economyClassSeatEntitiesClassSeatEntities);
    }

    public Optional<Map<String, List<EconomyClassSeatEntity>>> read(String id) {
        return Optional.ofNullable(bookedEconomySeats.get(id));
    }


    public void delete (String tripId){
        if (bookedEconomySeats.containsKey(tripId)){
            throw  new RuntimeException("Cannot find Trip with this ID");
        }
        bookedEconomySeats.remove(tripId);
    }

}
