package cl.uchile.dcc.citricliquid.controller.gamestate;

import cl.uchile.dcc.citricliquid.controller.Controller;

/**
 *Endturn State.
 * State that represents the end of a players turn.
 */

public class EndTurn extends State {
  public EndTurn(Controller controller) {
    super(controller);
  }

  @Override
  public void gotoBeginTurn() {
    controller.setState(new BeginTurn(controller));
  }

  @Override
  public void doAction() {
    controller.endTurn();
  }
}
