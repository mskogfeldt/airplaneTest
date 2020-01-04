package se.mskogfeldt.dao;

import se.mskogfeldt.entity.FoodEntity;

import java.util.List;
import java.util.Optional;

public interface TripBusinessClassMenuesDao {

    void create(String tripId, List<FoodEntity> businessClassSeatMenues);

    Optional<List<FoodEntity>> read(String id);

    void delete(String tripId);
}
