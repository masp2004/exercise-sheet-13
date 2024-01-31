package de.unistuttgart.iste.sqa.pse.sheet13.homework.settler;

public abstract class Ressource {
    private final int amount;
    private final ResourceType type;

    public Ressource(int amount, ResourceType type) {
        this.amount = amount;
        this.type = type;
    }

    public int getAmount() {
        return amount;
    }

    public ResourceType getType() {
        return type;
    }
}
