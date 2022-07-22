package cl.uchile.dcc.citricliquid.model.board;


/**
 * This class represents a Boss Panel.
 */
public class Bosspanel extends AbstractPanel {

  /**
   * Creates a new Boss panel.
   */

  public Bosspanel() {
    super();
  }

  /**
   * Player encounters a Boss.
   */

  public void bossEncounter() {
    System.out.println("Player encounters a boss!");  //Placeholder
  }

  /**
   * Checks if two objects are equal.
   */

  @Override
  public boolean equals(final Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof final Bosspanel bosspanel)) {
      return false;
    }
    return super.equals(bosspanel);
  }
}

