package cl.uchile.dcc.citricliquid.controller.gamestate;

import cl.uchile.dcc.citricliquid.controller.Controller;

/**
 *ChooseDefence State.
 * State where the defending unit must choose whether to defend or evade.
 */

public class ChooseDefence extends State {
  public ChooseDefence(Controller controller) {
    super(controller);
  }

  @Override
  public void gotoDefenceDie() {
    controller.setState(new DefenceDie(controller));
  }
}
