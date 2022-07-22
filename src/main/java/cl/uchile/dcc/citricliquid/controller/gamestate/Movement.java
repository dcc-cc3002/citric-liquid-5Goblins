package cl.uchile.dcc.citricliquid.controller.gamestate;

import cl.uchile.dcc.citricliquid.controller.Controller;

/**
 *Movement State.
 * State where the player moves along the board.
 */

public class Movement extends State {
  public Movement(Controller controller) {
    super(controller);
  }

  @Override
  public void gotoChoosePath() {
    controller.setState(new ChoosePath(controller));
  }

  @Override
  public void gotoChooseBattle() {
    controller.setState(new ChooseBattle(controller));
  }

  @Override
  public void gotoChooseHome() {
    controller.setState(new ChooseHome(controller));
  }

  @Override
  public void gotoLandPanel() {
    controller.setState(new LandPanel(controller));
  }
}