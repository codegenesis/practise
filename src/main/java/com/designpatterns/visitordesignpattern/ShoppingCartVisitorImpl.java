package com.designpatterns.visitordesignpattern;

import com.designpatterns.visitordesignpattern.Book;
import com.designpatterns.visitordesignpattern.Fruit;
import com.designpatterns.visitordesignpattern.ShoppingCartVisitor;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

    @Override
    public int visit(Book book) {
        int cost =0;
        if(book.getPrice() > 50)
            cost = book.getPrice() -5;
        else
            cost = book.getPrice();
            System.out.println(" for isbnNumber " +book.getIsbnNumber() + " the cost is " + cost);
        return cost;
    }

    @Override
    public int visit(Fruit fruit) {

        int cost = fruit.getPricePerKg()*fruit.getWeight();
        System.out.println( fruit.getName() +" the cost of fruit is " +cost);
        return cost;
    }
}
