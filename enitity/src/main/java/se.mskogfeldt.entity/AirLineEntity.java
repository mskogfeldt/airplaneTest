package se.mskogfeldt.entity;

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
}
