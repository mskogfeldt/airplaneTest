package se.mskogfeldt.test.Service;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import se.mskogfeldt.dao.AirLineDao;
import se.mskogfeldt.domain.AirLine;
import se.mskogfeldt.domain.Airplane;
import se.mskogfeldt.domain.BusinessClassSeat;
import se.mskogfeldt.domain.EconomyClassSeat;
import se.mskogfeldt.service.AirLineService;

import java.util.ArrayList;
import java.util.List;

public class ServiceTest {

    @Test
    public void testCreateAirLineFromService(){
        ApplicationContext applicationContext = new GenericXmlApplicationContext("dao-impl.xml", "service.xml");
        AirLineDao airLineDao = applicationContext.getBean(AirLineDao.class);
        AirLineService airLineService = applicationContext.getBean(AirLineService.class);

            List<BusinessClassSeat> businessClassSeats = new ArrayList<>();
            List<EconomyClassSeat> economyClassSeats = new ArrayList<>();

            BusinessClassSeat businessClassSeat1 = BusinessClassSeat.builder()
                    .withSeatNumber(1).build();
            EconomyClassSeat economyClassSeat1 = EconomyClassSeat.builder()
                    .withSeatNumber(1).build();
            businessClassSeats.add(businessClassSeat1);
            economyClassSeats.add(economyClassSeat1);

            Airplane airplane =Airplane.builder().withId("12345")
                    .withBusinissClassSeats(businessClassSeats)
                    .withEconomyClassSeats(economyClassSeats).build();

            List<Airplane> fleat1 = new ArrayList<>();
            fleat1.add(airplane);

            AirLine airLine = AirLine.builder().withName("Airair")
                    .withTreasury(50000)
                    .withFleat(fleat1).build();

            airLineService.createAirLine(airLine);


            Assert.assertEquals(1, airLineDao.readAll().size());

        }


    }
 /*

        ApplicationContext applicationContext = new GenericXmlApplicationContext("dao-impl.xml");
       // AirLineDao airLineDao = new AirLineDaoImpl();
        AirLineDao airLineDao = applicationContext.getBean(AirLineDao.class);
        airLineDao.create(AirLineEntity.builder().withTreasury(50000).withName("Airair").build());
        airLineDao.create(AirLineEntity.builder().withTreasury(50000).withName("Airair2").build());

        Assert.assertEquals(1, airLineDao.read("Airair").size());
        Collection<AirLineEntity> airLines=airLineDao.read("Airair");
        System.out.println(airLines);
    }
 */


