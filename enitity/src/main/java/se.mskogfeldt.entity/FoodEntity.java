package se.mskogfeldt.entity;

import java.util.Objects;

public class FoodEntity {
    private int cost;
    private String name;

    public FoodEntity(Builder builder) {
        this.cost = Objects.requireNonNull(builder.cost);
        this.name = Objects.requireNonNull(builder.name);
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Builder builder() {return  new Builder();}

    public static class Builder {
        private int cost;
        private String name;

        public Builder withCost(int cost){
            this.cost = cost;
            return this;
        }

        public Builder withName(String name){
            this.name = name;
            return this;
        }

        public FoodEntity build(){
            return new FoodEntity(this);
        }
    }
}
