package cl.uchile.dcc.citricliquid.controller.gamestate;

import cl.uchile.dcc.citricliquid.controller.Controller;

/**
 *ChoosePath State.
 * State where the player must choose which branching path to follow.
 */

public class ChoosePath extends State {
  public ChoosePath(Controller controller) {
    super(controller);
  }

  @Override
  public void gotoMovement() {
    controller.setState(new Movement(controller));
  }

}
