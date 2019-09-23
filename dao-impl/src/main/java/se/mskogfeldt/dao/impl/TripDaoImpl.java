package se.mskogfeldt.dao.impl;

import se.mskogfeldt.dao.TripDao;
import se.mskogfeldt.entity.TripEntity;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TripDaoImpl implements TripDao {

   // private final TripDao tripDao;
    Map<String, TripEntity> trips = new HashMap<>();

   /* public TripDaoImpl(TripDao tripDao){
        this.tripDao = Objects.requireNonNull(tripDao, "tripDao cannot be null");
    }*/

}
