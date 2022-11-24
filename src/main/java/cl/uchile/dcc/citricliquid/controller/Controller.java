package cl.uchile.dcc.citricliquid.controller;

import cl.uchile.dcc.citricliquid.controller.gamestate.BeginTurn;
import cl.uchile.dcc.citricliquid.controller.gamestate.State;
import cl.uchile.dcc.citricliquid.exceptions.InvalidStateOperationException;
import cl.uchile.dcc.citricliquid.model.board.AbstractPanel;
import cl.uchile.dcc.citricliquid.model.board.Bonuspanel;
import cl.uchile.dcc.citricliquid.model.board.Bosspanel;
import cl.uchile.dcc.citricliquid.model.board.Drawpanel;
import cl.uchile.dcc.citricliquid.model.board.Droppanel;
import cl.uchile.dcc.citricliquid.model.board.Encounterpanel;
import cl.uchile.dcc.citricliquid.model.board.Homepanel;
import cl.uchile.dcc.citricliquid.model.board.Ipanel;
import cl.uchile.dcc.citricliquid.model.board.Neutralpanel;
import cl.uchile.dcc.citricliquid.model.units.BossUnit;
import cl.uchile.dcc.citricliquid.model.units.Player;
import cl.uchile.dcc.citricliquid.model.units.WildUnit;
import java.util.ArrayList;
import java.util.Random;



/**
 *Game controller.
 * Creates and keeps track of elements for the board, units, and gamestates.
 */

public class Controller {
  private State state;
  private ArrayList<AbstractPanel> panels;
  private ArrayList<Player> players;
  private int currentchapter;
  private int currentrecovery;
  private Player currentplayer;
  private boolean summonedboss;
  private int movementcounter;
  private Player attackingplayer;
  private Player defendingplayer;
  private Ipanel currentpanel;


  /**
   *Constructor for the game controller.
   *
   */
  public Controller() {
    this.currentplayer = null;
    players = new ArrayList<>();
    panels = new ArrayList<>();
    currentchapter = 1;
    this.setState(new BeginTurn(this));
    currentrecovery = 6;
    summonedboss = false;
  }

  /**
   * Sets the current state.
   */
  public void setState(State state) {
    this.state = state;
  }

  /**
   * Gets the current state.
   */
  public State getState() {
    return this.state;
  }

  /**
   * Goes to AttackDie state.
   */
  public void goAttackDie() throws InvalidStateOperationException {
    state.gotoAttackDie();
  }

  /**
   * Goes to Battle state.
   */
  public void gobattle() throws InvalidStateOperationException {
    state.gotoBattle();
  }

  /**
   * Goes to BeginTurn state.
   */
  public void gobeginturn() throws InvalidStateOperationException {
    state.gotoBeginTurn();
  }

  /**
   * Goes to Choosebattle state.
   */
  public void gochoosebattle() throws InvalidStateOperationException {
    state.gotoChooseBattle();
  }

  /**
   * Goes to Choosedefence state.
   */
  public void gochoosedefence() throws InvalidStateOperationException {
    state.gotoChooseDefence();
  }

  /**
   * Goes to choosehome state.
   */
  public void gochoosehome() throws InvalidStateOperationException {
    state.gotoChooseHome();
  }

  /**
   * Goes to choosepath state.
   */
  public void gochoosepath() throws InvalidStateOperationException {
    state.gotoChoosePath();
  }

  /**
   * Goes to counterattack state.
   */
  public void gocounterattack() throws InvalidStateOperationException {
    state.gotoCounterAttack();
  }

  /**
   * Goes to defencedie state.
   */
  public void godefencedie() throws InvalidStateOperationException {
    state.gotoDefenceDie();
  }

  /**
   * Goes to endturn state.
   */
  public void goendturn() throws InvalidStateOperationException {
    state.gotoEndTurn();
  }

  /**
   * Goes to LandPanel state.
   */
  public void golandpanel() throws InvalidStateOperationException {
    state.gotoLandPanel();
  }

  /**
   * Goes to Movement state.
   */
  public void gomovement() throws InvalidStateOperationException {
    state.gotoMovement();
  }

  /**
   * Goes to MovementDie state.
   */
  public void gomovementdie() throws InvalidStateOperationException {
    state.gotoMovementDie();
  }


  /**
   * Goes to ReceiveStars state.
   */
  public void gorecievestars() throws InvalidStateOperationException {
    state.gotoReceiveStars();
  }

  /**
   * Goes to recovery state.
   */
  public void gorecovery() throws InvalidStateOperationException {
    state.gotoRecovery();
  }

  /**
   * Creates a player character.
   */

  public void createPlayer(String name, int hp, int atk, int def, int evd, Homepanel homepanel) {
    Player player = new Player(name, hp, atk, def, evd);
    if (players.size() == 0) {
      this.currentplayer = player;
    }
    homepanel.setOwner(player);
    players.add(player);
  }


  /**
   * Creates a Wild Unit.
   */
  public WildUnit createWildUnit(String name, int hp, int atk, int def, int evd) {
    WildUnit wildunit = new WildUnit(name, hp, atk, def, evd);
    return wildunit;
  }

  /**
   * Creates a Boss Unit.
   */
  public BossUnit createBossUnit(String name, int hp, int atk, int def, int evd) {
    BossUnit bossunit = new BossUnit(name, hp, atk, def, evd);
    this.summonedboss = true;
    return bossunit;
  }


  /**
   * getChapter.
   *returns the current chapter
   */
  public int getChapter() {
    return currentchapter;
  }

  /**
   * getMovementcounter.
   *returns the current movement counter
   */
  public int getMovementcounter() {
    return movementcounter;
  }

  /**
   * setMovementcounter.
   *sets the movement counter
   */
  public void setMovementcounter(int num) {
    movementcounter = num;
  }

  /**
   * setattacker.
   *sets the attacking player
   */
  public void setattackingplayer(Player player) {
    attackingplayer = player;
  }

  /**
   * getattacker.
   *gets the current attacker
   */
  public Player getattackingplayer() {
    return attackingplayer;
  }

  /**
   * setdefender.
   *sets the defending player
   */
  public void setdefendingplayer(Player player) {
    defendingplayer = player;
  }

  /**
   * getdefendingplayer.
   *returns the current defender
   */
  public Player getdefendingplayer() {
    return defendingplayer;
  }

  /**
   * advancechapter.
   *goes to the next chapter
   */
  public void advancechapter() {
    currentchapter++;
  }

  /**
   * getrecovery.
   *gets the current recovery threshold
   */
  public int getrecovery() {
    return currentrecovery;
  }

  /**
   * decreaserecovery.
   *decreases the recovery threshold by 1
   */
  public void decreaserecovery() {
    if (currentrecovery > 0) {
      currentrecovery--;
    }
  }

  /**
   * setObjectiveStars.
   *sets a players objective to stars
   */
  public void setObjectiveStars(Player player) {
    player.setObjective("Stars");
  }

  /**
   * setObjectiveVictories.
   *sets a players objective to victories
   */
  public void setObjectiveVictories(Player player) {
    player.setObjective("Victories");
  }

  /**
   * setCurrentPlayer.
   *sets the player currently taking their turn
   */
  public void setcurrentplayer(Player player) {
    this.currentplayer = player;
  }

  /**
   * getCurrentPlayer.
   *sets the player currently taking their turn
   */
  public Player getcurrentplayer() {
    return this.currentplayer;
  }

  /**
   * Creates a Bonuspanel.
   *and adds it to the board
   */
  public void createBonuspanel() {
    panels.add(new Bonuspanel());
  }

  /**
   * Creates a Bosspanel.
   *and adds it to the board
   */
  public void createBosspanel() {
    panels.add(new Bosspanel());
  }

  /**
   * Creates a Drawpanel.
   *and adds it to the board
   */
  public void createDrawpanel() {
    panels.add(new Drawpanel());
  }

  /**
   * Creates a Droppanel.
   *and adds it to the board
   */
  public void createDroppanel() {
    panels.add(new Droppanel());
  }

  /**
   * Creates an Encounterpanel.
   *and adds it to the board
   */
  public void createEncounterpanel() {
    panels.add(new Encounterpanel());
  }

  /**
   * Creates a Homepanel.
   *and adds it to the board
   */
  public void createhomepanel() {
    panels.add(new Homepanel());
  }

  /**
   * Creates a Neutralpanel.
   *and adds it to the board
   */
  public void createneutralpanel() {
    panels.add(new Neutralpanel());
  }

  /**
   * endTurn.
   *ends the current player's turn and sets up a new one
   */
  public void endTurn() {
    int j = players.indexOf(currentplayer);
    j++;
    if (j == 4) {
      advancechapter();
      setcurrentplayer(players.get(0));
      decreaserecovery();
    } else {
      setcurrentplayer(players.get(j));
    }
    try {
      gobeginturn();
    } catch (InvalidStateOperationException e) {
      e.printStackTrace();
    }
  }

  /**
   * beginTurn.
   *Checks if the current player is KO'd, and sends the controller to the
   * corresponding state
   */
  public void beginTurn() {
    if (currentplayer.getCurrentHp() == 0) {
      try {
        gorecovery();
      } catch (InvalidStateOperationException e) {
        e.printStackTrace();
      }
    } else {
      try {
        gorecievestars();
      } catch (InvalidStateOperationException e) {
        e.printStackTrace();
      }
    }
  }

  /**
   * rolldie.
   *rolls a d6
   */
  public int rolldie() {
    Random dice = new Random();
    int roll = dice.nextInt(5) + 1;
    return roll;
  }

  /**
   * recover.
   *recovery attempt
   */
  public void recover() {
    int dieroll = rolldie();
    if (dieroll >= getrecovery()) {
      try {
        gorecievestars();
      } catch (InvalidStateOperationException e) {
        e.printStackTrace();
      }
    } else {
      try {
        goendturn();
      } catch (InvalidStateOperationException e) {
        e.printStackTrace();
      }
    }
  }

  /**
   * awardstars.
   *Gives current player this chapters stars at the start of their turn
   */
  public void awardstars() {
    int currentaward = (currentchapter / 5 + 1);
    currentplayer.increaseStarsBy(currentaward);
    try {
      gomovementdie();
    } catch (InvalidStateOperationException e) {
      e.printStackTrace();
    }
  }

  /**
   * movementdie.
   *rolls a die and sets the result as the movement counter
   */
  public void movementdie() {
    setMovementcounter(rolldie());
    try {
      gomovement();
    } catch (InvalidStateOperationException e) {
      e.printStackTrace();
    }
  }

  /**
   * choosehome.
   *makes the player stop at their home panel
   */
  public void choosehome() {
    setMovementcounter(0);
    try {
      golandpanel();
    } catch (InvalidStateOperationException e) {
      e.printStackTrace();
    }
  }



}

