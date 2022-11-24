package cl.uchile.dcc.citricliquid.model.board;

import cl.uchile.dcc.citricliquid.model.units.Player;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DrawpanelTest {
    private Drawpanel testDrawPanel;
    private final static String PLAYER_NAME = "Suguri";
    private final static int BASE_HP = 4;
    private final static int BASE_ATK = 1;
    private final static int BASE_DEF = -1;
    private final static int BASE_EVD = 2;
    private Player suguri;

    @BeforeEach
    void setUp() {
        testDrawPanel = new Drawpanel();
        suguri = new Player(PLAYER_NAME, BASE_HP, BASE_ATK, BASE_DEF, BASE_EVD);
    }

    @Test
    public void constructorTest() {
        final var expectedDrawpanel = new Drawpanel();
        assertEquals(expectedDrawpanel, testDrawPanel);
    }

    @Test
    public void drawCardTest() {
        testDrawPanel.drawcardfor(suguri);
    } //Placeholder

    @Test
    public void testEquals() {
        final var o = new Object();
        Assertions.assertNotEquals(testDrawPanel, o);
        Assertions.assertEquals(testDrawPanel, testDrawPanel);
        final var expectedDrawpanel = new Drawpanel();
        Assertions.assertEquals(expectedDrawpanel, testDrawPanel);
    }
}