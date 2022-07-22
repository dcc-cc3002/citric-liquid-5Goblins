package cl.uchile.dcc.citricliquid.model.units;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Test suite for Boss Units.
 */
public class BossUnitTest {
  private BossUnit flyingcastle;
  private BossUnit shifurobot;
  private BossUnit storemanager;

  @BeforeEach
  public void setUp() {
    storemanager = new BossUnit("Store Manager", 8, 3, 2, -1);
    shifurobot = new BossUnit("Shifu Robot", 7, 2, 3, -2);
    flyingcastle = new BossUnit("Flying Castle", 10, 2, 1, -3);
    }

  @Test
  public void constructorTest() {
    final var expectedStoremanager = new BossUnit("Store Manager", 8, 3, 2, -1);
    Assertions.assertEquals(expectedStoremanager, storemanager);
    final var expectedFlyingCastle = new BossUnit("Flying Castle", 10, 2, 1, -3);
    Assertions.assertEquals(expectedFlyingCastle, flyingcastle);
  }

  @Test
  public void testEquals() {
    final var o = new Object();
    Assertions.assertNotEquals(shifurobot, o);
    Assertions.assertEquals(shifurobot, shifurobot);
    final var expectedShifuRobot = new BossUnit("Shifu Robot", 7, 2, 3, -2);
    Assertions.assertEquals(expectedShifuRobot, shifurobot);
    }

  @Test
  public void copyTest() {
    final var expectedShifuRobot = new BossUnit("Shifu Robot", 7, 2, 3, -2);
    final var actualShifuRobot = shifurobot.copy();
    // Checks that the copied player have the same parameters as the original
    Assertions.assertEquals(expectedShifuRobot, actualShifuRobot);
    // Checks that the copied player doesn't reference the same object
    Assertions.assertNotSame(expectedShifuRobot, actualShifuRobot);
  }
}