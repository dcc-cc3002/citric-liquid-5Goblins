package cl.uchile.dcc.citricliquid.model.board;

import cl.uchile.dcc.citricliquid.model.units.Player;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents a Drop Panel.
 */

public class Droppanel extends AbstractPanel {

  /**
   * Creates a new Drop panel.
   */

  public Droppanel() {
    super();
  }

  /**
   * Reduces the player's star count by the D6 roll multiplied by the player's norma level.
   */
  public void applyDropTo(final @NotNull Player player) {
    player.reduceStarsBy(player.roll() * player.getNormaLevel());
  }

  /**
   * Checks if two objects are equal.
   */

  @Override
  public boolean equals(final Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof final Droppanel droppanel)) {
      return false;
    }
    return super.equals(droppanel);
  }

}
