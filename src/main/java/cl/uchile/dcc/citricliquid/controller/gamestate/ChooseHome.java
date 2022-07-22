package cl.uchile.dcc.citricliquid.controller.gamestate;

import cl.uchile.dcc.citricliquid.controller.Controller;

/**
 *ChooseHome State.
 * State where the player must choose to stay on their homepanel or keep advancing.
 */

public class ChooseHome extends State {
  public ChooseHome(Controller controller) {
    super(controller);
  }

  @Override
  public void gotoMovement() {
    controller.setState(new Movement(controller));
  }

  @Override
  public void gotoLandPanel() {
    controller.setState(new LandPanel(controller));
  }

  @Override
  public void doAction() {
    controller.choosehome();
  }
}

