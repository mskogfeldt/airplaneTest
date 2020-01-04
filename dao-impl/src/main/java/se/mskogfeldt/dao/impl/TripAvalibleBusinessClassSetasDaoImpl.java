package se.mskogfeldt.dao.impl;

import se.mskogfeldt.dao.TripAvailebleBusinessClassSeatsDao;
import se.mskogfeldt.entity.AirLineEntity;
import se.mskogfeldt.entity.BusinessClassSeatEntity;
import se.mskogfeldt.entity.EconomyClassSeatEntity;
import se.mskogfeldt.entity.TripEntity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class TripAvalibleBusinessClassSetasDaoImpl implements TripAvailebleBusinessClassSeatsDao {

    Map<String, List<BusinessClassSeatEntity>> freeBusinessSeats = new HashMap<>();

    public void create(String id, List<BusinessClassSeatEntity> businessClassSeatEntities){
        if (freeBusinessSeats.containsKey(id)) {
            throw new RuntimeException("Trip already exists");
        }
        freeBusinessSeats.put(id, businessClassSeatEntities);
    }

    public Optional<List<BusinessClassSeatEntity>> read(String id) {
        return Optional.ofNullable(freeBusinessSeats.get(id));
    }


    public void delete(String id){
        if (freeBusinessSeats.containsKey(id)){
            throw  new RuntimeException("Cannot find Trip with this ID");
        }
        freeBusinessSeats.remove(id);
    }

     public void update(String id, List<BusinessClassSeatEntity> businessClassSeatEntities) {
        delete(id);
        create(id, businessClassSeatEntities);
    }



}



