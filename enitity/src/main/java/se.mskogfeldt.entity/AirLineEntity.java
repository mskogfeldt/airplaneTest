package se.mskogfeldt.entity;

import se.mskogfeldt.domain.AirLine;
import se.mskogfeldt.domain.Airplane;

import java.util.List;
import java.util.Objects;

public class AirLineEntity {

    public int treasury;
    public String name;
    public List<AirplaneEntity> fleat;

    public AirLineEntity (Builder builder){
        this.name = Objects.requireNonNull(builder.name);
        this.treasury = Objects.requireNonNull(builder.treasury);
        this.fleat = builder.fleat;

    }

    public String getName(){
        return name;
    }

    public int getTreasury() {
        return treasury;
    }

    public List<AirplaneEntity> getFleat() {
        return fleat;
    }

    public void setFleat(List<AirplaneEntity> fleat) {
        this.fleat = fleat;
    }

    public void setTreasury(int treasury) {
        this.treasury = treasury;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AirLineEntity{" +
                "treasury=" + treasury +
                ", name='" + name + '\'' +
                '}' + "\n";
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder {
        private String name;
        private int treasury;
        private List<AirplaneEntity> fleat;

        public Builder withName(String name){
            this.name = name;
            return this;
        }

        public Builder withTreasury(int treasury){
            this.treasury = treasury;
            return this;
        }

        public Builder withFleat(List<AirplaneEntity> fleat) {
            this.fleat = fleat;
            return this;
        }

        public AirLineEntity build(){
            return new AirLineEntity(this);
        }

    }
}
