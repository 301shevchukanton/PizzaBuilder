/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzabuilderdemo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author antonshevchuk
 */
public class PizzaBuilderDemo {

    
    public static void main(String[] args) {
        PizzaBuilder pizzaBuilder = new PizzaBuilder();
        pizzaBuilder.addFlavors(new Food("olives"));
        pizzaBuilder.addFlavors(new Food("cheese"));
        pizzaBuilder.setName("Margarita");
        pizzaBuilder.setSize(15);
        pizzaBuilder.build().getPizza();
    }

    static class PizzaBuilder {

        private String name;
        private int size;
        private List<Food> flavors = new ArrayList<>();

        public void setName(String name) {
            this.name = name;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public void addFlavors(Food flavor) {
            this.flavors.add(flavor);
        }

        public Pizza build() {
            return new Pizza(this.name, this.size, this.flavors);
        }
    }

    static class Pizza {

        String name;
        int size;
        List<Food> flavors;

        public Pizza(String name, int size, List<Food> flavors) {
            this.name = name;
            this.size = size;
            this.flavors = flavors;
        }

        public void getPizza() {
            System.out.println("Your Pizza here: " + name +" " + size +" "+ flavors.toString());
        }

    }

    private static class Food {

        private final String name;

        public Food(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return this.name;
        }
    }
}
