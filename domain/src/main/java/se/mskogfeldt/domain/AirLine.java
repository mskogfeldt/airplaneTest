package se.mskogfeldt.domain;

import java.util.Objects;

public class AirLine {

    public String name;
    public int treasury;

    public AirLine(Builder builder) {
        this.name = Objects.requireNonNull(builder.name);
        this.treasury = Objects.requireNonNull(builder.treasury);

    }

    public String getName() {
        return name;
    }

    public int getTreasury() {
        return treasury;
    }

    @Override
    public String toString() {
        return "AirLine{" +
                "name='" + name + '\'' +
                ", treasury=" + treasury +
                '}';
    }

    public static Builder builder() { return new Builder();}

    public static class Builder {

        private String name;
        private int treasury;

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withTreasury(int treasury) {
            this.treasury = treasury;
            return this;
        }

        public AirLine build(){
            return new AirLine(this);
        }

    }

}


