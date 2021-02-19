package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PizzaOrderTestSuite {
    @Test
    public void testQuatroRedentiWithAdditionalCheese() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new QuatroRodentiDecorator(order);
        order = new CheeseDecorator(order);

        //When
        String pizza = order.getIngredients();
        double price = order.getPrice();

        //Then
        assertEquals(32, price);
        assertEquals("Pizza bottom covered with delicious tomato sauce, toped with cheese, four minced pork cutlets shaped like rats, just for all Late sir T. Pratchett fans, some more cheese", pizza);
    }

    @Test
    public void testThinPizzaWithAnchoisAndMozarellaDiBufalla() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new AnchoisDecorator(order);
        order = new MozzarellaDiBufalaDecorator(order);
        order = new ThinBottomDecorator(order);

        //When
        String pizza = order.getIngredients();
        double price = order.getPrice();

        //Then
        assertEquals(30, price);
        assertEquals("thin Pizza bottom covered with delicious tomato sauce, toped with cheese, anchois, original Italian Mozzarella Di Bufala", pizza);
    }

    @Test
    public void testTripleCricketsPizza() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new CricketDecorator(order);
        order = new CricketDecorator(order);
        order = new CricketDecorator(order);

        //When
        String pizza = order.getIngredients();
        double price = order.getPrice();

        //Then
        assertEquals(22.5, price);
        assertEquals("Pizza bottom covered with delicious tomato sauce, toped with cheese, some crispy crickets, some crispy crickets, some crispy crickets", pizza);
    }

    @Test
    public void testAllPossibleIngrendientsPizza(){
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new AnchoisDecorator(order);
        order = new BaconDecorator(order);
        order = new CheeseDecorator(order);
        order = new CricketDecorator(order);
        order = new FruttiDiMareDecorator(order);
        order = new JalapenoDecorator(order);
        order = new MozzarellaDiBufalaDecorator(order);
        order = new MushroomsDecorator(order);
        order = new OnionDecorator(order);
        order = new PrawnDecorator(order);
        order = new QuatroRodentiDecorator(order);
        order = new SalamiDecorator(order);
        order = new SausagesDecorator(order);
        order = new SpinachDecorator(order);
        order = new ThinBottomDecorator(order);

        //When
        String pizza = order.getIngredients();
        double price = order.getPrice();

        //Then
        assertEquals(78, price);
        assertEquals("thin Pizza bottom covered with delicious tomato sauce, toped with cheese, anchois, bacon, some more cheese, some crispy crickets, mix of seafood, really hot Jalapeno, original Italian Mozzarella Di Bufala, mushrooms, onions, prawns, four minced pork cutlets shaped like rats, just for all Late sir T. Pratchett fans, salami, sausages, spinach", pizza);

    }
}
