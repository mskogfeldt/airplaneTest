package se.mskogfeldt.test.dao;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import se.mskogfeldt.dao.AirLineDao;
import se.mskogfeldt.dao.AirplaneDao;
import se.mskogfeldt.dao.CustomerDao;
import se.mskogfeldt.dao.TripDao;
import se.mskogfeldt.dao.impl.TripDaoImpl;
import se.mskogfeldt.domain.AirLine;
import se.mskogfeldt.domain.Trip;
import se.mskogfeldt.entity.*;
import se.mskogfeldt.service.TripService;
import se.mskogfeldt.service.impl.TripServiceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class DaoTripTest {

    @Test
    public void createTripTest() {

        ApplicationContext applicationContext = new GenericXmlApplicationContext("dao-impl.xml","service-impl.xml");
        TripDao tripDao = applicationContext.getBean("tripDao", TripDao.class);
       TripService tripService = applicationContext.getBean(  TripService.class);
       // TripService tripService = new TripServiceImpl(tripDao);
        CustomerDao customerDao = applicationContext.getBean("customerDao", CustomerDao.class);
        AirLineDao airLineDao = applicationContext.getBean(AirLineDao.class);
        List<BusinessClassSeatEntity> businessClassSeatEntities = new ArrayList<>();
        List<EconomyClassSeatEntity> economyClassSeatEntities = new ArrayList<>();

        BusinessClassSeatEntity businessClassSeatEntity1 = BusinessClassSeatEntity.builder()
                .withSeatNumber(1).build();

        EconomyClassSeatEntity economyClassSeatEntity1 = EconomyClassSeatEntity.builder()
                .withSeatNumber(1).build();

        businessClassSeatEntities.add(businessClassSeatEntity1);
        economyClassSeatEntities.add(economyClassSeatEntity1);

        List<FoodEntity> bMenuEntity = new ArrayList<>();
        List<FoodEntity> eMenuEntity = new ArrayList<>();

        FoodEntity eal = FoodEntity.builder().withName("Eal")
                .withCost(100).build();

        FoodEntity banana = FoodEntity.builder().withName("Banana")
                .withCost(200).build();

        bMenuEntity.add(banana);
        eMenuEntity.add(eal);

        AirplaneEntity airplaneEntity = AirplaneEntity.builder().withId("12345")
                .withBusinessClassSeatEntitys(businessClassSeatEntities)
                .withEconomyClassSeatEntitys(economyClassSeatEntities).build();

        List<AirplaneEntity> fleat1 = new ArrayList<>();
        fleat1.add(airplaneEntity);

        AirLineEntity airLineEntity = AirLineEntity.builder()
                .withName("Airair")
                .withTreasury(50000)
                .withFleat(fleat1).build();

        TripEntity tripEntity = TripEntity.builder()
                .withId("1234")
                .withAirLineEntity(airLineEntity)
                .withAirplaneEntity(airplaneEntity)
                .withBusinessClassMenuEntity(bMenuEntity)
                .withEconomyClassMenuEntity(eMenuEntity)
                .withAvaibleBusinessClassSeatEntitys(airplaneEntity.getBusinessClassSeatEntitys())
                .withBookedBusinessClassSeatEntitys(new HashMap<Integer, CustomerEntity>())
                .withAvalibleEconomiClassSeatEntitys(airplaneEntity.getEconomyClassSeatEntitys())
                .withBookedEconomiClassSeatEntitys(new HashMap<Integer, CustomerEntity>())
                .withCostForBuisnessClassSeat(20000)
                .withCostForEconomyClassSeat(5000)
                .build();

        TripEntity tripEntity2 = TripEntity.builder()
                .withId("12345")
                .withAirLineEntity(airLineEntity)
                .withAirplaneEntity(airplaneEntity)
                .withBusinessClassMenuEntity(bMenuEntity)
                .withEconomyClassMenuEntity(eMenuEntity)
                .withAvaibleBusinessClassSeatEntitys(airplaneEntity.getBusinessClassSeatEntitys())
                .withBookedBusinessClassSeatEntitys(new HashMap<Integer, CustomerEntity>())
                .withAvalibleEconomiClassSeatEntitys(airplaneEntity.getEconomyClassSeatEntitys())
                .withBookedEconomiClassSeatEntitys(new HashMap<Integer, CustomerEntity>())
                .withCostForBuisnessClassSeat(20000)
                .withCostForEconomyClassSeat(5000)
                .build();

        tripDao.createTrip(tripEntity);
        tripDao.createTrip(tripEntity2);

        Optional<TripEntity> optional = tripService.readTripEntity("1234");
        Optional<TripEntity> optional2 = tripDao.readTripEntity("12345");
        System.out.println(optional);
        System.out.println(optional2);

        Assert.assertEquals(optional, tripDao.readTripEntity(tripEntity.getId()));
        Assert.assertEquals(optional2, tripDao.readTripEntity(tripEntity2.getId()));

    }

}




