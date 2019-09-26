package se.mskogfeldt.entity;



import java.util.List;
import java.util.Map;
import java.util.Objects;

public class TripEntity {

    private String id;
    private boolean isDone;

    private AirLineEntity airLineEntity;
    private AirplaneEntity airplaneEntity;

    private List<FoodEntity> businessClassMenuEntity;
    private List<FoodEntity> economyClassMenuEntity;

    private Map<CustomerEntity, FoodEntity> bookedFoodEntity;

    private List<BusinessClassSeatEntity> avalibleBusinessClassSeatEntitys;
    private Map<Integer, CustomerEntity> bookedBusinessClassSeatEntitys;

    private List<EconomyClassSeatEntity> avalibleEconomyClassSeatEntitys;
    private Map<Integer, CustomerEntity> bookedEconomyClassSeatEntitys;

    private int costForBusinessClassSeat;
    private int costForEconomyClassSeat;


    public TripEntity(Builder builder) {
        this.id = Objects.requireNonNull(builder.id);
        this.isDone = Objects.requireNonNull(builder.isDone);

        this.airLineEntity = Objects.requireNonNull(builder.airLineEntity);
        this.airplaneEntity = Objects.requireNonNull(builder.airplaneEntity);

        this.businessClassMenuEntity = Objects.requireNonNull(builder.businessClassMenuEntity);
        this.economyClassMenuEntity = Objects.requireNonNull(builder.economyClassMenuEntity);

        this.avalibleBusinessClassSeatEntitys = Objects.requireNonNull(builder.avalibleBusinessClassSeatEntitys);
        this.bookedBusinessClassSeatEntitys = builder.bookedBusinessClassSeatEntitys;

        this.avalibleEconomyClassSeatEntitys = Objects.requireNonNull(builder.avalibleEconomyClassSeatEntitys);
        this.bookedEconomyClassSeatEntitys = builder.bookedEconomyClassSeatEntitys;

        this.costForBusinessClassSeat = Objects.requireNonNull(builder.costForBusinessClassSeat);
        this.costForEconomyClassSeat = Objects.requireNonNull(builder.costForEconomyClassSeat);

    }

    public String getId(){
        return id;
    }

    public boolean getIsDone(){
        return isDone;
    }

    public AirLineEntity getAirLineEntity() {
        return airLineEntity;
    }

    public void setAirLineEntity(AirLineEntity airLineEntity) {
        this.airLineEntity = airLineEntity;
    }


    public AirplaneEntity getAirplaneEntity() {
        return airplaneEntity;
    }

    public void setAirplaneEntity(AirplaneEntity airplaneEntity) {
        this.airplaneEntity = airplaneEntity;
    }

    public List<FoodEntity> getBusinessClassMenuEntity() {
        return businessClassMenuEntity;
    }

    public void setBusinessClassMenuEntity(List<FoodEntity> businessClassMenuEntity) {
        this.businessClassMenuEntity = businessClassMenuEntity;
    }

    public List<FoodEntity> getEconomyClassMenuEntity() {
        return economyClassMenuEntity;
    }

    public void setEconomyClassMenuEntity(List<FoodEntity> economyClassMenuEntity) {
        this.economyClassMenuEntity = economyClassMenuEntity;
    }

    public Map<CustomerEntity, FoodEntity> getBookedFoodEntity() {
        return bookedFoodEntity;
    }

    public void setBookedFoodEntity(Map<CustomerEntity, FoodEntity> bookedFoodEntity) {
        this.bookedFoodEntity = bookedFoodEntity;
    }

    public List<BusinessClassSeatEntity> getAvaibleBusinessClassSeatEntitys() {
        return avalibleBusinessClassSeatEntitys;
    }

    public void setAvaibleBusinessClassSeatEntitys(List<BusinessClassSeatEntity> avalibleBusinessClassSeatEntitys) {
        this.avalibleBusinessClassSeatEntitys = avalibleBusinessClassSeatEntitys;
    }

    public Map<Integer, CustomerEntity> getBookedBusinessClassSeatEntitys() {
        return bookedBusinessClassSeatEntitys;
    }

    public void setBookedBusinessClassSeatEntitys(Map<Integer, CustomerEntity> bookedBusinessClassSeatEntitys) {
        this.bookedBusinessClassSeatEntitys = bookedBusinessClassSeatEntitys;
    }

    public List<EconomyClassSeatEntity> getAvalibleEconomyClassSeatEntitys() {
        return avalibleEconomyClassSeatEntitys;
    }

    public void setAvalibleEconomyClassSeatEntitys(List<EconomyClassSeatEntity> avalibleEconomyClassSeatEntitys) {
        this.avalibleEconomyClassSeatEntitys = avalibleEconomyClassSeatEntitys;
    }

    public Map<Integer, CustomerEntity> getBookedEconomyClassSeatEntitys() {
        return bookedEconomyClassSeatEntitys;
    }

    public void setBookedEconomyClassSeatEntitys(Map<Integer, CustomerEntity> bookedEconomyClassSeatEntitys) {
        this.bookedEconomyClassSeatEntitys = bookedEconomyClassSeatEntitys;
    }

    public int getCostForBusinessClassSeat() {
        return costForBusinessClassSeat;
    }

    public void setCostForBusinessClassSeat(int costForBuisnessClassSeat) {
        this.costForBusinessClassSeat = costForBuisnessClassSeat;
    }

    public int getCostForEconomyClassSeat() {
        return costForEconomyClassSeat;
    }

    public void setCostForEconomyClassSeat(int costForEkonomyClassSeat) {
        this.costForEconomyClassSeat = costForEkonomyClassSeat;
    }

    public List<BusinessClassSeatEntity> getAvalibleBusinessClassSeatEntitys() {
        return avalibleBusinessClassSeatEntitys;
    }

    public void setAvalibleBusinessClassSeatEntitys(List<BusinessClassSeatEntity> avalibleBusinessClassSeatEntitys) {
        this.avalibleBusinessClassSeatEntitys = avalibleBusinessClassSeatEntitys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String id;

        private boolean isDone;

        private AirplaneEntity airplaneEntity;
        private AirLineEntity airLineEntity;

        private List<FoodEntity> businessClassMenuEntity;
        private List<FoodEntity> economyClassMenuEntity;

        private Map<CustomerEntity, FoodEntity> bookedFood;

        private List<BusinessClassSeatEntity> avalibleBusinessClassSeatEntitys;
        private Map<Integer, CustomerEntity> bookedBusinessClassSeatEntitys;

        private List<EconomyClassSeatEntity> avalibleEconomyClassSeatEntitys;
        private Map<Integer, CustomerEntity> bookedEconomyClassSeatEntitys;

        private int costForBusinessClassSeat;
        private int costForEconomyClassSeat;

        public Builder withId(String id){
            this.id = id;
            return this;
        }

        public Builder withIsDone(boolean isDone){
            this.isDone = isDone;
            return this;
        }

        public Builder withAirLineEntity(AirLineEntity airLineEntity) {
            this.airLineEntity = airLineEntity;
            return this;
        }


        public Builder withAirplaneEntity(AirplaneEntity airplaneEntity) {
            this.airplaneEntity = airplaneEntity;
            return this;
        }

        public Builder withBusinessClassMenuEntity(List<FoodEntity> businessClassMenuEntity) {
            this.businessClassMenuEntity = businessClassMenuEntity;
            return this;
        }

        public Builder withEconomyClassMenuEntity(List<FoodEntity> economyClassMenuEntity) {
            this.economyClassMenuEntity = economyClassMenuEntity;
            return this;
        }

        public Builder withBookedFood(Map<CustomerEntity, FoodEntity> bookedFood) {
            this.bookedFood = bookedFood;
            return this;
        }

        public Builder withAvaibleBusinessClassSeatEntitys(List<BusinessClassSeatEntity> avalibleBusinessClassSeatEntitys) {
            this.avalibleBusinessClassSeatEntitys = avalibleBusinessClassSeatEntitys;
            return this;
        }

        public Builder withBookedBusinessClassSeatEntitys(Map<Integer, CustomerEntity> bookedBusinessClassSeatEntitys) {
            this.bookedBusinessClassSeatEntitys = bookedBusinessClassSeatEntitys;
            return this;
        }

        public Builder withAvalibleEconomiClassSeatEntitys(List<EconomyClassSeatEntity> avalibleEconomyClassSeatEntitys) {
            this.avalibleEconomyClassSeatEntitys = avalibleEconomyClassSeatEntitys;
            return this;
        }

        public Builder withBookedEconomiClassSeatEntitys(Map<Integer, CustomerEntity> bookedEconomyClassSeatEntitys) {
            this.bookedEconomyClassSeatEntitys = bookedEconomyClassSeatEntitys;
            return this;
        }

        public Builder withCostForBuisnessClassSeat(int costForBusinessClassSeat) {
            this.costForBusinessClassSeat = costForBusinessClassSeat;
            return this;

        }

        public Builder withCostForEconomyClassSeat(int costForEconomyClassSeat) {
            this.costForEconomyClassSeat = costForEconomyClassSeat;
            return this;

        }

        public TripEntity build() {
            return new TripEntity(this);
        }


    }
}
