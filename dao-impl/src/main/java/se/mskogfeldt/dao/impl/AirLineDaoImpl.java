package se.mskogfeldt.dao.impl;

import se.mskogfeldt.dao.AirLineDao;
import se.mskogfeldt.entity.AirLineEntity;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class AirLineDaoImpl implements AirLineDao {

    private final AirLineDao airLineDao;
    private Map<String,AirLineEntity> airLines = new HashMap<>();

    public AirLineDaoImpl(AirLineDao airLineDao){
        this.airLineDao = Objects.requireNonNull(airLineDao, "airLineDao cannot be null");
    }

    public void create(AirLineEntity airLineEntity){
        airLines.put(airLineEntity.getName(),airLineEntity);
    }

    public AirLineEntity read(String name){

    }

    public void delete(String name){

    }

    public void updateTreasury(String name){

    }

    public void updateName(String name) {

    }



}
