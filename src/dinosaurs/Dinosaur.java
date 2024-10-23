package dinosaurs;


public class Dinosaur {
    private double weight;
    private final String name;
    private int health = 100;

    public Dinosaur(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public Dinosaur(String name, double weight, int health) {
        this.name = name;
        this.weight = weight;
        this.health = health;
    }

    public String getName() {
        return this.name;
    }

    public static boolean isIll(Dinosaur dino) {
        return DinosaurHealth.giveHealthStatus(dino.getHealth()) == DinosaurHealth.CRITICAL;
    }

    public int getHealth() {
        return this.health;
    }

    public void changeHealth(int deltaHealth) {
        // Positive or negative
        this.health += deltaHealth;

        if (this.health > 100) {
            this.health = 100;
        } else if (this.health < 0) {
            this.health = 0;
        }

    }

    public double getWeight() {
        return this.weight;
    }

    void setWeight(double weight) {
        this.weight = weight;
    }

}
