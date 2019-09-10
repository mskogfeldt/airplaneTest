package se.mskogfeldt.entity;

import se.mskogfeldt.domain.Food;

import java.util.List;
import java.util.Objects;

public class TripEntity {

    private AirLineEntity airLineEntity;
    private AirplaneEntity airplaneEntity;

    private List<BusinessClassSeatEntity> avalibleBusinessClassSeatEntitys;
    private List<BusinessClassSeatEntity> bookedBusinessClassSeatEntitys;

    private List<EconomyClassSeatEntity> avalibleEconomyClassSeatEntitys;
    private List<EconomyClassSeatEntity> bookedEconomyClassSeatEntitys;

    private int costForBusinessClassSeat;
    private int costForEconomyClassSeat;


    public TripEntity(Builder builder) {
        this.airLineEntity = Objects.requireNonNull(builder.airLineEntity);
        this.airplaneEntity = Objects.requireNonNull(builder.airplaneEntity);

        this.avalibleBusinessClassSeatEntitys = Objects.requireNonNull(builder.avalibleBusinessClassSeatEntitys);
        this.bookedBusinessClassSeatEntitys = builder.bookedBusinessClassSeatEntitys;

        this.avalibleEconomyClassSeatEntitys = Objects.requireNonNull(builder.avalibleEconomyClassSeatEntitys);
        this.bookedEconomyClassSeatEntitys = builder.bookedEconomyClassSeatEntitys;

        this.costForBusinessClassSeat = Objects.requireNonNull(builder.costForBusinessClassSeat);
        this.costForEconomyClassSeat = Objects.requireNonNull(builder.costForEconomyClassSeat);

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

    public List<BusinessClassSeatEntity> getAvaibleBusinessClassSeatEntitys() {
        return avalibleBusinessClassSeatEntitys;
    }

    public void setAvaibleBusinessClassSeatEntitys(List<BusinessClassSeatEntity> avalibleBusinessClassSeatEntitys) {
        this.avalibleBusinessClassSeatEntitys = avalibleBusinessClassSeatEntitys;
    }

    public List<BusinessClassSeatEntity> getBookedBusinessClassSeatEntitys() {
        return bookedBusinessClassSeatEntitys;
    }

    public void setBookedBusinessClassSeatEntitys(List<BusinessClassSeatEntity> bookedBusinessClassSeatEntitys) {
        this.bookedBusinessClassSeatEntitys = bookedBusinessClassSeatEntitys;
    }

    public List<EconomyClassSeatEntity> getAvalibleEconomyClassSeatEntitys() {
        return avalibleEconomyClassSeatEntitys;
    }

    public void setAvalibleEconomyClassSeatEntitys(List<EconomyClassSeatEntity> avalibleEconomyClassSeatEntitys) {
        this.avalibleEconomyClassSeatEntitys = avalibleEconomyClassSeatEntitys;
    }

    public List<EconomyClassSeatEntity> getBookedEconomyClassSeatEntitys() {
        return bookedEconomyClassSeatEntitys;
    }

    public void setBookedEconomyClassSeatEntitys(List<EconomyClassSeatEntity> bookedEconomyClassSeatEntitys) {
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

        private AirplaneEntity planeEntity;
        private AirLineEntity airLineEntity;

        private List<BusinessClassSeatEntity> avalibleBusinessClassSeatEntitys;
        private List<BusinessClassSeatEntity> bookedBusinessClassSeatEntitys;

        private List<EconomyClassSeatEntity> avalibleEconomyClassSeatEntitys;
        private List<EconomyClassSeatEntity> bookedEconomyClassSeatEntitys;

        private int costForBusinessClassSeat;
        private int costForEconomyClassSeat;

        public Builder withAvaibleBusinessClassSeatEntitys(List<BusinessClassSeatEntity> avalibleBusinessClassSeatEntitys) {
            this.avalibleBusinessClassSeatEntitys = avalibleBusinessClassSeatEntitys;
            return this;
        }

        public Builder withBookedBusinessClassSeatEntitys(List<BusinessClassSeatEntity> bookedBusinessClassSeatEntityss) {
            this.avalibleBusinessClassSeatEntitys = avalibleBusinessClassSeatEntitys;
            return this;
        }

        public Builder withAvalibleEconomiClassSeatEntitys(List<EconomyClassSeatEntity> avalibleEconomyClassSeatEntitys) {
            this.avalibleEconomyClassSeatEntitys = avalibleEconomyClassSeatEntitys;
            return this;
        }

        public Builder withBookedEconomiClassSeatEntitys(List<EconomyClassSeatEntity> bookedEconomyClassSeatEntitys) {
            this.bookedEconomyClassSeatEntitys = bookedEconomyClassSeatEntitys;
            return this;
        }

        public Builder withCostForBuisnessClassSeat(int costForBusinessClassSeat) {
            this.costForBusinessClassSeat = costForBusinessClassSeat;
            return this;

        }

        public Builder withCostForEconomyClassSeatEntity(int costForEkonomyClassSeatEntity) {
            this.costForEconomyClassSeat = costForEconomyClassSeat;
            return this;

        }

        public TripEntity build() {
            return new TripEntity(this);
        }


    }
}
