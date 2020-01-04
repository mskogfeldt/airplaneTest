package se.mskogfeldt.dao;

import se.mskogfeldt.entity.EconomyClassSeatEntity;
import se.mskogfeldt.entity.FoodEntity;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface TripBookedFoodDao {

    void create(String id, Map<String, List<FoodEntity>> bookedFoods);

    Optional<Map<String, List<FoodEntity>>> read(String id);

    void delete(String id);

    void update(String id, Map<String, List<FoodEntity>>  bookedFoods);
}
