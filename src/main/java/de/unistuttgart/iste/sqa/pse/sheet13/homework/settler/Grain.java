package de.unistuttgart.iste.sqa.pse.sheet13.homework.settler;

/**
 * Class representing Grain, a type of resource in the game.
 * Grain is a subclass of the Resource class.
 *
 * @author Marvin Spiegel, Ismail Ratni
 */
public class Grain extends Ressource {

    /**
     * Constructor for the Grain class.
     *
     * @param amount The initial amount of the grain resource.
     * @param type The type of the resource, should be ResourceType.GRAIN.
     */
    public Grain(int amount, ResourceType type) {
        super(amount, type);
    }
}