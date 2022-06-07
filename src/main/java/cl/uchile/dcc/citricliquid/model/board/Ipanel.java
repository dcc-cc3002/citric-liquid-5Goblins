package cl.uchile.dcc.citricliquid.model.board;

import cl.uchile.dcc.citricliquid.model.units.Player;
import java.util.Set;

/**
 * Interface for methods applicable to all panel types.
 */

public interface Ipanel {

  /**
   * Returns a copy of this panel's next ones.
   */

  Set<AbstractPanel> getNextPanels();

  /**
   * Adds a new adjacent panel to this one.
   *
   * @param panel the panel to be added.
   */

  void addNextPanel(final AbstractPanel panel);

  /**
   * Returns a copy of this panel's players.
   */

  Set<Player> getPlayers();

  /**
   * Adds a new player to this panel.
   *
   * @param player the player to be added.
   */

  void addPlayer(final Player player);

  /**
   * Removes a new player to this panel.
   *
   * @param player the player to be removed.
   */

  void removePlayer(final Player player);

  /**
   * Checks if two objects are equal.
   */

  boolean equals(final Object o);
}
