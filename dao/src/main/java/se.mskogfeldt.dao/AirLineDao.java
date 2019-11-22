package se.mskogfeldt.dao;

import se.mskogfeldt.entity.AirLineEntity;

import java.util.Collection;

public interface AirLineDao {

    void create(AirLineEntity airLineEntity);

    Collection<AirLineEntity> read(final String name);

    Collection<AirLineEntity> readAll();

    void delete(String name);

    void update(String name, AirLineEntity airLineEntity);


}
