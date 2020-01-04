package se.mskogfeldt.dao;

import se.mskogfeldt.entity.BusinessClassSeatEntity;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface TripBookedBusinessClassSeatsDao {

    void create(String id, Map<String, List<BusinessClassSeatEntity>> businessClassSeatEntities);

    Optional<Map<String, List<BusinessClassSeatEntity>>> read(String id);

    void delete(String id);

    void update(String id, Map<String, List<BusinessClassSeatEntity>>  businessClassSeatEntities);

}
