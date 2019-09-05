package se.mskogfeldt.test.dao;

import org.junit.Test;
import se.mskogfeldt.dao.AirLineDao;
import se.mskogfeldt.dao.impl.AirLineDaoImpl;
import se.mskogfeldt.entity.AirLineEntity;

public class DaoTest {

    @Test
    TestCreateAirlineDao(){
        AirLineDao airLineDao = new AirLineDaoImpl();
        airLineDao.create(AirLineEntity.builder()
                .withName("airair")
                .withTreasury(50000).build());

    }


}
