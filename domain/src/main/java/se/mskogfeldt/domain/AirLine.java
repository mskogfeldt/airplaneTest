package se.mskogfeldt.domain;

import java.util.List;
import java.util.Objects;

public class AirLine {

    public String name;
    public int treasury;
    public List<Airplane> fleat;

    public AirLine(Builder builder) {
        this.name = Objects.requireNonNull(builder.name);
        this.treasury = Objects.requireNonNull(builder.treasury);
        this.fleat = builder.fleat;

    }

    public String getName() {
        return name;
    }

    public int getTreasury() {
        return treasury;
    }

    public void setTreasury(int treasury) {
        this.treasury = treasury;
    }

    public List<Airplane> getFleat() {
        return fleat;
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
        private List<Airplane> fleat;

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withTreasury(int treasury) {
            this.treasury = treasury;
            return this;
        }

        public Builder withFleat(List<Airplane> fleat) {
            this.fleat = fleat;
            return this;
        }

        public AirLine build(){
            return new AirLine(this);
        }

    }

}


