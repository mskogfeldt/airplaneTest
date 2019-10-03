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

public class TripServiceImpl implements TripService {


    private TripDao tripDao;

    public TripServiceImpl(TripDao tripDao) {
        this.tripDao = Objects.requireNonNull(tripDao,"tripDao cannot be null");
    }

    public void addCustomerToMapOfFood(Trip trip, Customer customer, List<Food> food) {
        trip.getBookedFood().put(customer, food);
    }

    public List<Food> addFoodToListReturnList(Food food, List<Food> list) {
        list.add(food);
        return list;
    }

    public Optional<TripEntity> readTripEntity(String id){
        return tripDao.readTripEntity(id);
    }

    //public List<FoodEntity> getBookedFood(Map<CustomerEntity, FoodEntity>> CustomerEntity customerEntity)
 /*
    public Collection<FoodEntity> getOrderedFood(TripEntity tripEntity, Customer customer){
        Optional<TripEntity> trip1 = readTripEntity(tripEntity.getId());
        //Collection<FoodEntity> getListOfFood = tripEntity.getBookedFood();

+
    }

 trip

    public Collection<FoodEntity> readFromBookedFood(Customer customer, Collection<Foodentity> bookedFood){
            return accounts.values()
                    .stream()
                    .filter(customer -> customer.getSsn().equals() limit)
                    .collect(Collectors.toSet());
        }
    }

    public Optional<Account> read(Long id) {
        return Optional.ofNullable(accounts.get(id));
    }

    @Override
    public Collection<Account> readAccountsWithBalanceOver(Double limit) {
        return accounts.values()
                .stream()
                .filter(account -> account.getBalance() > limit)
                .collect(Collectors.toSet());
    }

  */

    public List<Food> removeFoodFromListReturnList(Food food, List<Food> list) {
        list.add(food);
        return list;
    }

    public void addFoodToList(List<Food> food, Food newFood){
        food.add(newFood);
    }

    public void removeFoodFromList(List<Food> food, Food oldFood){
        food.remove(oldFood);
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

    public BusinessClassSeat removeBusinessClassSeatFromList(List<BusinessClassSeat> businessClassseats, BusinessClassSeat businessClassSeat){
        businessClassseats.remove(businessClassSeat);
        return businessClassSeat;
    }

    public void addBusinessClassSeatToList(List<BusinessClassSeat> businessClassseats, BusinessClassSeat businessClassSeat){
        businessClassseats.add(businessClassSeat);
    }

    public void addBusinessClassSeatToMap(BusinessClassSeat seat, Customer customer, Trip trip){
        trip.getBookedBusinessClassSeats().put(seat.getSeatNumber(), customer);
    }

    public void customerBookingBusinessSeat(BusinessClassSeat businessClassSeat, Trip trip, Customer customer){
        BusinessClassSeat businessClassSeatX = removeBusinessClassSeatFromList(trip.getAvalibleBusinessClassSeats(), businessClassSeat);
        addBusinessClassSeatToMap(businessClassSeatX, customer, trip);
    }

    public EconomyClassSeat removeEconomyClassSeatFromList(List<EconomyClassSeat> economyClassSeats, EconomyClassSeat economyClassSeat){
        economyClassSeats.remove(economyClassSeat);
        return economyClassSeat;
    }

    public void addEconomyClassSeatToList(List<EconomyClassSeat> economyClassSeats, EconomyClassSeat economyClassSeat){
        economyClassSeats.add(economyClassSeat);
    }

    public void addEconomyClassSeatToMap(EconomyClassSeat seat, Customer customer, Trip trip){
        trip.getBookedEconomyClassSeats().put(seat.getSeatNumber(), customer);
    }

    public void customerBookingEconomySeat(EconomyClassSeat economyClassSeat, Trip trip, Customer customer){
        EconomyClassSeat economyClassSeatX = removeEconomyClassSeatFromList(trip.getAvalibleEconomyClassSeats(), economyClassSeat);
        addEconomyClassSeatToMap(economyClassSeatX, customer, trip);
    }

    public TripEntity makeTripEntity(Trip trip){
        List<FoodEntity> businessClassFood1 =


        /*
         Customer customer1 = Customer.builder().withFirstName("Adam").withLastName("Andersson")
                .withSsn("12345").build();

        List<BusinessClassSeat> businessClassSeats =new ArrayList<>();
        List<EconomyClassSeat>  economyClassSeats = new ArrayList<>();

        BusinessClassSeat businessClassSeat1 = BusinessClassSeat.builder()
                .withSeatNumber(1).build();
        EconomyClassSeat economyClassSeat1 = EconomyClassSeat.builder()
                .withSeatNumber(1).build();

        businessClassSeats.add(businessClassSeat1);
        economyClassSeats.add(economyClassSeat1);

        List<Food> bMenu = new ArrayList<>();
        List<Food> eMenu = new ArrayList<>();

        Food eal = Food.builder().withName("Eal").withCost(100).build();
        Food banana = Food.builder().withName("Banana").withCost(200).build();

        bMenu.add(banana);
        eMenu.add(eal);

        Map<Customer, List<Food>> bFood = new HashMap<>();
        bFood.put(customer1,bMenu);

        Airplane airplane =Airplane.builder().withId("12345")
                .withBusinissClassSeats(businessClassSeats)
                .withEconomyClassSeats(economyClassSeats).build();

        List<Airplane> fleat1 = new ArrayList<>();
        fleat1.add(airplane);

        AirLine airLine = AirLine.builder().withName("Airair")
                .withTreasury(50000)
                .withFleat(fleat1).build();

        Trip trip = Trip.builder()
                .withAirLine(airLine)
                .withAirplane(airplane)
                .withBusinessClassMenu(bMenu)
                .withEconomyClassMenu(eMenu)
                .withBookedFood(bFood)
                .withAvaibleBusinessClassSeats(airplane.getBusinessClassSeats())
                .withBookedBusinessClassSeats(new HashMap<Integer, Customer>())
                .withAvalibleEconomiClassSeats(airplane.getEconomyClassSeats())
                .withBookedEconomiClassSeats(new HashMap<Integer, Customer>())
                .withCostForEconomyClassSeat(5000)
                .withCostForBusinessClassSeat(20000)
                .build();
        Assert.assertNotNull(trip.getCostForEconomyClassSeat());
         */
    }

}
