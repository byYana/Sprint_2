package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class AnimalTest {
    @Test
    public void testGetFamily() {
        String text = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        Animal animal = new Animal();
        String checking = animal.getFamily();
        assertEquals(text, checking);
    }
}