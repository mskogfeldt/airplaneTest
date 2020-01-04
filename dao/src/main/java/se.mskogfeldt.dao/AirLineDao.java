package se.mskogfeldt.dao;

import se.mskogfeldt.entity.AirLineEntity;
import se.mskogfeldt.entity.AirplaneEntity;
import se.mskogfeldt.entity.BusinessClassSeatEntity;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface AirLineDao {

    void create(String name, List<AirplaneEntity> airplaneEntities);

    Optional<List<AirplaneEntity>> read(String name);

    //Collection<AirLineEntity> read(final String name);
   // Collection<AirLineEntity> readAll();

    void delete(String name);

    void update(String name, List<AirplaneEntity> airplaneEntities);


}
