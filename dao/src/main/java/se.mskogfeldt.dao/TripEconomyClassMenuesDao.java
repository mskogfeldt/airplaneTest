package se.mskogfeldt.dao;

import se.mskogfeldt.entity.FoodEntity;

import java.util.List;
import java.util.Optional;

public interface TripEconomyClassMenuesDao {

    void create(String tripId, List<FoodEntity> economyClassSeatMenues);

    Optional<List<FoodEntity>> read(String id);

    void delete(String tripId);
}
