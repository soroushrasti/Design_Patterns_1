package com.codewithmosh.template;

public class chatWindow extends Window{

    @Override
    protected void before(){
        System.out.println("Before closing");
    }

    @Override
    protected void after(){
        System.out.println("After closing");
    }


}
