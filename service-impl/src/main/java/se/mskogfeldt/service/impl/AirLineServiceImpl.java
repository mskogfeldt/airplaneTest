package se.mskogfeldt.service.impl;

import se.mskogfeldt.dao.AirLineDao;
import se.mskogfeldt.domain.*;
import se.mskogfeldt.entity.AirLineEntity;
import se.mskogfeldt.entity.AirplaneEntity;
import se.mskogfeldt.entity.BusinessClassSeatEntity;
import se.mskogfeldt.entity.EconomyClassSeatEntity;
import se.mskogfeldt.service.AirLineService;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AirLineServiceImpl implements AirLineService {

    private AirLineDao airLineDao;

    public AirLineServiceImpl(AirLineDao airLineDao) {
        this.airLineDao = Objects.requireNonNull(airLineDao, "airLineDao");
    }


    public void createAirLine(AirLine airLine) {
        List<AirplaneEntity> fleat1 = new ArrayList<>();

        AirLineEntity airLineEntity = AirLineEntity.builder()
                .withTreasury(airLine.getTreasury())
                .withName(airLine.getName())
                .withFleat(createAirplaneEntities(airLine.getFleat())).build();

        airLineDao.create(airLineEntity);

    }

    public BusinessClassSeatEntity createBusinessClassSeatEntity(BusinessClassSeat businessClassSeat) {
        BusinessClassSeatEntity businessClassSeatEntity = BusinessClassSeatEntity.builder()
                .withSeatNumber(businessClassSeat.getSeatNumber()).build();
        return businessClassSeatEntity;
    }


    public List<BusinessClassSeatEntity> createBusinessClassSeatEntities(List<BusinessClassSeat> businessClassSeats) {
        List<BusinessClassSeatEntity> businessClassSeatEntitys = new ArrayList<>();
        for (BusinessClassSeat businessClassSeat : businessClassSeats) {
            businessClassSeatEntitys.add(createBusinessClassSeatEntity(businessClassSeat));
        }
        return businessClassSeatEntitys;
    }

    public EconomyClassSeatEntity createEconomyClassSeatEntity(EconomyClassSeat economyClassSeat) {
        EconomyClassSeatEntity economyClassSeatEntity = EconomyClassSeatEntity.builder()
                .withSeatNumber(economyClassSeat.getSeatNumber()).build();
        return economyClassSeatEntity;
    }

    public List<EconomyClassSeatEntity> createEconomyClassSeatEntities(List<EconomyClassSeat> economyClassSeats) {
        List<EconomyClassSeatEntity> economyClassSeatEntitys = new ArrayList<>();
        for (EconomyClassSeat economyClassSeat : economyClassSeats) {
            economyClassSeatEntitys.add(createEconomyClassSeatEntity(economyClassSeat));
        }
        return economyClassSeatEntitys;
    }


    public AirplaneEntity createAirPlaneEntity(Airplane airplane) {
        AirplaneEntity airplaneEntity = AirplaneEntity.builder().withId(airplane.getId())
                .withBusinessClassSeatEntitys(createBusinessClassSeatEntities(airplane.getBusinessClassSeats()))
                .withEconomyClassSeatEntitys(createEconomyClassSeatEntities(airplane.getEconomyClassSeats()))
                .build();
        return airplaneEntity;
    }

    public List<AirplaneEntity> createAirplaneEntities(List<Airplane> airplanes) {
        List<AirplaneEntity> airplaneEntitys = new ArrayList<>();
        for (Airplane airplane : airplanes) {
            airplaneEntitys.add(createAirPlaneEntity(airplane));
        }
        return airplaneEntitys;
    }

    /*

    public void presentFreeSeats(Trip trip) {
        List<BusinessClassSeat> businessClassSeats = trip.getAvalibleBusinessClassSeats();
        List<EconomyClassSeat> economyClassSeats = trip.getAvalibleEconomyClassSeats();
        System.out.println("Avalible Business Class SeatsbusinessClassSeats: " + businessClassSeats);
        System.out.println("Avalible Economy Class SeatsbusinessClassSeats: " + economyClassSeats);
    }

    public void presentMenu(Trip trip) {
        List<Food> businessClassMenu = trip.getBusinessClassMenu();
        List<Food> economyClassMenu = trip.getEconomyClassMenu();
        System.out.println("Business Class Menu: " + businessClassMenu);
        System.out.println("Economy Class Menu: " + businessClassMenu);


    }

    public void takeOff(Trip trip) {

    }

    public void createTicket(Trip trip, Customer customer) {

    }

    public void addAirplane(AirLine airLine, Airplane airplane) {

    }


    public List<Food> chooseFromMenu(Trip trip, Customer customer){
        presentMenu(trip);
        System.out.println("Do you wish to buy a Item from the menu?");
    }


 */

/*
    public void addFoodToCustomer(Trip trip, Customer customer, List<Food> food){
        List<Food> customersChoice = chooseFromMenu(trip, customer);
        presentMenu(trip);
    }

 */

}
