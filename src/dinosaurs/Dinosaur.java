package dinosaurs;


import java.time.LocalTime;

public class Dinosaur {
    private final String name;
    private final LocalTime feedingTime = LocalTime.ofSecondOfDay((long) (Math.random() * 86399));
    private double weight;
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

    public static boolean isIll(Dinosaur dino) {
        return DinosaurHealth.giveHealthStatus(dino.getHealth()) == DinosaurHealth.CRITICAL;
    }

    public LocalTime getFeedingTime() {
        return feedingTime;
    }

    public String getName() {
        return this.name;
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
