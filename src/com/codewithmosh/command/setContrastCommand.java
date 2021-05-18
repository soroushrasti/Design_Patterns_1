package com.codewithmosh.command;

public class setContrastCommand extends AbstractUndoableCommand{
    private float contrast;
    private float preContrast;

    public setContrastCommand(VideoEditor video, History history, float contrast) {
        super(video, history);
        preContrast=video.getContrast();
        this.contrast = contrast;
    }



    @Override
    protected void doExcute() {
         video.setContrast(contrast);
    }

    @Override
    public void unexcuted() {
       video.setContrast(preContrast);
    }
}
