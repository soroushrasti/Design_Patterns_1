package com.codewithmosh.iterator;

public class Demo {
    public static void show(){
        var collection= new ProductCollection();
        collection.add(new Product(1,"a"));
        collection.add(new Product(2,"b"));
    }
    var iterator =collection.createIterator();
    while(iterator.hasNext()){
        System.out.println(iterator.current());
        iterator.next();
    }
}
