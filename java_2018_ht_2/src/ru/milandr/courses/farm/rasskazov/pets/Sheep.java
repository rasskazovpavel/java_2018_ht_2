package ru.milandr.courses.farm.rasskazov.pets;

import ru.milandr.courses.farm.Animal;
import ru.milandr.courses.farm.Good;
import ru.milandr.courses.farm.rasskazov.goods.Meat;

public class Sheep implements Animal {
    @Override
    public void produceSound() {
        System.out.println("Baa");
    }
    @Override
    public Good produceGoods() {
        return new Meat();
    }
}
