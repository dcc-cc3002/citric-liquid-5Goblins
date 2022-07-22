package cl.uchile.dcc.citricliquid.controller.gamestate;

import cl.uchile.dcc.citricliquid.controller.Controller;

/**
 *ReceiveStars State.
 * State where the players is awarded stars.
 */

public class ReceiveStars extends State {
  public ReceiveStars(Controller controller) {
    super(controller);
  }

  @Override
  public void gotoMovementDie() {
    controller.setState(new MovementDie(controller));
  }

  @Override
  public void doAction() {
    controller.awardstars();
  }
}
