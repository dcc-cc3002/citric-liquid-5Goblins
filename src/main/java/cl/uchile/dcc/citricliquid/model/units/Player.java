package cl.uchile.dcc.citricliquid.model.units;


/**
 * This class represents a player in the game 99.7% Citric Liquid.
 *
 * @author <a>Andres Basaez</a>.
 * @version 1.1.222804
 * @since 1.0
 **/

public class Player extends AbstractUnit {
  private int normaLevel;
  private int victories;
  private String objective;


  /**
   * Creates a new player unit.
   *
   * @param name the character's name.
   * @param hp   the initial (and max) hit points of the character.
   * @param atk  the base damage the character does.
   * @param def  the base defense of the character.
   * @param evd  the base evasion of the character.
   */
  public Player(final String name, final int hp, final int atk, final int def,
                final int evd) {
    super(name, hp, atk, def, evd);
    normaLevel = 1;
    victories = 0;
    objective = "Stars";
  }

  /**
   * Sets newobjective as the objective for a character.
   */
  public void setObjective(String newobjective) {
    objective = newobjective;
  }

  /**
   * Returns the current objective a character.
   */
  public String getObjective() {
    return objective;
  }

  /**
   * Returns the current norma level of a character.
   */
  public int getNormaLevel() {
    return normaLevel;
  }

  /**
   * Performs a norma clear action; the {@code norma} counter increases in 1.
   */
  public void normaClear() {
    normaLevel++;
  }

  /**
   * Increases this player's victory count by an amount.
   */
  public void increaseVictoriesBy(final int amount) {
    victories += amount;
  }

  /**
   * Returns the current victories of a character.
   */
  public int getVictories() {
    return victories;
  }

  /**
   * Draws a card from the deck.
   */

  public void drawCard() {
    System.out.println("Player draws card from deck"); //Placeholder
  }

  /**
   * Returns a copy of this character.
   */
  public Player copy() {
    return new Player(getName(), getMaxHp(), getAtk(), getDef(), getEvd());
  }

  /**
   * Does a norma check on the character.
   */
  public boolean normaCheck() {
    if (getObjective().equals("Stars")) {
      return getNormaLevel() == 1 && getStars() >= 10
              || getNormaLevel() == 2 && getStars() >= 30
              || getNormaLevel() == 3 && getStars() >= 70
              || getNormaLevel() == 4 && getStars() >= 120
              || getNormaLevel() == 5 && getStars() >= 200;
    } else {
      return getNormaLevel() == 2 && getVictories() >= 2
              || getNormaLevel() == 3 && getVictories() >= 5
              || getNormaLevel() == 4 && getVictories() >= 9
              || getNormaLevel() == 5 && getVictories() >= 14;
    }
  }

  @Override
  public boolean equals(final Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof final Player thatplayer)) {
      return false;
    }
    return this.getObjective().equals(thatplayer.getObjective())
            && getNormaLevel() == thatplayer.getNormaLevel()
            && getVictories() == thatplayer.getVictories()
            && super.equals(thatplayer);
  }

}