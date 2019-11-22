package se.mskogfeldt.dao.impl;

import se.mskogfeldt.entity.FoodEntity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class TripEconomyClassMenues {

 Map<String, List<FoodEntity>> avalibleEconomyMenues = new HashMap<>();

    public void createNewBusinessClassSeatsForTrip(String tripId, List<FoodEntity> economyClassSeatMenues){
        if (avalibleEconomyMenues.containsKey(tripId)) {
            throw new RuntimeException("Trip already exists");
        }
        avalibleEconomyMenues.put(tripId, economyClassSeatMenues);
    }

    public Optional<List<FoodEntity>> read(String id) {
        return Optional.ofNullable(avalibleEconomyMenues.get(id));
    }


    public void delete (String tripId){
        if (avalibleEconomyMenues.containsKey(tripId)){
            throw  new RuntimeException("Cannot find Trip with this ID");
        }
        avalibleEconomyMenues.remove(tripId);
    }


}
