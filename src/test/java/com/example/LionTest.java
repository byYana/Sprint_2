package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void testGetKittens() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getKittens()).thenReturn(10);
        assertEquals(10, lion.getKittens());
    }

    @Test
    public void testDoesHaveMane() throws Exception {
        Lion lion = new Lion("Самец", feline);
        assertTrue(lion.doesHaveMane());
    }

    @Test
    public void testSexLionTrue() throws Exception {
        Lion lion = new Lion("Самец", feline);
        boolean rezultSexLion = lion.hasMane;
        assertTrue(rezultSexLion);
    }

    @Test
    public void testSexLionFalse() throws Exception {
        Lion lion = new Lion("Самка", feline);
        boolean rezultSexLion = lion.hasMane;
        assertFalse(rezultSexLion);
    }

    @Test
    public void testSexLionException() {
        String textException = "Используйте допустимые значения пола животного - самей или самка";
        try {
            Lion lion = new Lion("Детеныш", feline);
        } catch (java.lang.Exception e) {
            assertEquals(textException, e.getMessage());
        }
    }

    @Test
    public void testGetFood() throws Exception {
        List<String> rezult = Arrays.asList("Животные", "Птицы", "Рыба");
        Lion lion = new Lion("Самка", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals(rezult, lion.getFood());
    }
}