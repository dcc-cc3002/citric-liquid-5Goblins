package cl.uchile.dcc.citricliquid.controller.gamestate;

import cl.uchile.dcc.citricliquid.controller.Controller;

/**
 *CounterAttack State.
 * State where the defending player can choose to initiate a counterattack.
 */

public class CounterAttack extends State {
  public CounterAttack(Controller controller) {
    super(controller);
  }

  @Override
  public void gotoAttackDie() {
    controller.setState(new AttackDie(controller));
  }
}
