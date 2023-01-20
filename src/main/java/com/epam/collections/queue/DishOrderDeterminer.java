package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        Queue<Integer> dishes = new LinkedList<>();
        List<Integer> order = new ArrayList<>();
        for (int i = 1; i <= numberOfDishes; i++) {
            dishes.offer(i);
        }

        int i = 1;
        while (!dishes.isEmpty()) {
            int dish = dishes.poll();
            if (i % everyDishNumberToEat == 0) {
                order.add(dish);
            } else {
                dishes.offer(dish);
            }
            i++;
        }
        return order;
    }
}
