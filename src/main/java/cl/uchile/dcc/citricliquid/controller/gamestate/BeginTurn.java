package cl.uchile.dcc.citricliquid.controller.gamestate;

import cl.uchile.dcc.citricliquid.controller.Controller;

/**
 *BeginTurn State.
 * State that represents the start of a players turn.
 */

public class BeginTurn extends State {
  public BeginTurn(Controller controller) {
    super(controller);
  }

  @Override
  public void gotoRecovery() {
    controller.setState(new Recovery(controller));
  }

  @Override
  public void gotoReceiveStars() {
    controller.setState(new ReceiveStars(controller));
  }
}
