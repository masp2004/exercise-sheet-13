package de.unistuttgart.iste.sqa.pse.sheet13.homework.settler;

/**
 * Abstract class representing a resource in the game.
 * Each resource has an amount and a type.
 */
public abstract class Ressource {
    private int amount;
    private final ResourceType type;

    /**
     * Constructor for the Ressource class.
     *
     * @param amount The initial amount of the resource.
     * @param type The type of the resource.
     */
    public Ressource(int amount, ResourceType type) {
        this.amount = amount;
        this.type = type;
    }

    /**
     * Sets the amount of the resource.
     *
     * @param amount The new amount of the resource.
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * Returns the current amount of the resource.
     *
     * @return The current amount of the resource.
     */
    public int getAmount() {
        return amount;
    }

    /**
     * Returns the type of the resource.
     *
     * @return The type of the resource.
     */
    public ResourceType getType() {
        return type;
    }
}