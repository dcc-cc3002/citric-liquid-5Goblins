package cl.uchile.dcc.citricliquid.model.board;


import cl.uchile.dcc.citricliquid.model.units.Player;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

class NeutralpanelTest {
    private Neutralpanel testNeutralPanel;
    private final static String PLAYER_NAME = "Suguri";
    private final static String PLAYER_NAME2 = "Obama";
    private final static int BASE_HP = 4;
    private final static int BASE_ATK = 1;
    private final static int BASE_DEF = -1;
    private final static int BASE_EVD = 2;


    @BeforeEach
    void setUp() {
        testNeutralPanel = new Neutralpanel();
    }


    @Test
    public void constructorTest() {
        final Neutralpanel expectedNeutralpanel = new Neutralpanel();
        assertEquals(expectedNeutralpanel, testNeutralPanel);
    }


    @Test
    public void testEquals() {
        final var o = new Object();
        Assertions.assertNotEquals(testNeutralPanel, o);
        Assertions.assertEquals(testNeutralPanel, testNeutralPanel);
        final Neutralpanel expectedNeutralpanel = new Neutralpanel();
        Assertions.assertEquals(expectedNeutralpanel, testNeutralPanel);
    }

    @Test
    public void nextPanelTest() {
        assertTrue(testNeutralPanel.getNextPanels().isEmpty());
        final Neutralpanel expectedPanel1 = new Neutralpanel();
        final Droppanel expectedPanel2 = new Droppanel();

        testNeutralPanel.addNextPanel(expectedPanel1);
        assertEquals(1, testNeutralPanel.getNextPanels().size());

        testNeutralPanel.addNextPanel(expectedPanel2);
        assertEquals(2, testNeutralPanel.getNextPanels().size());

        testNeutralPanel.addNextPanel(expectedPanel2);
        assertEquals(2, testNeutralPanel.getNextPanels().size());

        assertEquals(Set.of(expectedPanel1, expectedPanel2),
                testNeutralPanel.getNextPanels());
    }

    @Test
    public void addPlayerTest(){
        Player suguri = new Player(PLAYER_NAME, BASE_HP, BASE_ATK, BASE_DEF, BASE_EVD);
        Player obama = new Player(PLAYER_NAME2, BASE_HP, BASE_ATK, BASE_DEF, BASE_EVD);
        assertTrue(testNeutralPanel.getPlayers().isEmpty());

        testNeutralPanel.addPlayer(suguri);
        assertEquals(1,testNeutralPanel.getPlayers().size());

        testNeutralPanel.addPlayer(obama);
        assertEquals(2,testNeutralPanel.getPlayers().size());

        testNeutralPanel.removePlayer(suguri);
        assertEquals(1, testNeutralPanel.getPlayers().size());

        testNeutralPanel.removePlayer(suguri);
        assertNotEquals((0), testNeutralPanel.getPlayers().size());

        testNeutralPanel.addPlayer(obama);
        assertNotEquals(2,testNeutralPanel.getPlayers().size());
    }
}