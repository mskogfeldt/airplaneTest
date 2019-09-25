package se.mskogfeldt.service.impl;

import se.mskogfeldt.domain.*;
import se.mskogfeldt.entity.BusinessClassSeatEntity;
import se.mskogfeldt.entity.EconomyClassSeatEntity;
import se.mskogfeldt.entity.TripEntity;
import se.mskogfeldt.service.TripService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class TripServiceImpl implements TripService {

/*
    public TripServiceImpl(TripDao tripDao) {
        this.tripDao = Required.notNull(tripDao, "tripDao");
    }
    
 */


    public void addCustomerToMapOfFood(Trip trip, Customer customer, List<Food> food) {
        trip.getBookedFood().put(customer, food);
    }

    public List<Food> addFoodToList(Food food, List<Food> list) {
        list.add(food);
        return list;
    }

    public List<Food> removeFoodFromList(Food food, List<Food> list) {
        list.add(food);
        return list;
    }

    public Collection<BusinessClassSeatEntity> readAllAvalibleBusinessClassSeats(TripEntity tripEntity) {
        List<BusinessClassSeatEntity> returnCollection = tripEntity.getAvalibleBusinessClassSeatEntitys();
        return returnCollection;
    }

    public Collection<EconomyClassSeatEntity> readAllAvalibleEconomyClassSeats(TripEntity tripEntity) {
        List<EconomyClassSeatEntity> returnCollection = tripEntity.getAvalibleEconomyClassSeatEntitys();
        return returnCollection;
    }

    public EconomyClassSeat takeEntityMakeEconomyClassSeat(EconomyClassSeatEntity economyClassSeatEntity) {
        EconomyClassSeat economyClassSeat = EconomyClassSeat.builder()
                .withSeatNumber(economyClassSeatEntity.getSeatNumber()).build();
        return economyClassSeat;
    }

    public BusinessClassSeat takeEntityMakeBusinessClassSeat(BusinessClassSeatEntity businessClassSeatEntity) {
        BusinessClassSeat businessClassSeat = BusinessClassSeat.builder()
                .withSeatNumber(businessClassSeatEntity.getSeatNumber()).build();
        return businessClassSeat;
    }

    public List<BusinessClassSeat> createBusinessClassSeats(List<BusinessClassSeatEntity> businessClassSeatEntities) {
        List<BusinessClassSeat> businessClassSeats = new ArrayList<>();
        for (BusinessClassSeatEntity businessClassSeatEntity : businessClassSeatEntities) {
            businessClassSeats.add(takeEntityMakeBusinessClassSeat(businessClassSeatEntity));
        }
        return businessClassSeats;
    }


    public List<EconomyClassSeat> createEconomyClassSeats(List<EconomyClassSeatEntity> economyClassSeatEntities) {
        List<EconomyClassSeat> economyClassSeats = new ArrayList<>();
        for (EconomyClassSeatEntity economyClassSeatEntity : economyClassSeatEntities) {
            economyClassSeats.add(takeEntityMakeEconomyClassSeat(economyClassSeatEntity));
        }
        return economyClassSeats;
    }


    public EconomyClassSeatEntity takeSeatMakeEconomyClassSeatEntity(EconomyClassSeat economyClassSeat) {
        EconomyClassSeatEntity economyClassSeatEntity = EconomyClassSeatEntity.builder()
                .withSeatNumber(economyClassSeat.getSeatNumber()).build();
        return economyClassSeatEntity;
    }

    public BusinessClassSeatEntity takeSeatMakeBusinessClassSeatEntity(BusinessClassSeat businessClassSeat) {
        BusinessClassSeatEntity businessClassSeatEntity = BusinessClassSeatEntity.builder()
                .withSeatNumber(businessClassSeat.getSeatNumber()).build();
        return businessClassSeatEntity;
    }

    public List<BusinessClassSeatEntity> createBusinessClassSeatEntitys(List<BusinessClassSeat> businessClassSeats) {
        List<BusinessClassSeatEntity> businessClassSeatEntitys = new ArrayList<>();
        for (BusinessClassSeat businessClassSeat : businessClassSeats) {
            businessClassSeatEntitys.add(takeSeatMakeBusinessClassSeatEntity(businessClassSeat));
        }
        return businessClassSeatEntitys;
    }


    public List<EconomyClassSeatEntity> createEconomyClassSeatEntitys(List<EconomyClassSeat> economyClassSeats) {
        List<EconomyClassSeatEntity> economyClassSeatEntitys = new ArrayList<>();
        for (EconomyClassSeat economyClassSeat : economyClassSeats) {
            economyClassSeatEntitys.add(takeSeatMakeEconomyClassSeatEntity(economyClassSeat));
        }
        return economyClassSeatEntitys;
    }

}
