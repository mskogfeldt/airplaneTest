package se.mskogfeldt.entity;

import se.mskogfeldt.domain.AirLine;

public class AirLineEntity {

    public int treasury;
    public String name;

    public AirLineEntity (Builder builder){
        this.name = name;
        this.treasury = treasury;

    }

    public String getName(){
        return name;
    }

    public int getTreasury() {
        return treasury;
    }

    @Override
    public String toString() {
        return "AirLineEntity{" +
                "treasury=" + treasury +
                ", name='" + name + '\'' +
                '}';
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder {
        private String name;
        private int treasury;

        public Builder withName(String name){
            this.name = name;
            return this;
        }

        public Builder withTreasury(int treasury){
            this.treasury = treasury;
            return this;
        }

        public AirLineEntity build(){
            return new AirLineEntity(this);
        }

    }
}
