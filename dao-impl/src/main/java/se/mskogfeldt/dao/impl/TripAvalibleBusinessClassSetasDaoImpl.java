package se.mskogfeldt.dao.impl;

import se.mskogfeldt.entity.BusinessClassSeatEntity;
import se.mskogfeldt.entity.EconomyClassSeatEntity;
import se.mskogfeldt.entity.TripEntity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class TripAvalibleBusinessClassSetasDaoImpl {

    Map<String, List<BusinessClassSeatEntity>> freeBusinessSeats = new HashMap<>();

    public void createNewBusinessClassSeatsForTrip(String tripId, List<BusinessClassSeatEntity> businessClassSeatEntitiesClassSeatEntities){
        if (freeBusinessSeats.containsKey(tripId)) {
            throw new RuntimeException("Trip already exists");
        }
        freeBusinessSeats.put(tripId, businessClassSeatEntitiesClassSeatEntities);
    }

    public Optional<List<BusinessClassSeatEntity>> read(String id) {
        return Optional.ofNullable(freeBusinessSeats.get(id));
    }


    public void delete (String tripId){
        if (freeBusinessSeats.containsKey(tripId)){
            throw  new RuntimeException("Cannot find Trip with this ID");
        }
        freeBusinessSeats.remove(tripId);
    }



}



