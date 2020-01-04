package se.mskogfeldt.dao.impl;

import se.mskogfeldt.dao.AirplaneDao;
import se.mskogfeldt.dao.TripDao;
import se.mskogfeldt.entity.*;

import java.util.*;

public class TripDaoImpl implements TripDao {

    // private final TripDao tripDao;
    Map<String, TripEntity> comingTrips = new HashMap<>();


    public void create(TripEntity tripEntity){
        if (comingTrips.containsKey(tripEntity.getId())) {
            throw new RuntimeException("Trip already exists");
        }
        comingTrips.put(tripEntity.getId(), tripEntity);
    }

    public TripEntity read(String id) {
        return comingTrips.get(id);
    }

    public void delete (String id){
        if (comingTrips.containsKey(id)){
            throw  new RuntimeException("Cannot find Trip with this ID");
        }
        comingTrips.remove(id);
    }

    public void update(TripEntity tripEntity) {
        delete(tripEntity.getId());
        create(tripEntity);
    }


}
