package se.mskogfeldt.test.entity;

import org.junit.Assert;

public class EntityTest {
    testCreatingCustomerentity() {
        CustomerEntity customerEntity = CustomerEntity.builder().withFirstName("Adam")
                .with("Andersson").withSsn("12345").build();
        Assert.assertNotNull(customerEntity.getFirstName());
    }

}
