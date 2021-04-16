package com.company.SpringTutorial.model;

import org.junit.Assert;
import org.junit.Test;

import java.util.UUID;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void shouldTestSomething() {
        Person marcus = new Person(UUID.randomUUID(), "marcus");
        assertEquals("marcus", marcus.getName());

    }

    @Test
    public void shouldBreakCI() {
        assertEquals("marcus", "ignacio");

    }
}
