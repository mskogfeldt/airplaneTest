package se.mskogfeldt.dao;

import se.mskogfeldt.entity.EconomyClassSeatEntity;

import java.util.List;
import java.util.Optional;

public interface TripAvalibleEconomyClassSetasDao {


    void create(String id, List<EconomyClassSeatEntity> economyClassSeatEntities);

    Optional<List<EconomyClassSeatEntity>> read(String id);

    void delete(String id);

    void update(String id, List<EconomyClassSeatEntity> economyClassSeatEntities);


}
