package se.mskogfeldt.entity;

import java.util.Objects;

public class CustomerEntity {

    private String firstName;
    private String lastName;
    private String ssn;

    public CustomerEntity(Builder builder) {
        this.firstName = Objects.requireNonNull(builder.firstName,"dd");
        this.lastName = Objects.requireNonNull(builder.lastName,"fff");
        this.ssn = Objects.requireNonNull(builder.ssn,"dd");
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSsn() {
        return ssn;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String firstName;
        private String lastName;
        private String ssn;

        public Builder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder withSsn(String ssn) {
            this.ssn = ssn;
            return this;
        }

        public CustomerEntity build() {
            return new CustomerEntity(this);
        }

    }

}


