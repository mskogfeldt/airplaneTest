package se.mskogfeldt.dao.impl;

import se.mskogfeldt.dao.AirLineDao;
import se.mskogfeldt.entity.AirLineEntity;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class AirLineDaoImpl implements AirLineDao {

   // private final AirLineDao airLineDao;
    private Map<String,AirLineEntity> airLines = new HashMap<>();
/*
    public AirLineDaoImpl(AirLineEntity airLineEntity){
        this.airLineDao = Objects.requireNonNull(airLineDao, "airLineDao cannot be null");
    }

 */



    public void create(AirLineEntity airLineEntity){
        airLines.put(airLineEntity.getName(),airLineEntity);
    }

    public Collection<AirLineEntity> read(String name){
        return airLines.values().stream().filter(airLineEntity->airLineEntity.getName().equalsIgnoreCase(name)).collect(Collectors.toSet());

    }

    public Collection<AirLineEntity> readAll(){
        return airLines.values().stream().collect(Collectors.toSet());
    }

    public void delete(String name){
        airLines.remove(name);


    }

    public void updateTreasury(String name){

    }

    public void updateName(String name) {

    }



}
