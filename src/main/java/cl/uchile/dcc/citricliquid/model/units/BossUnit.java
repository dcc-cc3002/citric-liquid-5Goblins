package cl.uchile.dcc.citricliquid.model.units;

/**
 * This class represents a Boss Unit in the game 99.7% Citric Liquid.
 **/

public class BossUnit extends AbstractUnit {
  /**
   * Creates a new boss unit.
   *
   * @param name the unit's name.
   * @param hp   the initial (and max) hit points of the unit.
   * @param atk  the base damage the unit does.
   * @param def  the base defense of the unit.
   * @param evd  the base evasion of the unit.
   */
  public BossUnit(String name, int hp, int atk, int def, int evd) {
    super(name, hp, atk, def, evd);
  }

  /**
   * Returns a copy of this character.
   */
  public BossUnit copy() {
    return new BossUnit(getName(), getMaxHp(), getAtk(), getDef(), getEvd());
  }

  @Override
  public boolean equals(final Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof final BossUnit thatbossunit)) {
      return false;
    }
    return super.equals(thatbossunit);
  }
}
