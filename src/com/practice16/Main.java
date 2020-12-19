package com.practice16;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws OrderAlreadyAddedException, IllegalTableNumber {
        Item ja = new Drink("Сок", "яблочный", 200);
        Item jc = new Drink("Сок", "вишнёвый", 100);
        Item sal = new Dish("Салат", "цезарь", 500);
        Item san = new Dish("Сэндвич", "с курицей", 150);
        Item sal1 = new Dish("Салат", "греческий", 200);

        InternetOrder i = new InternetOrder(new Item[]{ja,sal,san,sal1});
        System.out.println(i.getNodeByIndex(1).value);
        System.out.println(i.itemQuantity());
        i.add(jc);
        System.out.println((Arrays.toString(i.names_without_equals())));
        System.out.println(i.removeAll("Салат"));
        System.out.println(Arrays.toString(i.itemsNames()));
        System.out.println(i.costTotal());
        System.out.println(Arrays.toString(i.sort_by_price()));

        System.out.println("---------");

        RestaurantOrder a = new RestaurantOrder();
        a.add(san);
        a.add(sal);
        a.add(jc);
        for(Item it: a.sort_by_price())
            System.out.print(it.getName() + " " + it.getCost()+"; ");
        System.out.println("\n" + a.costTotal());
        for(Item it: a.getItems())
            System.out.print(it.getName() + ", " + it.getCost()+ "; ");
        System.out.println("\n" + Arrays.toString(a.itemsNames()));
        a.removeAll("Салат");
        System.out.println(a.itemQuantity());
        System.out.println(a.itemQuantity("Сэндвич"));
        RestaurantOrder b = new RestaurantOrder();
        b.add(ja);
        b.add(sal1);

        System.out.println("---------");

        OrderManager ordm = new OrderManager();
        ordm.add(a, 1);
        ordm.add(b, 2);
        System.out.println(Arrays.toString(ordm.freeTableNumbers()));
        System.out.println(ordm.dishQuantity("Салат"));
        System.out.println(Arrays.toString(ordm.getOrder(1).itemsNames()));
        System.out.println(ordm.orderCostSummary());
        for(RestaurantOrder ord: ordm.getOrders()){
            System.out.println(Arrays.toString(ord.itemsNames()));
        }
        ordm.removeOrder(1);
        System.out.println(ordm.orderCostSummary());
        ordm.addDish(sal, 2);
        System.out.println(ordm.orderCostSummary());

        System.out.println("---------");

        InternetOrder i1 = new InternetOrder(new Item[]{jc,sal,san,sal1});
        InternetOrder i2 = new InternetOrder(new Item[]{ja,sal});
        ordm.add("пр Ленина 100", i1);
        ordm.add("пр Ленина 110", i2);
        System.out.println(Arrays.toString(ordm.getOrder("пр Ленина 100").itemsNames()));
        ordm.removeOrder("пр Ленина 110");
        ordm.addDish("пр Ленина 100", ja);
        for(InternetOrder ord: ordm.get_int_ord())
            System.out.println(Arrays.toString(ord.sort_by_price()));
        System.out.println(ordm.int_ord_sum());
        System.out.println(ordm.func("Салат"));
    }
}