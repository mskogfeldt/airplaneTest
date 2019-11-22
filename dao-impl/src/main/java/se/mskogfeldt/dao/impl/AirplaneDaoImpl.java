package se.mskogfeldt.dao.impl;

import se.mskogfeldt.dao.AirplaneDao;
import se.mskogfeldt.entity.AirplaneEntity;

import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class AirplaneDaoImpl implements AirplaneDao {


    Map<String, AirplaneEntity> airplaneEnteties;



 public void createNewAirplane(AirplaneEntity airplaneEntity){
        if (airplaneEnteties.containsKey(airplaneEntity.getId())) {
            throw new RuntimeException("Plane already exists");
        }
     airplaneEnteties.put(airplaneEntity.getId(), airplaneEntity);
    }

    public Optional<AirplaneEntity> read(String id) {
        return Optional.ofNullable(airplaneEnteties.get(id));
    }


    public void delete (String id){
        if (airplaneEnteties.containsKey(id)){
            throw  new RuntimeException("Cannot find Airplane with this ID");
        }
        airplaneEnteties.remove(id);
    }






    //private final AirplaneDao airplaneDao;

    /* public AirplaneDaoImpl(AirplaneDao airplaneDao) {
        this.airplaneDao = Objects.requireNonNull(airplaneDao, "airplaneDao cannot be null");
    }

    */



}


