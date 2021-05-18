package com.codewithmosh.strategy;

public class AesEncryption implements Encryption{
    @java.lang.Override
    public void encrypt(String message) {
        System.out.println("Encrypting message using AES");
    }
}
