package se.mskogfeldt.dao.impl;

import se.mskogfeldt.dao.TripAvalibleEconomyClassSetasDao;
import se.mskogfeldt.dao.TripBookedEconomyClassSeatsDao;
import se.mskogfeldt.entity.BusinessClassSeatEntity;
import se.mskogfeldt.entity.EconomyClassSeatEntity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class TripBookedEconomyClassSeatsDaoImpl implements TripBookedEconomyClassSeatsDao {


    Map<String, Map<String, List<EconomyClassSeatEntity>>> bookedEconomySeats = new HashMap<>();

    public void create(String tripId, Map<String, List<EconomyClassSeatEntity>> economyClassSeatEntitiesClassSeatEntities){
        if (bookedEconomySeats.containsKey(tripId)) {
            throw new RuntimeException("Trip already exists");
        }
        bookedEconomySeats.put(tripId, economyClassSeatEntitiesClassSeatEntities);
    }

    public Optional<Map<String, List<EconomyClassSeatEntity>>> read(String id) {
        return Optional.ofNullable(bookedEconomySeats.get(id));
    }


    public void delete (String tripId){
        if (bookedEconomySeats.containsKey(tripId)){
            throw  new RuntimeException("Cannot find Trip with this ID");
        }
        bookedEconomySeats.remove(tripId);
    }


    public void update(String id, Map<String, List<EconomyClassSeatEntity>>  economyClassSeatEntities) {
        delete(id);
        create(id, economyClassSeatEntities);
    }

}
