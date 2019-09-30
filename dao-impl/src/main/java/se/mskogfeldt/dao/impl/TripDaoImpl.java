package se.mskogfeldt.dao.impl;

import se.mskogfeldt.dao.TripDao;
import se.mskogfeldt.entity.TripEntity;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class TripDaoImpl implements TripDao {

    // private final TripDao tripDao;
    Map<String, TripEntity> trips = new HashMap<>();

    @Override
    public void createTrip(TripEntity tripEntity) {
        if (trips.containsKey(tripEntity.getId())) {
            throw new RuntimeException("Trip already exists");
        }
        trips.put(tripEntity.getId(), tripEntity);
    }
/*
public void create(Account account) {
        if(accounts.containsKey(account.getId())){
            throw new RuntimeException("Account already exists");
        }
        accounts.put(account.getId(),account);
    }
 */

    /*     public void create(TripEntity tripEntity) {
         trips.put(tripEntity.getName(), airLineEntity);
     }

     public Collection<AirLineEntity> read(String name) {
         return airLines.values().stream().filter(airLineEntity -> airLineEntity.getName().equalsIgnoreCase(name)).collect(Collectors.toSet());
 */
    @Override
    public Optional<TripEntity> readTripEntity(String id) {
        return Optional.ofNullable(trips.get(id));


      /*  Return trips.values().stream().filter(TripEntity -> TripEntity.getId().equalsIgnoreCase(id)).collect(Collectors.toSet());

        //List<FoodEntity> orderdFood = bookedFood.values().stream().filter(customerEntity -> TripEntity.getSsn().equalsIgnoreCase(ssn)).collect(Collectors.toSet());
        */
    }

}



