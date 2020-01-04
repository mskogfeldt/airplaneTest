package se.mskogfeldt.dao.impl;

import se.mskogfeldt.dao.TripEconomyClassMenuesDao;
import se.mskogfeldt.entity.FoodEntity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class TripEconomyClassMenuesDaoImpl implements TripEconomyClassMenuesDao {

 Map<String, List<FoodEntity>> economyMenues = new HashMap<>();

    public void create(String tripId, List<FoodEntity> economyClassSeatMenues){
        if (economyMenues.containsKey(tripId)) {
            throw new RuntimeException("Trip already exists");
        }
        economyMenues.put(tripId, economyClassSeatMenues);
    }

    public Optional<List<FoodEntity>> read(String id) {
        return Optional.ofNullable(economyMenues.get(id));
    }


    public void delete (String tripId){
        if (economyMenues.containsKey(tripId)){
            throw  new RuntimeException("Cannot find Trip with this ID");
        }
        economyMenues.remove(tripId);
    }


}
