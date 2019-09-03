package se.mskogfeldt.entity;

import se.mskogfeldt.domain.BusinessClassSeat;
import se.mskogfeldt.domain.EconomyClassSeat;

import java.util.List;
import java.util.Objects;

public class AirplaneEntity {
    private String id;
    private List<EconomyClassSeatEntity> economyClassSeatEntitys;
    private List<BusinessClassSeatEntity> businessClassSeatEntitys;

    public AirplaneEntity(Builder builder){
        this.id = Objects.requireNonNull(builder.id);
        this.businessClassSeatEntitys = builder.businessClassSeatEntitys;
        this.economyClassSeatEntitys = builder.economyClassSeatEntitys;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<EconomyClassSeatEntity> getEconomyClassSeatEntitys() {
        return economyClassSeatEntitys;
    }

    public void setEconomyClassSeatEntitys(List<EconomyClassSeatEntity> economyClassSeatEntitys) {
        this.economyClassSeatEntitys = economyClassSeatEntitys;
    }

    public List<BusinessClassSeatEntity> getBusinessClassSeatEntitys() {
        return businessClassSeatEntitys;
    }

    public void setBusinessClassSeatEntitys(List<BusinessClassSeatEntity> businessClassSeatEntitys) {
        this.businessClassSeatEntitys = businessClassSeatEntitys;
    }

    public static class Builder{
        private String id;
        private List<EconomyClassSeatEntity> economyClassSeatEntitys;
        private List<BusinessClassSeatEntity> businessClassSeatEntitys;

        public Builder withId(String id) {
            this.id = id;
            return this;
        }

        public Builder withEconomyClassSeatEntitys(List<EconomyClassSeatEntity> economyClassSeatEntitys) {
            this.economyClassSeatEntitys = economyClassSeatEntitys;
            return this;
        }

        public Builder withBusinissClassSeatEntitys(List<BusinessClassSeatEntity> buisnissClassSeatEntitys) {
            this.businessClassSeatEntitys = buisnissClassSeatEntitys;
            return this;
        }

        public AirplaneEntity build() {
            return new AirplaneEntity(this);
        }

    }
}
