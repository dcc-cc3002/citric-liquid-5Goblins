package cl.uchile.dcc.citricliquid.controller.gamestate;

import cl.uchile.dcc.citricliquid.controller.Controller;

/**
 *AttackDie State.
 * State where the attacking player must roll their attack die.
 */

public class AttackDie extends State {
  public AttackDie(Controller controller) {
    super(controller);
  }

  @Override
  public void gotoChooseDefence() {
    controller.setState(new ChooseDefence(controller));
  }
}
