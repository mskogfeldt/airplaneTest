package se.mskogfeldt.dao.impl;

import se.mskogfeldt.entity.FoodEntity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class TripBusinessClassMenues {

    Map<String, List<FoodEntity>> avalibleBusinessMenues = new HashMap<>();

    public void createNewBusinessClassSeatsForTrip(String tripId, List<FoodEntity> businessClassSeatMenues){
        if (avalibleBusinessMenues.containsKey(tripId)) {
            throw new RuntimeException("Trip already exists");
        }
        avalibleBusinessMenues.put(tripId, businessClassSeatMenues);
    }

    public Optional<List<FoodEntity>> read(String id) {
        return Optional.ofNullable(avalibleBusinessMenues.get(id));
    }


    public void delete (String tripId){
        if (avalibleBusinessMenues.containsKey(tripId)){
            throw  new RuntimeException("Cannot find Trip with this ID");
        }
        avalibleBusinessMenues.remove(tripId);
    }

}
