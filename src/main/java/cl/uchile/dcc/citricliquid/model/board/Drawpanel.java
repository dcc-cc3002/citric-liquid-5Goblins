package cl.uchile.dcc.citricliquid.model.board;

import cl.uchile.dcc.citricliquid.model.units.Player;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents a Draw panel.
 */

public class Drawpanel extends AbstractPanel {

  /**
   * Creates a new Draw panel.
   */

  public Drawpanel() {
    super();
  }

  /**
   * Draws a card from the deck for the player.
   */

  public void drawcardfor(final @NotNull Player player) {
    player.drawCard();
  }

  /**
   * Checks if two objects are equal.
   */

  @Override
  public boolean equals(final Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof final Drawpanel drawpanel)) {
      return false;
    }
    return super.equals(drawpanel);
  }
}
