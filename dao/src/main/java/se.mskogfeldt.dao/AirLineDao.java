package se.mskogfeldt.dao;

import se.mskogfeldt.entity.AirLineEntity;

import java.util.Collection;

public interface AirLineDao {
    void create(AirLineEntity airLineEntity);

    Collection<AirLineEntity> read(final String name);

    void delete(String name);

    void updateTreasury(String name);

    void updateName(String name);
}
