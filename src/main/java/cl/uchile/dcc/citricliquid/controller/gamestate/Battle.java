package cl.uchile.dcc.citricliquid.controller.gamestate;

import cl.uchile.dcc.citricliquid.controller.Controller;

/**
 *Battle State.
 * State where the player and some other unit do battle.
 */

public class Battle extends State {
  public Battle(Controller controller) {
    super(controller);
  }

  @Override
  public void gotoLandPanel() {
    controller.setState(new LandPanel(controller));
  }

  @Override
  public void gotoCounterAttack() {
    controller.setState(new CounterAttack(controller));
  }
}
