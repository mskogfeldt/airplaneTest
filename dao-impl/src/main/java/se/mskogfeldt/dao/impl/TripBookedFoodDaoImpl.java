package se.mskogfeldt.dao.impl;

import se.mskogfeldt.entity.FoodEntity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class TripBookedFoodDaoImpl {


        Map<String, Map<String, List<FoodEntity>>> bookedFoods = new HashMap<>();

    public void createNewFoodsForTrip(String tripId, Map<String, List<FoodEntity>> foodEntities){
        if (bookedFoods.containsKey(tripId)) {
            throw new RuntimeException("Trip already exists");
        }
        bookedFoods.put(tripId, foodEntities);
    }

    public Optional<Map<String, List<FoodEntity>>> read(String id) {
        return Optional.ofNullable(bookedFoods.get(id));
    }


    public void delete (String tripId){
        if (bookedFoods.containsKey(tripId)){
            throw  new RuntimeException("Cannot find Trip with this ID");
        }
        bookedFoods.remove(tripId);
    }

}
