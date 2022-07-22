package cl.uchile.dcc.citricliquid.model.board;

/**
 * This class represents a Neutral Panel.
 */

public class Neutralpanel extends AbstractPanel {

  /**
   * Creates a new Neutral panel.
   */

  public Neutralpanel() {
    super();
  }

  /**
   * Checks if two objects are equal.
   */

  @Override
  public boolean equals(final Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof final Neutralpanel neutralpanel)) {
      return false;
    }
    return super.equals(neutralpanel);
  }
}
