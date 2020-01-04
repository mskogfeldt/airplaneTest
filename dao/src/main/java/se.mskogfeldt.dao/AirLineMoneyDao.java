package se.mskogfeldt.dao;

import se.mskogfeldt.entity.AirplaneEntity;

import java.util.List;
import java.util.Optional;

public interface AirLineMoneyDao {

    void create(String name, Integer treasury);

    Optional<Integer> read(String name);

    //Collection<AirLineEntity> read(final String name);
    // Collection<AirLineEntity> readAll();

    void delete(String name);

    void update(String name, Integer money);
}
