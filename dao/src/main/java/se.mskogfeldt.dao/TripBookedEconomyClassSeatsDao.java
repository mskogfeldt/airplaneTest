package se.mskogfeldt.dao;

import se.mskogfeldt.entity.BusinessClassSeatEntity;
import se.mskogfeldt.entity.EconomyClassSeatEntity;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface TripBookedEconomyClassSeatsDao {
    void create(String id, Map<String, List<EconomyClassSeatEntity>> economyClassSeatEnteties);

    Optional<Map<String, List<EconomyClassSeatEntity>>> read(String id);

    void delete(String id);

    void update(String id, Map<String, List<EconomyClassSeatEntity>>  economyClassSeatEnteties);
}
