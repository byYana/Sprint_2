package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class PatametrizedMetodGetFoodTest {
    private static List<String> herbivore = Arrays.asList("Трава", "Различные растения");
    private static List<String> predators = Arrays.asList("Животные", "Птицы", "Рыба");
    private static List<String> fish = Arrays.asList("Неизвестный вид животного, используйте значение Травоядное или Хищник");
    List<String> rezult;
    String animalKind;

    public PatametrizedMetodGetFoodTest(String animalKind, List<String> rezult) {
        this.animalKind = animalKind;
        this.rezult = rezult;
    }

    @Parameterized.Parameters(name = "Тестовые данные: {0} {1}")
    public static Object[][] getSumData() {
        return new Object[][]{
                {"Травоядное", herbivore},
                {"Хищник", predators},
                {"Рыба", fish},
        };
    }

    @Test
    public void testGetFood() {
        Animal animal = new Animal();
        List<String> actual;
        try {
            actual = animal.getFood(animalKind);
            assertEquals(rezult, actual);
        } catch (java.lang.Exception e) {
            assertEquals(rezult.get(0), e.getMessage());
        }
    }
}