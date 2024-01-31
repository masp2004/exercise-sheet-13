package de.unistuttgart.iste.sqa.pse.sheet13.homework.settler;

/**
 * Class representing a soldier in the game.
 * Each soldier is a type of settler and has the ability to fight enemies.
 *
 * @author Marvin Spiegel, Ismail Ratni
 */
public class Soldier extends Settler {

    /**
     * Constructor for the Soldier class.
     *
     * @param name The name of the soldier.
     * @param position The initial position of the soldier.
     */
    public Soldier(String name, Position position) {
        super(name, position);
    }

    /**
     * Method for the soldier to fight an enemy settler.
     *
     * @param enemy The enemy settler to be fought.
     */
    public void fightEnemy(Settler enemy) {
        //TODO: implement
    }
}