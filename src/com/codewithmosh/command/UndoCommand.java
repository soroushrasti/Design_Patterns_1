package com.codewithmosh.command;

public class UndoCommand implements Command{
    private History history;

    public UndoCommand(History history) {
        this.history = history;
    }

    @Override
    public void exceute() {
        if(history.size()>0){
            history.pop().unexcuted();
        }
    }
}
