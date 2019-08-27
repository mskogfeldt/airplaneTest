package se.mskogfeldt;

public class Airplane {

    private String name;
    private String id;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static Builder builder() {
        return new Builder();

    }

    public static class Builder implements

            private String id;
    private String id;
    public Builder withId(String id){
        this.id = id;
        return this;
    }

    public Builder withId(String id) {
        this.id = id;
        return this;
    }

    public Airplane build() {
        return new Airplane(this);
    }



}

