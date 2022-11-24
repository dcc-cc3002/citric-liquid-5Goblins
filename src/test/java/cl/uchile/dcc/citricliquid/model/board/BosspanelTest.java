package cl.uchile.dcc.citricliquid.model.board;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BosspanelTest {
    private Bosspanel testBossPanel;

    @BeforeEach
    void setUp() {
        testBossPanel = new Bosspanel();
    }

    @Test
    public void constructorTest() {
        final var expectedBosspanel = new Bosspanel();
        assertEquals(expectedBosspanel, testBossPanel);
    }

    @Test
    public void testEquals() {
        final var o = new Object();
        Assertions.assertNotEquals(testBossPanel, o);
        Assertions.assertEquals(testBossPanel, testBossPanel);
        final var expectedBosspanel = new Bosspanel();
        Assertions.assertEquals(expectedBosspanel, testBossPanel);

    }

    @Test
    public void bossEncounterTest() {
        testBossPanel.bossEncounter(); //Placeholder
    }
}