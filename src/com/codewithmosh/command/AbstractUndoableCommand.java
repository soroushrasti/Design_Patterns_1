package com.codewithmosh.command;

public abstract class AbstractUndoableCommand implements UndoableCommand{
    private VideoEditor video;
    private History history;

    public AbstractUndoableCommand(VideoEditor video, History history) {
        this.video = video;
        this.history = history;
    }

    @Override
    public void exceute() {
        doExcute();
        history.push(this);
    }
    protected abstract void doExcute();
}
