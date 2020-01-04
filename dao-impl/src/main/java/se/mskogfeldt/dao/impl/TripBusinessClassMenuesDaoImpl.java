package se.mskogfeldt.dao.impl;

import se.mskogfeldt.dao.TripBusinessClassMenuesDao;
import se.mskogfeldt.entity.FoodEntity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class TripBusinessClassMenuesDaoImpl implements TripBusinessClassMenuesDao {

    Map<String, List<FoodEntity>> businessMenues = new HashMap<>();

    public void create(String tripId, List<FoodEntity> businessClassSeatMenues){
        if (businessMenues.containsKey(tripId)) {
            throw new RuntimeException("Trip already exists");
        }
        businessMenues.put(tripId, businessClassSeatMenues);
    }

    public Optional<List<FoodEntity>> read(String id) {
        return Optional.ofNullable(businessMenues.get(id));
    }


    public void delete (String tripId){
        if (businessMenues.containsKey(tripId)){
            throw  new RuntimeException("Cannot find Trip with this ID");
        }
        businessMenues.remove(tripId);
    }

}
