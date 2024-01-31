package de.unistuttgart.iste.sqa.pse.sheet13.homework.settler;

/**
 * Abstract class for creating settlers.
 *
 * @author Marvin Spiegel, Ismail Ratni
 */
public abstract class Settler {

    private final String name;
    private Position position;

    /**
     * Creates a settler.
     */
    public Settler(String name, Position position){
        this.name = name;
        this.position = position;
    }

    /**
     * The Settler settles.
     */
    public void settle() {
        //TODO: implement
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    /**
     * Get the name of the settler.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the position of the settler.
     */
    public Position getPosition() {
        return this.position;
    }

    /**
     * The settler consumes a resource.
     */
    public void consume(Ressource ressource, int amount) {
    }

    /**
     * The settler produces a resource.
     */
    public void produce(Ressource ressource, int amount) {
    }
}
