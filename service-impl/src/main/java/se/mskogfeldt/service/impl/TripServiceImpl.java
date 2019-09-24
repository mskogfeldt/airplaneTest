package se.mskogfeldt.service.impl;

import se.mskogfeldt.domain.BusinessClassSeat;
import se.mskogfeldt.domain.Customer;
import se.mskogfeldt.domain.Food;
import se.mskogfeldt.domain.Trip;
import se.mskogfeldt.entity.BusinessClassSeatEntity;
import se.mskogfeldt.entity.EconomyClassSeatEntity;
import se.mskogfeldt.entity.TripEntity;
import se.mskogfeldt.service.TripService;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class TripServiceImpl implements TripService {



    public void addCustomerToMapOfFood(Trip trip, Customer customer, List<Food> food) {
        trip.getBookedFood().put(customer, food);
    }

    public List<Food> addFoodToList(Food food, List<Food> list){
        list.add(food);
        return list;
    }

    public List<Food>removeFoodFromList(Food food, List<Food> list){
        list.add(food);
        return list;
    }

    public BusinessClassSeat removeABusinessSeatFromList(BusinessClassSeat seat){

    }
/*
    public void bookEconomySeat(Customer customer, BusinessClassSeat businessClassSeat, Trip trip){
        tripDao.pu

    }
    
 */

    public Collection<BusinessClassSeatEntity> readAllAvalibleBusinessClassSeats(TripEntity tripEntity) {
        List<BusinessClassSeatEntity> returnCollection = tripEntity.getAvalibleBusinessClassSeatEntitys();
        return returnCollection;
    }

    public Collection<EconomyClassSeatEntity> readAllAvalibleEconomyClassSeats(TripEntity tripEntity) {
        List<EconomyClassSeatEntity> returnCollection = tripEntity.getAvalibleEconomyClassSeatEntitys();
        return returnCollection;
    }

/*
public Collection<BusinessClassSeatEntity> readAllAvalibleBusinessClassSeats() {
        return avalibleBusinessClassSeats.values().stream().collect(Collectors.toSet());
    }

    public Collection<AirLineEntity> readAll() {
        return airLines.values().stream().collect(Collectors.toSet());
    }

@Test
    public void readAllFromAirLineDao(){
        AirLineDao airLineDao = new AirLineDaoImpl();
        airLineDao.create(AirLineEntity.builder().withTreasury(50000).withName("Airair").build());
        airLineDao.create(AirLineEntity.builder().withTreasury(50000).withName("Airair2").build());
        Assert.assertEquals(2, airLineDao.readAll().size());
        Collection<AirLineEntity> airLines=airLineDao.readAll();
        System.out.println(airLines);
    }
    public List<Food> editFoodToCustomersOrder(List<Food> food){
        List<Food> newFood =

    }

 */

    public void bookFlight(Trip trip, Customer customer) {

    }

    public void removeCustomerFromBookedFood(Trip trip, Customer customer){
        trip.getBookedFood().remove(customer);
    }

    public void removeCustomerFromEconomyClassSeats(Trip trip, Customer customer){
        trip.getBookedEconomyClassSeats().remove(customer);
    }

    public void removeCustomerFromBusinessClassSeats(Trip trip, Customer customer){
        trip.getBookedBusinessClassSeats().remove(customer);
    }

    @Override
    public void createTrip(Trip trip) {

    }
}
