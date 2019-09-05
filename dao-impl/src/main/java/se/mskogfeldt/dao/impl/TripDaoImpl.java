package se.mskogfeldt.dao.impl;

import se.mskogfeldt.dao.TripDao;

import java.util.Objects;

public class TripDaoImpl implements TripDao {

    private final TripDao tripDao;

    public TripDaoImpl(TripDao tripDao){
        this.tripDao = Objects.requireNonNull(tripDao, "tripDao cannot be null");
    }

}
