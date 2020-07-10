package com.springinaction.chapter01.knight;

public class KnightOfTheRoundTable {
    private String name;
    private HolyGrailQuest quest;

    public KnightOfTheRoundTable(String name) {
        this.name = name;
        quest = new HolyGrailQuest(); // a knight gets its own quest
    }

    public HolyGrail embarkOnQuest() throws QuestException {
//        return quest.embark();
        return null;
    }
}

