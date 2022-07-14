package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Test
    public void testGetFamily() {
        Feline feline = new Feline();
        String soundCat = "Кошачьи";
        String checking = feline.getFamily();
        assertEquals(soundCat, checking);
    }

    @Test
    public void testGetKittens() {
        Feline feline = new Feline();
        int count = 1;
        assertEquals(count, feline.getKittens());
    }

    @Test
    public void testKittensCount() {
        Feline feline = new Feline();
        int count = 10;
        assertEquals(count, feline.getKittens(10));
    }

    @Test
    public void testEatMeat() throws Exception {
        Feline feline = new Feline();
        List<String> rezult = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(rezult, feline.eatMeat());
    }
}