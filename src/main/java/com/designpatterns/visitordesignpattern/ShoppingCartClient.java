package com.designpatterns.visitordesignpattern;


//https://www.journaldev.com/1769/visitor-design-pattern-java
//Illustrates the use of Visitor Design Pattern

public class ShoppingCartClient {

    public static void main(String[] args){

        ItemElement[] items = new ItemElement[]{new Book(20,"1234"), new Book(30, "5678"),
                                 new Fruit(2, 1, "Banana"), new Fruit(3, 2, "Apple")};

        int total = calculatePrice(items);
    }

    private static int calculatePrice(ItemElement[] items) {

        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        int sum =0;
        for (ItemElement item: items)
            sum += item.accept(visitor);

        return sum;
    }
}
