package cl.uchile.dcc.citricliquid.model.units.wild;

import cl.uchile.dcc.citricliquid.model.units.AbstractUnit;

public class WildUnit extends AbstractUnit {
    /**
     * Creates a new unit.
     *
     * @param name the unit's name.
     * @param hp   the initial (and max) hit points of the unit.
     * @param atk  the base damage the unit does.
     * @param def  the base defense of the unit.
     * @param evd  the base evasion of the unit.
     */
    public WildUnit(String name, int hp, int atk, int def, int evd) {
        super(name, hp, atk, def, evd);
    }
}
