<!-- 1.0.3-b1 -->
# 99.7% Citric Liquid

Base code for CC3002's *99.7% Citric Juice* Project.

The project consists in creating a (simplified) clone of the game **100% Orange Juice**
developed by [Orange_Juice](http://daidai.moo.jp) and distributed by 
[Fruitbat Factory](https://fruitbatfactory.com).

Author: Andres Basaez

UNITS:

	AbstractUnit: Abstract class with Variables and methods used by all units
	AbstractUnit subclasses and instances of those subclasses:
		BossUnit:
			StoreManager, ShifuRobot, Flyingcastle
		WildUnit:
			Chicken, RoboBall, Seagull
		Player

Instances of bossunits and wildunits were not included as subclasses because they would be redundant code, but their names and stats are present in unit tests.

Most of Player's original code was utilized in making AbstractUnit.

Wildunits and Bossunits also extend AbstractUnit, they are different classes even though their methods and constructor are mostly the same, because being able to differentiate
them will be useful later on.

Player now extends AbstractUnit and has aditional variables and methods relating to norma levels and checks, objectives and victories.

Objectives are currently a string atribute for Player, and is used in Checking if norma conditions have been reached. It can be set by the player, which will be handled
using by the controller later on.

The conditions for each objective have been coded into the player class, with normacheck being a boolean that returns true when conditions are met for each level.

Combat has not been implemented yet, therefore methods such as defend and dodge have not been coded. a Icanbattle interface might be added later on so units can implement combat methods.
Decks and cards will also be implemented in the future along with more methods related to them.	

PANELS:

All panels have been divided into different subclasses, each representing a type of panel, since they all have unique methods.
The Ipanel interface was created to contain methods common to all panels.
Added methods to add and remove players from panels, and to check which players are currently on them. Players and nextPanels are stored in Hashsets.
Abstractpanel was created to be a template for all panels, it implements the Ipanel interface. It contains all common methods and the panel constructor.
	
	Ipanel
	Abstractpanel
		BonusPanel
		DrawPanel
		DropPanel
		EncounterPanel
		HomePanel
		NeutralPanel


There is no method to check who activated the panel, the controller will apply the effects to the corresponding player when they land on it.

Tests have been implemented to check any new methods and to cover all current classes and their methods.
