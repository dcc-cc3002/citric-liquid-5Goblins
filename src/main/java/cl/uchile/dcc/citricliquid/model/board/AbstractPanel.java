package cl.uchile.dcc.citricliquid.model.board;

import cl.uchile.dcc.citricliquid.model.units.Player;
import java.util.HashSet;
import java.util.Set;

/**
 * This class represents a panel in the game 99.7% Citric Liquid.
 */

public class AbstractPanel implements Ipanel {

  private final Set<AbstractPanel> nextPanels;
  private final Set<Player> players;


  /**
   * Creates an abstract panel.
   */

  public AbstractPanel() {
    nextPanels = new HashSet<>();
    players = new HashSet<>();

  }

  /**
   * Returns a copy of this panel's next ones.
   */

  public Set<AbstractPanel> getNextPanels() {
    return Set.copyOf(nextPanels);
  }

  /**
   * Adds a new adjacent panel to this one.
   *
   * @param panel the panel to be added.
   */

  public void addNextPanel(final AbstractPanel panel) {
    nextPanels.add(panel);
  }

  /**
   * Returns a copy of this panel's players.
   */

  public Set<Player> getPlayers() {
    return Set.copyOf(players);
  }

  /**
   * Adds a new player to this panel.
   *
   * @param player the player to be added.
   */

  public void addPlayer(final Player player) {
    players.add(player);
  }

  /**
   * Removes a new player to this panel.
   *
   * @param player the player to be removed.
   */

  public void removePlayer(final Player player) {
    players.remove(player);
  }

  /**
   * Checks if two objects are equal.
   */

  @Override
  public boolean equals(final Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof final AbstractPanel abstractpanel)) {
      return false;
    }
    return this.getNextPanels().equals(abstractpanel.getNextPanels())
            && getPlayers().equals(abstractpanel.getPlayers());
  }
}
