package cl.uchile.dcc.citricliquid.model.board;

import cl.uchile.dcc.citricliquid.model.units.Player;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents a Bonus Panel.
 */

public class Bonuspanel extends AbstractPanel {

  /**
   * Creates a new bonus panel.
   */

  public Bonuspanel() {
    super();
  }

  /**
   * Increases the player's star count by the D6
   * roll multiplied by the maximum between the player's
   * norma level and three.
   */
  public void applyBonusTo(final @NotNull Player player) {
    player.increaseStarsBy(player.roll() * Math.min(player.getNormaLevel(), 3));
  }

  /**
   * Checks if two objects are equal.
   */

  @Override
  public boolean equals(final Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof final Bonuspanel bonuspanel)) {
      return false;
    }
    return super.equals(bonuspanel);
  }
}
