package cl.uchile.dcc.citricliquid.model.board;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EncounterpanelTest {
    private Encounterpanel testEncounterPanel;

    @BeforeEach
    void setUp() {
        testEncounterPanel = new Encounterpanel();
    }

    @Test
    public void constructorTest() {
        final var expectedEncounterpanel = new Encounterpanel();
        assertEquals(expectedEncounterpanel, testEncounterPanel);
    }

    @Test
    public void testEquals() {
        final var o = new Object();
        Assertions.assertNotEquals(testEncounterPanel, o);
        Assertions.assertEquals(testEncounterPanel, testEncounterPanel);
        final var expectedEncounterpanel = new Encounterpanel();
        Assertions.assertEquals(expectedEncounterpanel, testEncounterPanel);

    }

    @Test
    public void wildEncounterTest() {
        testEncounterPanel.wildEncounter(); //Placeholder
    }

}