package cl.uchile.dcc.citricliquid.controller.gamestate;

import cl.uchile.dcc.citricliquid.controller.Controller;
import cl.uchile.dcc.citricliquid.exceptions.InvalidStateOperationException;

/**
 * State.
 * State pattern is used to determine the phases of a players turn
 * and any transitions between them.
 */

public class State {
  protected final Controller controller;

  /**
   * Sets the controller.
   *
   * @param controller The controller to be set
   */

  public State(Controller controller) {
    this.controller = controller;
  }

  public void gotoBeginTurn() throws InvalidStateOperationException {
    throw new InvalidStateOperationException();
  }

  public void gotoRecovery() throws InvalidStateOperationException {
    throw new InvalidStateOperationException();
  }


  public void gotoReceiveStars() throws InvalidStateOperationException {
    throw new InvalidStateOperationException();
  }

  public void gotoMovementDie() throws InvalidStateOperationException {
    throw new InvalidStateOperationException();
  }

  public void gotoMovement() throws InvalidStateOperationException {
    throw new InvalidStateOperationException();
  }

  public void gotoChoosePath() throws InvalidStateOperationException {
    throw new InvalidStateOperationException();
  }

  public void gotoChooseHome() throws InvalidStateOperationException {
    throw new InvalidStateOperationException();
  }

  public void gotoLandPanel() throws InvalidStateOperationException {
    throw new InvalidStateOperationException();
  }

  public void gotoEndTurn() throws InvalidStateOperationException {
    throw new InvalidStateOperationException();
  }

  public void gotoChooseBattle() throws InvalidStateOperationException {
    throw new InvalidStateOperationException();
  }

  public void gotoAttackDie() throws InvalidStateOperationException {
    throw new InvalidStateOperationException();
  }

  public void gotoChooseDefence() throws InvalidStateOperationException {
    throw new InvalidStateOperationException();
  }

  public void gotoDefenceDie() throws InvalidStateOperationException {
    throw new InvalidStateOperationException();
  }

  public void gotoBattle() throws InvalidStateOperationException {
    throw new InvalidStateOperationException();
  }

  public void gotoCounterAttack() throws InvalidStateOperationException {
    throw new InvalidStateOperationException();
  }

  public void doAction() throws InvalidStateOperationException {
    throw new InvalidStateOperationException();
  }
}