package se.mskogfeldt.dao;

import se.mskogfeldt.entity.TripEntity;

import java.util.Optional;

public interface TripDao {


     void create(TripEntity tripEntity);

     //Optional<TripEntity> read(String id);
     TripEntity read(String id);
     void delete (String id);

     void update(TripEntity tripEntity) ;
}
