package cl.uchile.dcc.citricliquid.controller.gamestate;

import cl.uchile.dcc.citricliquid.controller.Controller;

/**
 *LandPanel State.
 * State that represents the end of a players movement
 * and the activation of the panel they landed on.
 */

public class LandPanel extends State {
  public LandPanel(Controller controller) {
    super(controller);
  }

  @Override
  public void gotoEndTurn() {
    controller.setState(new EndTurn(controller));
  }

  @Override
  public void gotoAttackDie() {
    controller.setState(new AttackDie(controller));
  }
}