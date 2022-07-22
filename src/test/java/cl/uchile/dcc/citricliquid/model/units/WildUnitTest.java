package cl.uchile.dcc.citricliquid.model.units;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Test suite for Wild Units.
 */
public class WildUnitTest {
  private WildUnit chicken;
  private WildUnit seagull;
  private WildUnit roboball;

  @BeforeEach
  public void setUp() {
    chicken = new WildUnit("Chicken", 3, -1, -1, 1);
    seagull = new WildUnit("Seagull", 3, 1, -1, -1);
    roboball = new WildUnit("Robo Ball", 3, -1, 1, -1);
  }

  @Test
  public void constructorTest() {
    final var expectedchicken = new WildUnit("Chicken", 3, -1, -1, 1);
    Assertions.assertEquals(expectedchicken, chicken);
    final var expectedSeagull = new WildUnit("Seagull", 3, 1, -1, -1);
    Assertions.assertEquals(expectedSeagull, seagull);
    Assertions.assertNotEquals(seagull,chicken);
  }

  @Test
  public void testEquals() {
    final var o = new Object();
    Assertions.assertNotEquals(roboball, o);
    Assertions.assertEquals(roboball, roboball);
    final var expectedRoboBall = new WildUnit("Robo Ball", 3, -1, 1, -1);
    Assertions.assertEquals(expectedRoboBall, roboball);
  }

  @Test
  public void copyTest() {
    final var expectedSeagull = new WildUnit("Seagull", 3, 1, -1, -1);
    final var actualSeagull = seagull.copy();
    // Checks that the copied player have the same parameters as the original
    Assertions.assertEquals(expectedSeagull, actualSeagull);
    // Checks that the copied player doesn't reference the same object
    Assertions.assertNotSame(expectedSeagull, actualSeagull);
  }

}