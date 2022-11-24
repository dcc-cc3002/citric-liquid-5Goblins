package cl.uchile.dcc.citricliquid.controller.gamestate;

import cl.uchile.dcc.citricliquid.controller.Controller;

/**
 *DefenceDie State.
 * State where the defending player must roll their defence die.
 */

public class DefenceDie extends State {
  public DefenceDie(Controller controller) {
    super(controller);
  }

  @Override
  public void gotoBattle() {
    controller.setState(new Battle(controller));
  }
}
