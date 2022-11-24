package cl.uchile.dcc.citricliquid.controller;

import cl.uchile.dcc.citricliquid.exceptions.InvalidStateOperationException;
import cl.uchile.dcc.citricliquid.model.board.Homepanel;
import cl.uchile.dcc.citricliquid.model.units.Player;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import cl.uchile.dcc.citricliquid.controller.gamestate.*;
import java.util.ArrayList;


import static org.junit.jupiter.api.Assertions.*;

public class ControllerTest {
  private Player suguri;
  private Controller controller;


  @BeforeEach
  public void setUp() {
    controller = new Controller();
    Player suguri = new Player("Suguri",4,3,2,1);
  }

  @Test
  public void stateflowtest() throws InvalidStateOperationException {
    assertTrue(controller.getState() instanceof BeginTurn);
    controller.gorecievestars();
    assertTrue(controller.getState() instanceof ReceiveStars);
    controller.gomovementdie();
    assertTrue(controller.getState() instanceof MovementDie);
    controller.gomovement();
    assertTrue(controller.getState() instanceof Movement);
    controller.golandpanel();
    assertTrue(controller.getState() instanceof LandPanel);
    controller.goendturn();
    assertTrue(controller.getState() instanceof EndTurn);
    controller.gobeginturn();
    assertTrue(controller.getState() instanceof BeginTurn);
    controller.gorecovery();
    assertTrue(controller.getState() instanceof Recovery);
    controller.goendturn();
    assertTrue(controller.getState() instanceof EndTurn);
    controller.gobeginturn();
    controller.gorecievestars();
    controller.gomovementdie();
    controller.gomovement();
    controller.gochoosepath();
    assertTrue(controller.getState() instanceof ChoosePath);
    controller.gomovement();
    assertTrue(controller.getState() instanceof Movement);
    controller.gochoosebattle();
    assertTrue(controller.getState() instanceof ChooseBattle);
    controller.gomovement();
    controller.gochoosebattle();
    controller.goAttackDie();
    assertTrue(controller.getState() instanceof AttackDie);
    controller.gochoosedefence();
    assertTrue(controller.getState() instanceof ChooseDefence);
    controller.godefencedie();
    assertTrue(controller.getState() instanceof DefenceDie);
    controller.gobattle();
    assertTrue(controller.getState() instanceof Battle);
    controller.gocounterattack();
    assertTrue(controller.getState() instanceof CounterAttack);
    controller.goAttackDie();
    assertTrue(controller.getState() instanceof AttackDie);
    controller.gochoosedefence();
    controller.godefencedie();
    controller.gobattle();
    controller.golandpanel();
    controller.goendturn();
    assertTrue(controller.getState() instanceof EndTurn);
    controller.gobeginturn();
    controller.gorecievestars();
    controller.gomovementdie();
    controller.gomovement();
    controller.gochoosehome();
    controller.choosehome();
  }

}