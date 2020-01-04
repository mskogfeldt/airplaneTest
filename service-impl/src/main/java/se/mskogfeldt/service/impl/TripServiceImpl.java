package se.mskogfeldt.service.impl;

import se.mskogfeldt.dao.TripDao;
import se.mskogfeldt.domain.*;
import se.mskogfeldt.entity.BusinessClassSeatEntity;
import se.mskogfeldt.entity.EconomyClassSeatEntity;
import se.mskogfeldt.entity.FoodEntity;
import se.mskogfeldt.entity.TripEntity;
import se.mskogfeldt.service.TripService;

import java.util.*;
import java.util.stream.Collectors;

public class TripServiceImpl  implements TripService {


    private TripDao tripDao;

    public TripServiceImpl(TripDao tripDao) {
        this.tripDao = Objects.requireNonNull(tripDao, "tripDao cannot be null");
    }

    public List<BusinessClassSeat> presentFreeBusinessSeats(String trip){
        return createBusinessClassSeats(tripDao.read(trip).getAvalibleBusinessClassSeatEntitys());
    }


    public List<EconomyClassSeat> presentFreeEconomySeats(String trip){
        return createEconomyClassSeats(tripDao.read(trip).getAvalibleEconomyClassSeatEntitys());
    }

    public List<Food> presentBusinessMenu(String trip){
        TripEntity tripEntity = tripDao.read(trip);
        return takeFoodEntitysMakeFoods(tripEntity.getBusinessClassMenuEntity());
    }

    public List<Food> presentEconomyMenu(String trip){
        TripEntity tripEntity = tripDao.read(trip);
        return takeFoodEntitysMakeFoods(tripEntity.getEconomyClassMenuEntity());
    }

    public void bookEconomySeat(String ssn, EconomyClassSeat economyClassSeat, String trip){
        TripEntity tripEntity = tripDao.read(trip);
        tripEntity.getBookedEconomyClassSeatEntitys().put(ssn, takeSeatMakeEconomyClassSeatEntity(economyClassSeat));
        tripEntity.getAvalibleEconomyClassSeatEntitys().remove(takeSeatMakeEconomyClassSeatEntity(economyClassSeat));
        tripDao.update(tripEntity);
    }

    public void bookBusinessSeat(String ssn, BusinessClassSeat businessClassSeat, String trip){
        TripEntity tripEntity = tripDao.read(trip);
        tripEntity.getBookedBusinessClassSeatEntitys().put(ssn, takeSeatMakeBusinessClassSeatEntity(businessClassSeat));
        tripEntity.getAvalibleBusinessClassSeatEntitys().remove(takeSeatMakeBusinessClassSeatEntity(businessClassSeat));
        tripDao.update(tripEntity);
    }

    public void bookFood(String ssn, List<Food> foods, String trip){
        TripEntity tripEntity = tripDao.read(trip);
        if (tripEntity.getBookedFoodEntity().containsKey(ssn)){
            tripEntity.getBookedFoodEntity().remove(ssn);
        }
        tripEntity.getBookedFoodEntity().put(ssn, takeFoodMakeFoodEntitys(foods));
    }

    public void cancelBusinessSeat(String trip, String ssn, BusinessClassSeat businessClassSeat){
        TripEntity tripEntity = tripDao.read(trip);
        tripEntity.getBookedBusinessClassSeatEntitys().remove(ssn);
        tripEntity.getAvalibleBusinessClassSeatEntitys().add(takeSeatMakeBusinessClassSeatEntity(businessClassSeat));
        tripDao.update(tripEntity);
    }

    public void cancelEconomySeat(String trip, String ssn, EconomyClassSeat economyClassSeat){
        TripEntity tripEntity = tripDao.read(trip);
        tripEntity.getBookedBusinessClassSeatEntitys().remove(ssn);
        tripEntity.getAvalibleEconomyClassSeatEntitys().add(takeSeatMakeEconomyClassSeatEntity(economyClassSeat));
        tripDao.update(tripEntity);
    }

    public void cancelFoodOrder(String trip, String ssn){
        TripEntity tripEntity = tripDao.read(trip);
        tripEntity.getBookedFoodEntity().remove(ssn);
        tripDao.update(tripEntity);
    }

//n5
    public BusinessClassSeat getBookedBusinessClassSeat(Trip trip, Customer customer){
        TripEntity tripEntity= tripDao.read(trip.getId());
        Map<String, BusinessClassSeatEntity> businessClassSeatEntitys = tripEntity.getBookedBusinessClassSeatEntitys();
        return takeEntityMakeBusinessClassSeat(businessClassSeatEntitys.get(customer.getSsn()));
    }

    //n6
    public EconomyClassSeat getBookedEconomyClassSeat(Trip trip, Customer customer){
        TripEntity tripEntity= tripDao.read(trip.getId());
        Map<String, EconomyClassSeatEntity> economyClassSeatEntityMap = tripEntity.getBookedEconomyClassSeatEntitys();
        return takeEntityMakeEconomyClassSeat(economyClassSeatEntityMap.get(customer.getSsn()));
    }


    public EconomyClassSeat takeEntityMakeEconomyClassSeat(EconomyClassSeatEntity economyClassSeatEntity) {
        EconomyClassSeat economyClassSeat = EconomyClassSeat.builder()
                .withSeatNumber(economyClassSeatEntity.getSeatNumber()).build();
        return economyClassSeat;
    }

    //7
    public BusinessClassSeat takeEntityMakeBusinessClassSeat(BusinessClassSeatEntity businessClassSeatEntity) {
        BusinessClassSeat businessClassSeat = BusinessClassSeat.builder()
                .withSeatNumber(businessClassSeatEntity.getSeatNumber()).build();
        return businessClassSeat;
    }

    //8
    public List<BusinessClassSeat> createBusinessClassSeats(List<BusinessClassSeatEntity> businessClassSeatEntities) {
        List<BusinessClassSeat> businessClassSeats = new ArrayList<>();
        for (BusinessClassSeatEntity businessClassSeatEntity : businessClassSeatEntities) {
            businessClassSeats.add(takeEntityMakeBusinessClassSeat(businessClassSeatEntity));
        }
        return businessClassSeats;
    }

    //9
    public List<EconomyClassSeat> createEconomyClassSeats(List<EconomyClassSeatEntity> economyClassSeatEntities) {
        List<EconomyClassSeat> economyClassSeats = new ArrayList<>();
        for (EconomyClassSeatEntity economyClassSeatEntity : economyClassSeatEntities) {
            economyClassSeats.add(takeEntityMakeEconomyClassSeat(economyClassSeatEntity));
        }
        return economyClassSeats;
    }

    //10
    public EconomyClassSeatEntity takeSeatMakeEconomyClassSeatEntity(EconomyClassSeat economyClassSeat) {
        EconomyClassSeatEntity economyClassSeatEntity = EconomyClassSeatEntity.builder()
                .withSeatNumber(economyClassSeat.getSeatNumber()).build();
        return economyClassSeatEntity;
    }

    //11
    public BusinessClassSeatEntity takeSeatMakeBusinessClassSeatEntity(BusinessClassSeat businessClassSeat) {
        BusinessClassSeatEntity businessClassSeatEntity = BusinessClassSeatEntity.builder()
                .withSeatNumber(businessClassSeat.getSeatNumber()).build();
        return businessClassSeatEntity;
    }

    //12
    public List<BusinessClassSeatEntity> createBusinessClassSeatEntitys(List<BusinessClassSeat> businessClassSeats) {
        List<BusinessClassSeatEntity> businessClassSeatEntitys = new ArrayList<>();
        for (BusinessClassSeat businessClassSeat : businessClassSeats) {
            businessClassSeatEntitys.add(takeSeatMakeBusinessClassSeatEntity(businessClassSeat));
        }
        return businessClassSeatEntitys;
    }


    //13
    public List<EconomyClassSeatEntity> createEconomyClassSeatEntitys(List<EconomyClassSeat> economyClassSeats) {
        List<EconomyClassSeatEntity> economyClassSeatEntitys = new ArrayList<>();
        for (EconomyClassSeat economyClassSeat : economyClassSeats) {
            economyClassSeatEntitys.add(takeSeatMakeEconomyClassSeatEntity(economyClassSeat));
        }
        return economyClassSeatEntitys;
    }

    public FoodEntity takeFoodReturnFoodEntity(Food food) {
        FoodEntity foodEntity = FoodEntity.builder()
                .withCost(food.getCost())
                .withName(food.getName())
                .build();
        return foodEntity;
    }

    public Food takeFoodEntityReturnFood(FoodEntity foodEntity) {
        Food food = Food.builder()
                .withCost(foodEntity.getCost())
                .withName(foodEntity.getName())
                .build();
        return food;
    }

    public List<Food> takeFoodEntitysMakeFoods(List<FoodEntity> foodEntitys) {
        List<Food> foods = new ArrayList<>();
        for (FoodEntity foodEntity : foodEntitys) {
            foods.add(takeFoodEntityReturnFood(foodEntity));
        }
        return foods;
    }

    public List<FoodEntity> takeFoodMakeFoodEntitys(List<Food> foods) {
        List<FoodEntity> foodEntitys = new ArrayList<>();
        for (Food food : foods) {
            foodEntitys.add(takeFoodReturnFoodEntity(food));
        }
        return foodEntitys;
    }




}
