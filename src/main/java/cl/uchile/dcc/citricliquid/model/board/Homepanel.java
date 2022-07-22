package cl.uchile.dcc.citricliquid.model.board;

import cl.uchile.dcc.citricliquid.model.units.Player;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents a Home Panel.
 */

public class Homepanel extends AbstractPanel {
  Player owner;
  /**
   * Creates a new Home panel.
   *
   */

  public Homepanel() {
    super();
    owner = null;
  }

  /**
   * Sets the owner of the home panel.
   */

  public void setOwner(Player player) {
    this.owner = player;
  }

  /**
   * Returns the owner of the home panel.
   */

  public Player getOwner() {
    return owner;
  }

  /**
   * Restores a player's HP in 1.
   */

  public void applyHealTo(final @NotNull Player player) {
    player.setCurrentHp(player.getCurrentHp() + 1);
  }

  /**
   * Lets player end their turn prematurely on their home panel.
   */

  public void stopMovement() {
    System.out.println("Player has stopped on their Home panel!");
  }

  /**
   * Checks the player's norma and leveling requirements.
   */

  public void checkNorma(final @NotNull Player player) {
    player.normaCheck();
  }

  /**
   * Checks if two objects are equal.
   */

  @Override
  public boolean equals(final Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof final Homepanel homepanel)) {
      return false;
    }
    return getOwner().equals(homepanel.getOwner())
            && super.equals(homepanel);
  }
}
