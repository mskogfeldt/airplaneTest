package se.mskogfeldt.dao;

import se.mskogfeldt.entity.AirplaneEntity;

import java.util.Map;
import java.util.Optional;

public interface AirplaneDao {

    void createNewAirplane(AirplaneEntity airplaneEntity);

    Optional<AirplaneEntity> read(String id);

    void delete (String id);




}
