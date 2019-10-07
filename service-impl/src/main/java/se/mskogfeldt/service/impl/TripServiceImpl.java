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
        this.tripDao = Objects.requireNonNull(tripDao, "tripDao cannot be null");
    }

    public List<Food> addFoodToListReturnList(Food food, List<Food> list) {
        list.add(food);
        return list;
    }

    public Optional<TripEntity> readTripEntity(String id) {
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

    //1
    public List<Food> removeFoodFromListReturnList(Food food, List<Food> list) {
        list.add(food);
        return list;
    }

    // 2
    public void addFoodToList(List<Food> food, Food newFood) {
        food.add(newFood);
    }

    //3
    public void removeFoodFromList(List<Food> food, Food oldFood) {
        food.remove(oldFood);
    }

    //4
    public Collection<BusinessClassSeatEntity> readAllAvalibleBusinessClassSeats(TripEntity tripEntity) {
        List<BusinessClassSeatEntity> returnCollection = tripEntity.getAvalibleBusinessClassSeatEntitys();
        return returnCollection;
    }

    //5
    public Collection<EconomyClassSeatEntity> readAllAvalibleEconomyClassSeats(TripEntity tripEntity) {
        List<EconomyClassSeatEntity> returnCollection = tripEntity.getAvalibleEconomyClassSeatEntitys();
        return returnCollection;
    }

    //6
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

    //14
    public BusinessClassSeat removeBusinessClassSeatFromList(List<BusinessClassSeat> businessClassseats, BusinessClassSeat businessClassSeat) {
        businessClassseats.remove(businessClassSeat);
        return businessClassSeat;
    }

    //15
    public void addBusinessClassSeatToList(List<BusinessClassSeat> businessClassseats, BusinessClassSeat businessClassSeat) {
        businessClassseats.add(businessClassSeat);
    }

    //16
    public void addBusinessClassSeatToMap(BusinessClassSeat seat, Customer customer, Trip trip) {
        trip.getBookedBusinessClassSeats().put(customer.getSsn(), seat);
    }

    //17
    public void customerBookingBusinessSeat(BusinessClassSeat businessClassSeat, Trip trip, Customer customer) {
        BusinessClassSeat businessClassSeatX = removeBusinessClassSeatFromList(trip.getAvalibleBusinessClassSeats(), businessClassSeat);
        addBusinessClassSeatToMap(businessClassSeatX, customer, trip);
    }

    //18
    public EconomyClassSeat removeEconomyClassSeatFromList(List<EconomyClassSeat> economyClassSeats, EconomyClassSeat economyClassSeat) {
        economyClassSeats.remove(economyClassSeat);
        return economyClassSeat;
    }

    //19
    public void addEconomyClassSeatToList(List<EconomyClassSeat> economyClassSeats, EconomyClassSeat economyClassSeat) {
        economyClassSeats.add(economyClassSeat);
    }

    //20
    public void addEconomyClassSeatToMap(EconomyClassSeat seat, Customer customer, Trip trip) {
        trip.getBookedEconomyClassSeats().put(customer.getSsn(), seat);
    }

    //21
    public void customerBookingEconomySeat(EconomyClassSeat economyClassSeat, Trip trip, Customer customer) {
        EconomyClassSeat economyClassSeatX = removeEconomyClassSeatFromList(trip.getAvalibleEconomyClassSeats(), economyClassSeat);
        addEconomyClassSeatToMap(economyClassSeatX, customer, trip);
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

    public List<Food> takeFoodEntitysmakeFoods(List<FoodEntity> foodEntitys) {
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

    public void addCustomerToMapOfFood(Trip trip, Customer customer, List<Food> foods) {
        trip.getBookedFood().put(customer.getSsn(), foods);
    }

    public Integer calculateFoodProfitFromList(List<FoodEntity> foodEntitys){
        Integer profit = 0;
        for (FoodEntity foodEntity : foodEntitys) {
            profit += foodEntity.getCost();
        }
        return profit;
    }

    public Integer calculateObjectsInList(List<Objects> items){
        int sizeOfList = items.size();
        return sizeOfList;
    }

    public Integer calculateBusinessClassSeatsInMap(Map<String, BusinessClassSeatEntity> items){
        int sizeOfMap = items.size();
        return sizeOfMap;
    }

    public Integer calculateEconomyClassSeatsInMap(Map<String, EconomyClassSeatEntity> items){
        int sizeOfMap = items.size();
        return sizeOfMap;
    }

    public int calculateBusinessClassSeatProfit(TripEntity tripEntity){
        int bCash = tripEntity.getCostForBusinessClassSeat()*calculateBusinessClassSeatsInMap(tripEntity.getBookedBusinessClassSeatEntitys());
        return bCash;
    }

    public int calculateEconomyClassSeatProfit(TripEntity tripEntity){
        int eCash = tripEntity.getCostForEconomyClassSeat()*calculateEconomyClassSeatsInMap(tripEntity.getBookedEconomyClassSeatEntitys());
        return eCash;
    }

  /*  public Integer calculateProfitFromTrip(){
        int profit;

    }

    public void putFoodEntityInMap(Customer customerEntity, List<FoodEntity> foodEntitys, TripEntity tripEntity){

        if (tripEntity.getBookedFoodEntity().containsKey(customerEntity)) {
            throw new RuntimeException("Trip already exists");
        }
        trips.put(tripEntity.getId(), tripEntity);
    }




    public void createTrip(TripEntity tripEntity) {
        if (trips.containsKey(tripEntity.getId())) {
            throw new RuntimeException("Trip already exists");
        }
        trips.put(tripEntity.getId(), tripEntity);
    }


    public TripEntity makeTripFromTripEntity(Trip trip){
        List<FoodEntity> businessClassFood1 =



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
