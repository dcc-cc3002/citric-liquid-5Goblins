package cl.uchile.dcc.citricliquid.model.board;

import cl.uchile.dcc.citricliquid.model.units.Player;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class DroppanelTest {
    private Droppanel testDropPanel;
    private final static String PLAYER_NAME = "Suguri";
    private final static int BASE_HP = 4;
    private final static int BASE_ATK = 1;
    private final static int BASE_DEF = -1;
    private final static int BASE_EVD = 2;
    private Player suguri;
    long testSeed;

    @BeforeEach
    void setUp() {
        testDropPanel = new Droppanel();
        suguri = new Player(PLAYER_NAME, BASE_HP, BASE_ATK, BASE_DEF, BASE_EVD);
    }

    @Test
    public void constructorTest() {
        final var expectedDroppanel = new Droppanel();
        assertEquals(expectedDroppanel, testDropPanel);
    }

    @Test
    public void testEquals() {
        final var o = new Object();
        Assertions.assertNotEquals(testDropPanel, o);
        Assertions.assertEquals(testDropPanel, testDropPanel);
        final var expectedDroppanel = new Droppanel();
        Assertions.assertEquals(expectedDroppanel, testDropPanel);
    }

    @RepeatedTest(100)
    public void dropPanelConsistencyTest() {
        int expectedStars = 30;
        suguri.increaseStarsBy(30);
        assertEquals(expectedStars, suguri.getStars());
        final var testRandom = new Random(testSeed);
        suguri.setSeed(testSeed);
        for (int normaLvl = 1; normaLvl <= 6; normaLvl++) {
            final int roll = testRandom.nextInt(6) + 1;
            testDropPanel.applyDropTo(suguri);
            expectedStars = Math.max(expectedStars - roll * normaLvl, 0);
            assertEquals(expectedStars, suguri.getStars(),
                    "Test failed with seed: " + testSeed);
            suguri.normaClear();
        }

    }

}