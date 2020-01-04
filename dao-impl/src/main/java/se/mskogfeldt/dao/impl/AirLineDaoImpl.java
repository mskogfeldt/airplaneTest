package se.mskogfeldt.dao.impl;

import se.mskogfeldt.dao.AirLineDao;
import se.mskogfeldt.entity.AirLineEntity;
import se.mskogfeldt.entity.AirplaneEntity;

import java.util.*;
import java.util.stream.Collectors;


public class AirLineDaoImpl implements AirLineDao {

   // private final AirLineDao airLineDao;

    private Map<String, List<AirplaneEntity>> airLines = new HashMap<>();




   /* public AirLineDaoImpl(AirLineDao airLineDao){
        this.airLineDao = Objects.requireNonNull(airLineDao, "airLineDao cannot be null");
    }
*/


 public void create(String name, List<AirplaneEntity> airplaneEntitys){
        if (airLines.containsKey(name)) {
            throw new RuntimeException("Airline already exists");
        }
        airLines.put(name, airplaneEntitys);
    }



    //public Collection<AirLineEntity> read(String name) {
    public Optional<List<AirplaneEntity>> read(String name) {
       // return airLines.values().stream().filter(airLineEntity -> airLineEntity.getName().equalsIgnoreCase(name)).collect(Collectors.toSet());
        return Optional.ofNullable(airLines.get(name));
    }

    /*public Collection<AirLineEntity> readAll() {
        return airLines.values().stream().collect(Collectors.toSet());
    }

     */

    public void delete(String name) {
        airLines.remove(name);
    }


    public void update(String name, List<AirplaneEntity> airLineEntity) {
        delete(name);
        create(name, airLineEntity);
    }


}
