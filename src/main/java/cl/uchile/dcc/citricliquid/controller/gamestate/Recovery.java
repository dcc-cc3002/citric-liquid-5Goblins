package cl.uchile.dcc.citricliquid.controller.gamestate;

import cl.uchile.dcc.citricliquid.controller.Controller;

/**
 *Recovery State.
 * State where the player needs to recover from a knockout.
 */

public class Recovery extends State {
  public Recovery(Controller controller) {
    super(controller);
  }

  public void gotoReceiveStars() {
    controller.setState(new ReceiveStars(controller));
  }

  public void gotoEndTurn() {
    controller.setState(new EndTurn(controller));
  }

}

