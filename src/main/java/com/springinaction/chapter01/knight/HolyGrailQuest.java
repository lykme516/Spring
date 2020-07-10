package com.springinaction.chapter01.knight;

public class HolyGrailQuest implements Quest{

    public HolyGrailQuest() {}

    public Object embark() throws QuestException {
        // Do whatever it means to embard on a quest
        return new HolyGrail();
    }
}
