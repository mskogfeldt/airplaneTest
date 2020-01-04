package se.mskogfeldt.dao.impl;

import se.mskogfeldt.dao.TripBookedBusinessClassSeatsDao;
import se.mskogfeldt.entity.BusinessClassSeatEntity;
import se.mskogfeldt.entity.EconomyClassSeatEntity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class TripBookedBusinessClassSeatsDaoImpl implements TripBookedBusinessClassSeatsDao {


    Map<String, Map<String, List<BusinessClassSeatEntity>>> bookedBusinessSeats = new HashMap<>();

    public void create(String id, Map<String, List<BusinessClassSeatEntity>> businessClassSeatEntities){
        if (bookedBusinessSeats.containsKey(id)) {
            throw new RuntimeException("Trip already exists");
        }
        bookedBusinessSeats.put(id, businessClassSeatEntities);
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

    public void update(String id, Map<String, List<BusinessClassSeatEntity>>  businessClassSeatEntities) {
        delete(id);
        create(id, businessClassSeatEntities);
    }


}
