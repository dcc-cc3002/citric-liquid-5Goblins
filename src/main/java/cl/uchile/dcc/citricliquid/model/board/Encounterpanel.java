package cl.uchile.dcc.citricliquid.model.board;


/**
 * This class represents a Encounter Panel.
 */

public class Encounterpanel extends AbstractPanel {

  /**
   * Creates a new Encounter panel.
   */

  public Encounterpanel() {
    super();
  }

  /**
   * Player encounters a Wild Unit.
   */

  public void wildEncounter() {
    System.out.println("Player encounters a Wild Unit!");  //Placeholder
  }

  /**
   * Checks if two objects are equal.
   */

  @Override
  public boolean equals(final Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof final Encounterpanel encounterpanel)) {
      return false;
    }
    return super.equals(encounterpanel);
  }
}