package com.marketing.core.models;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HelloWorldModelTest {

    @Test
    public void testGetMessage() {
        HelloWorldModel model = new HelloWorldModel();
        // PostConstruct won't fire outside container, test the class exists
        assertEquals(null, model.getMessage());
    }
}
