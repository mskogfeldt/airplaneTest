package se.mskogfeldt.dao.impl;

import se.mskogfeldt.dao.AirLineMoneyDao;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class AirLineMoneyDaoImp implements AirLineMoneyDao {

    private Map<String, Integer> AirLineAccount = new HashMap<>();


    public void create(String name, Integer treasury) {
        AirLineAccount.put(name, treasury);
    }

    //public Collection<AirLineEntity> read(String name) {
    public Optional<Integer> read(String name) {
       // return airLines.values().stream().filter(airLineEntity -> airLineEntity.getName().equalsIgnoreCase(name)).collect(Collectors.toSet());
        return Optional.ofNullable(AirLineAccount.get(name));
    }
/*
    public Collection<AirLineEntity> readAll() {
        return AirLineAccount.values().stream().collect(Collectors.toSet());
    }

 */

    public void delete(String name) {
        AirLineAccount.remove(name);
    }


    public void update(String name, Integer money) {
        delete(name);
        create(name, money);
    }
/*
  <bean id ="airLineDao" class="se.mskogfeldt.dao.impl.AirLineDaoImpl"></bean>

    <bean id ="airplaneDao" class="se.mskogfeldt.dao.impl.AirplaneDaoImpl"></bean>

    <bean id ="customerDao" class="se.mskogfeldt.dao.impl.CustomerDaoImpl"></bean>

    <bean id ="tripAvalibleBusinessClassSeatsDao" class="se.mskogfeldt.dao.impl.TripAvalibleBusinessClassSetasDaoImpl"></bean>

    <bean id ="tripAvalibleEconomyClassSeatsDao" class="se.mskogfeldt.dao.impl.TripAvalibleEconomyClassSeatsDaoImpl"></bean>

    <bean id ="tripBookedBusinessClassSeatsDao" class="se.mskogfeldt.dao.impl.TripBookedBusinessClassSeatsDaoImpl"></bean>

    <bean id ="tripBookedEconomyClassSeatsDao" class="se.mskogfeldt.dao.impl.TripBookedEconomyClassSeatsDaoImpl"></bean>

    <bean id ="tripBookedFoodDao" class="se.mskogfeldt.dao.impl.TripBookedFoodDaoImpl"></bean>

    <bean id ="tripBusinessClassMenuesDao" class="se.mskogfeldt.dao.impl.TripBusinessClassMenuesDaoImpl"></bean>

    <bean id ="tripCostForTripsDao" class="se.mskogfeldt.dao.impl.TripCostForTripsDaoImpl"></bean>

    <bean id ="tripDao" class="se.mskogfeldt.dao.impl.TripDaoImpl"></bean>

    <bean id ="tripEconomyClassMenuesDao" class="se.mskogfeldt.dao.impl.TripEconomyClassMenuesDaoImpl"></bean>

 */
}
