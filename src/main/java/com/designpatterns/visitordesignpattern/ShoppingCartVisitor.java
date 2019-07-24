package com.designpatterns.visitordesignpattern;


import com.designpatterns.visitordesignpattern.Book;
import com.designpatterns.visitordesignpattern.Fruit;

public interface ShoppingCartVisitor {

    int visit(Book book);
    int visit(Fruit fruit);

}
