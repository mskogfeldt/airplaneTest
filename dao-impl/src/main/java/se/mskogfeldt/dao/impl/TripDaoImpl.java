package se.mskogfeldt.dao.impl;

import se.mskogfeldt.dao.TripDao;
import se.mskogfeldt.entity.TripEntity;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TripDaoImpl implements TripDao {

   // private final TripDao tripDao;
    Map<String, TripEntity> trips = new HashMap<>();

    public void createTrip(TripEntity tripEntity){
        trips.put(tripEntity.getId(),tripEntity);
    }


   /*     public void create(TripEntity tripEntity) {
        trips.put(tripEntity.getName(), airLineEntity);
    }

    public Collection<AirLineEntity> read(String name) {
        return airLines.values().stream().filter(airLineEntity -> airLineEntity.getName().equalsIgnoreCase(name)).collect(Collectors.toSet());

    }*/

}
