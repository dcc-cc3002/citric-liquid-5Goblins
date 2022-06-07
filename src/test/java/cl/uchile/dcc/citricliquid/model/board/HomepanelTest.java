package cl.uchile.dcc.citricliquid.model.board;

import cl.uchile.dcc.citricliquid.model.units.Player;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HomepanelTest {
    private Homepanel testHomePanel;
    private Homepanel testHomePanel2;
    private final static String PLAYER_NAME = "Suguri";
    private final static String PLAYER_NAME2 = "Obama";
    private final static int BASE_HP = 4;
    private final static int BASE_ATK = 1;
    private final static int BASE_DEF = -1;
    private final static int BASE_EVD = 2;
    private Player suguri;
    private Player obama;

    @BeforeEach
    void setUp() {
        suguri = new Player(PLAYER_NAME, BASE_HP, BASE_ATK, BASE_DEF, BASE_EVD);
        obama = new Player(PLAYER_NAME2, BASE_HP, BASE_ATK, BASE_DEF, BASE_EVD);

        testHomePanel = new Homepanel(suguri);
        testHomePanel2 = new Homepanel(obama);
    }

    @Test
    public void constructorTest() {
        final var expectedHomepanel = new Homepanel(suguri);
        Assertions.assertEquals(expectedHomepanel, testHomePanel);
    }

    @Test
    public void testEquals() {
        final var o = new Object();
        Assertions.assertNotEquals(testHomePanel, o);
        Assertions.assertEquals(testHomePanel, testHomePanel);
        final var expectedHomepanel = new Homepanel(suguri);
        Assertions.assertEquals(expectedHomepanel, testHomePanel);
    }

    @Test
    public void applyHealToTest() {
        Assertions.assertEquals(suguri.getMaxHp(), suguri.getCurrentHp());
        testHomePanel.applyHealTo(suguri);
        Assertions.assertEquals(suguri.getMaxHp(), suguri.getCurrentHp());
    }

    @Test
    public void checkNormaTest() {
        testHomePanel.checkNorma(suguri); //controlador se preocupara de revisar si se cumple el norma check?
    }

    @Test
    public void stopMovementTest() {
        testHomePanel.stopMovement(); //movimiento no esta implementado todavia
    }
    @Test
    public void getOwnerTest() {
        Assertions.assertEquals(testHomePanel.getOwner(),suguri);
        Assertions.assertEquals(testHomePanel2.getOwner(),obama);
        Assertions.assertEquals(testHomePanel.getOwner(), testHomePanel.getOwner());
        Assertions.assertNotEquals(testHomePanel.getOwner(), testHomePanel2.getOwner());

    }
}