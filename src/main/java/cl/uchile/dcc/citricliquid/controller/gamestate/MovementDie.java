package cl.uchile.dcc.citricliquid.controller.gamestate;

import cl.uchile.dcc.citricliquid.controller.Controller;

/**
 *MovementDie State.
 * State where the player must roll their movement die.
 */

public class MovementDie extends State {
  public MovementDie(Controller controller) {
    super(controller);
  }

  @Override
  public void gotoMovement() {
    controller.setState(new Movement(controller));
  }

  @Override
  public void doAction() {
    controller.movementdie();
  }
}
