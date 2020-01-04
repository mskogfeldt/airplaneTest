package se.mskogfeldt.service;

import se.mskogfeldt.domain.*;
import se.mskogfeldt.entity.BusinessClassSeatEntity;
import se.mskogfeldt.entity.EconomyClassSeatEntity;
import se.mskogfeldt.entity.FoodEntity;
import se.mskogfeldt.entity.TripEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface TripService  {

    String DEFAULT_BEAN_NAME = "tripService";

    List<BusinessClassSeat> presentFreeBusinessSeats(String trip);

    List<EconomyClassSeat> presentFreeEconomySeats(String trip);

    List<Food> presentBusinessMenu(String trip);

    List<Food> presentEconomyMenu(String trip);

    void bookEconomySeat(String ssn, EconomyClassSeat economyClassSeat, String trip);

    void bookBusinessSeat(String ssn, BusinessClassSeat businessClassSeat, String trip);

    void bookFood(String ssn, List<Food> foods, String trip);

    void cancelBusinessSeat(String trip, String ssn, BusinessClassSeat businessClassSeat);

    void cancelEconomySeat(String trip, String ssn, EconomyClassSeat economyClassSeat);

    void cancelFoodOrder(String trip, String ssn);

    BusinessClassSeat getBookedBusinessClassSeat(Trip trip, Customer customer);

    EconomyClassSeat getBookedEconomyClassSeat(Trip trip, Customer customer);

    EconomyClassSeat takeEntityMakeEconomyClassSeat(EconomyClassSeatEntity economyClassSeatEntity);

    BusinessClassSeat takeEntityMakeBusinessClassSeat(BusinessClassSeatEntity businessClassSeatEntity);

    List<BusinessClassSeat> createBusinessClassSeats(List<BusinessClassSeatEntity> businessClassSeatEntities);

    List<EconomyClassSeat> createEconomyClassSeats(List<EconomyClassSeatEntity> economyClassSeatEntities);

    EconomyClassSeatEntity takeSeatMakeEconomyClassSeatEntity(EconomyClassSeat economyClassSeat);

    BusinessClassSeatEntity takeSeatMakeBusinessClassSeatEntity(BusinessClassSeat businessClassSeat);

    List<BusinessClassSeatEntity> createBusinessClassSeatEntitys(List<BusinessClassSeat> businessClassSeats);

    List<EconomyClassSeatEntity> createEconomyClassSeatEntitys(List<EconomyClassSeat> economyClassSeats);

    FoodEntity takeFoodReturnFoodEntity(Food food);

    Food takeFoodEntityReturnFood(FoodEntity foodEntity);

    List<Food> takeFoodEntitysMakeFoods(List<FoodEntity> foodEntitys);

    List<FoodEntity> takeFoodMakeFoodEntitys(List<Food> foods);



}
