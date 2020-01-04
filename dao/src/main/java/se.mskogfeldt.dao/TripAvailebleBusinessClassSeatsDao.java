package se.mskogfeldt.dao;

import se.mskogfeldt.entity.BusinessClassSeatEntity;

import java.util.List;
import java.util.Optional;

public interface TripAvailebleBusinessClassSeatsDao {

    void create(String id, List<BusinessClassSeatEntity> businessClassSeatEntities);

    Optional<List<BusinessClassSeatEntity>> read(String id);

    void delete(String id);

    void update(String id, List<BusinessClassSeatEntity> businessClassSeatEntities);

}
