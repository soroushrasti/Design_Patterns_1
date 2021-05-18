package com.codewithmosh.strategy;

public class Demo {
    public static void show(){
        var client= new ChatClient(new DesEncryption());
        client.send("Hello world");
    }

}
