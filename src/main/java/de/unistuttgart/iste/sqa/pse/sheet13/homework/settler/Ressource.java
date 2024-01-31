package de.unistuttgart.iste.sqa.pse.sheet13.homework.settler;

public abstract class Ressource {
    private int amount;
    private final ResourceType type;

    public Ressource(int amount, ResourceType type) {
        this.amount = amount;
        this.type = type;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public ResourceType getType() {
        return type;
    }
}
