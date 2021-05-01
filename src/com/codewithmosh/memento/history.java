package com.codewithmosh.memento;
import java.util.ArrayDeque;
import java.util.Deque;

public class history {

    private Deque <DocumentMomento> momentos = new ArrayDeque<>();

    public void push(DocumentMomento momento){
        momentos.push(momento);
    }
    public DocumentMomento pop(){
        return momentos.pop()
    }
}
