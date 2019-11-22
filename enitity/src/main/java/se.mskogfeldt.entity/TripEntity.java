package se.mskogfeldt.entity;



import java.util.List;
import java.util.Map;
import java.util.Objects;

public class TripEntity {

    private String id;

    private AirLineEntity airLineEntity;
    private AirplaneEntity airplaneEntity;

    private String destination;

    private List<FoodEntity> businessClassMenuEntity;
    private List<FoodEntity> economyClassMenuEntity;

    private Map<String, List<FoodEntity>> bookedFoodEntity;

    private List<BusinessClassSeatEntity> avalibleBusinessClassSeatEntitys;
    private Map<String, BusinessClassSeatEntity> bookedBusinessClassSeatEntitys;

    private List<EconomyClassSeatEntity> avalibleEconomyClassSeatEntitys;
    private Map<String, EconomyClassSeatEntity> bookedEconomyClassSeatEntitys;

    private int costForBusinessClassSeat;
    private int costForEconomyClassSeat;


    public TripEntity(Builder builder) {
        this.id = Objects.requireNonNull(builder.id);
       // this.isDone = Objects.requireNonNull(builder.isDone);

        this.airLineEntity = Objects.requireNonNull(builder.airLineEntity);
        this.airplaneEntity = Objects.requireNonNull(builder.airplaneEntity);

        this.destination = Objects.requireNonNull(builder.destination, "destination");

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

    public String getDestination() { return destination; }

    public void setDestination(String destination) {this.destination = destination; }

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

    public Map<String, List<FoodEntity>> getBookedFoodEntity() {
        return bookedFoodEntity;
    }

    public void setBookedFoodEntity(Map<String, List<FoodEntity>> bookedFoodEntity) {
        this.bookedFoodEntity = bookedFoodEntity;
    }

    public List<BusinessClassSeatEntity> getAvaibleBusinessClassSeatEntitys() {
        return avalibleBusinessClassSeatEntitys;
    }

    public void setAvaibleBusinessClassSeatEntitys(List<BusinessClassSeatEntity> avalibleBusinessClassSeatEntitys) {
        this.avalibleBusinessClassSeatEntitys = avalibleBusinessClassSeatEntitys;
    }

    public Map<String, BusinessClassSeatEntity> getBookedBusinessClassSeatEntitys() {
        return bookedBusinessClassSeatEntitys;
    }

    public void setBookedBusinessClassSeatEntitys(Map<String, BusinessClassSeatEntity> bookedBusinessClassSeatEntitys) {
        this.bookedBusinessClassSeatEntitys = bookedBusinessClassSeatEntitys;
    }

    public List<EconomyClassSeatEntity> getAvalibleEconomyClassSeatEntitys() {
        return avalibleEconomyClassSeatEntitys;
    }

    public void setAvalibleEconomyClassSeatEntitys(List<EconomyClassSeatEntity> avalibleEconomyClassSeatEntitys) {
        this.avalibleEconomyClassSeatEntitys = avalibleEconomyClassSeatEntitys;
    }

    public Map<String, EconomyClassSeatEntity> getBookedEconomyClassSeatEntitys() {
        return bookedEconomyClassSeatEntitys;
    }

    public void setBookedEconomyClassSeatEntitys(Map<String, EconomyClassSeatEntity> bookedEconomyClassSeatEntitys) {
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

       // private boolean isDone;

        private AirplaneEntity airplaneEntity;
        private AirLineEntity airLineEntity;

        private String destination;

        private List<FoodEntity> businessClassMenuEntity;
        private List<FoodEntity> economyClassMenuEntity;

        private Map<String, List<FoodEntity>> bookedFood;

        private List<BusinessClassSeatEntity> avalibleBusinessClassSeatEntitys;
        private Map<String, BusinessClassSeatEntity> bookedBusinessClassSeatEntitys;

        private List<EconomyClassSeatEntity> avalibleEconomyClassSeatEntitys;
        private Map<String, EconomyClassSeatEntity> bookedEconomyClassSeatEntitys;

        private int costForBusinessClassSeat;
        private int costForEconomyClassSeat;

        public Builder withId(String id){
            this.id = id;
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

        public Builder withDerstination(String destination){
            this.destination = destination;
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

        public Builder withBookedFood(Map<String, List<FoodEntity>> bookedFood) {
            this.bookedFood = bookedFood;
            return this;
        }

        public Builder withAvaibleBusinessClassSeatEntitys(List<BusinessClassSeatEntity> avalibleBusinessClassSeatEntitys) {
            this.avalibleBusinessClassSeatEntitys = avalibleBusinessClassSeatEntitys;
            return this;
        }

        public Builder withBookedBusinessClassSeatEntitys(Map<String, BusinessClassSeatEntity> bookedBusinessClassSeatEntitys) {
            this.bookedBusinessClassSeatEntitys = bookedBusinessClassSeatEntitys;
            return this;
        }

        public Builder withAvalibleEconomyClassSeatEntitys(List<EconomyClassSeatEntity> avalibleEconomyClassSeatEntitys) {
            this.avalibleEconomyClassSeatEntitys = avalibleEconomyClassSeatEntitys;
            return this;
        }

        public Builder withBookedEconomyClassSeatEntitys(Map<String, EconomyClassSeatEntity> bookedEconomyClassSeatEntitys) {
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
