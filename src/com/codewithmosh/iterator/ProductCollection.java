package com.codewithmosh.iterator;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
  private List<Product> products = new ArrayList<>();

  public void add(Product product) {
    products.add(product);
  }
  public Iterator createIterator(){
    return new ListIterator(collection:this);
  }
  private class ListIterator implements Iterator{
    private ProductCollection collection;

    @java.lang.Override
    public boolean hasNext() {
      return (index<collection.products.size());
    }

    @java.lang.Override
    public Product current() {
      return collection.products.get(index);
    }

    @java.lang.Override
    public void next() {
      index++;
    }

    private  int index;
    public ListIterator( ProductCollection collection){this.collection=collection}

  }
}
