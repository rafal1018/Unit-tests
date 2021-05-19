package pl.devfoundry.testing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MealTest {

    @Test
    void shouldReturnDiscoumntedPrice() {
        //givven
        Meal meal = new Meal(35);

        //when
        int discountedPrioce = meal.getDiscountedPrice(7);

        //then
        assertEquals(28, discountedPrioce);
        assertThat(discountedPrioce).isEqualTo(28);

    }

    @Test
    void referencesToTheSameObjectShouldBeEqual() {

        //given
        Meal meal1 = new Meal(10);
        Meal meal2 = meal1;

        //then
        assertSame(meal1, meal2);
        assertThat(meal1).isEqualTo(meal2);

    }

    @Test
    void referencesToDifferentObjectsShouldNotEqual() {

        //given
        Meal meal1 = new Meal(10);
        Meal meal2 = new Meal(20);

        //then
        assertNotSame(meal1, meal2);
        assertThat(meal1).isNotEqualTo(meal2);

    }

    @Test
    void twoMealsShouldBeEqualWhenPriceAndNameAreTheSame() {

        //given
        Meal meal1 = new Meal(10, "Pizza");
        Meal meal2 = new Meal(10, "Pizza");

        //then
        assertEquals(meal1, meal2, "Checking if two meals are equal");
        assertThat(meal1).isEqualTo(meal2);

    }

    @Test
    void exceptionShouldBeThrownIfDiscountIsHigherThanThePrice() {

        //given
        Meal meal = new Meal(8, "Soup");

        //when
        //then
        assertThrows(IllegalArgumentException.class, () -> meal.getDiscountedPrice(40));

    }
}