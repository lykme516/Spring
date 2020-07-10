package com.springinaction.chapter01.knight;

import junit.framework.TestCase;

public class KnightOfTheRoundTableTest extends TestCase {

    public void testEmbarkOnQuest() {
        KnightOfTheRoundTable knight = new KnightOfTheRoundTable("Bedivere");

        try {
            HolyGrail grail = knight.embarkOnQuest();

            assertNotNull(grail);

            assertTrue(grail.isHoly());
        } catch (QuestException e) {
            fail();
        }
    }
}
