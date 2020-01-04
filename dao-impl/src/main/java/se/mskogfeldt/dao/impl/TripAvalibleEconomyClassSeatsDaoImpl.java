package se.mskogfeldt.dao.impl;

import se.mskogfeldt.dao.TripAvalibleEconomyClassSetasDao;
import se.mskogfeldt.entity.BusinessClassSeatEntity;
import se.mskogfeldt.entity.EconomyClassSeatEntity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class TripAvalibleEconomyClassSeatsDaoImpl implements TripAvalibleEconomyClassSetasDao {



    Map<String, List<EconomyClassSeatEntity>> freeEconomySeats = new HashMap<>();

    public void create(String tripId, List<EconomyClassSeatEntity> economyClassSeatEntitiesClassSeatEntities){
        if (freeEconomySeats.containsKey(tripId)) {
            throw new RuntimeException("Trip already exists");
        }
        freeEconomySeats.put(tripId, economyClassSeatEntitiesClassSeatEntities);
    }

    public Optional<List<EconomyClassSeatEntity>> read(String id) {
        return Optional.ofNullable(freeEconomySeats.get(id));
    }

    public void delete (String tripId){
        if (freeEconomySeats.containsKey(tripId)){
            throw  new RuntimeException("Cannot find Trip with this ID");
        }
        freeEconomySeats.remove(tripId);
    }

    public void update(String id, List<EconomyClassSeatEntity> economyClassSeatEntities) {
        delete(id);
        create(id, economyClassSeatEntities);
    }


}
