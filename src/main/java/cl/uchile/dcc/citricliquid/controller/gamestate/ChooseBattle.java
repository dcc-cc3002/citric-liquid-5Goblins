package cl.uchile.dcc.citricliquid.controller.gamestate;

import cl.uchile.dcc.citricliquid.controller.Controller;

/**
 *ChooseBattle State.
 * State where the player must decide to battle or keep moving.
 */

public class ChooseBattle extends State {
  public ChooseBattle(Controller controller) {
    super(controller);
  }

  @Override
  public void gotoAttackDie() {
    controller.setState(new AttackDie(controller));
  }

  @Override
  public void gotoMovement() {
    controller.setState(new Movement(controller));
  }

}
