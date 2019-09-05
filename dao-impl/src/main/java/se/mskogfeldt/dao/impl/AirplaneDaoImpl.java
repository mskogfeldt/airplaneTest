package se.mskogfeldt.dao.impl;

import se.mskogfeldt.dao.AirplaneDao;

import java.util.Objects;

public class AirplaneDaoImpl implements AirplaneDao {

    private final AirplaneDao airplaneDao;

    public AirplaneDaoImpl(AirplaneDao airplaneDao) {
        this.airplaneDao = Objects.requireNonNull(airplaneDao, "airplaneDao cannot be null");
    }

}


