package com.codewithmosh.command;

public class Demo {
    public static void show(){
        var history= new History();
        var video=new VideoEditor();

        var setContrastCommand= new setContrastCommand(video, history,12);
        setContrastCommand.exceute();

        var undoCommand= new UndoCommand(history);
        undoCommand.exceute();



    }

}
