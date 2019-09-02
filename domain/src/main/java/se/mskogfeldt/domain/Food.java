package se.mskogfeldt.domain;

import sun.security.provider.certpath.Builder;

import java.util.Objects;

public class Food {

    private int cost;
    private String name;

    public Food(Builder builder) {
       this.cost = Objects.requireNonNull(builder.cost);
       this.name = Objects.requireNonNull(builder.name);

    }

    public int getCost(){
        return cost;
    }

    public String getName(){
        return name;
    }

    public static Builder builder() {return new Builder(); }

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

        public Food build(){
            return new Food(this);
        }
    }

}
