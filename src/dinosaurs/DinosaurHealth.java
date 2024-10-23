package dinosaurs;

public enum DinosaurHealth {
    EXCELLENT,
    GOOD,
    SUBPAR,
    CRITICAL,
    NOT_VALID;

    public static DinosaurHealth giveHealthStatus(int health) {
        if (health >= 75 && health <= 100) {
            return DinosaurHealth.EXCELLENT;
        } else if (health >= 50) {
            return DinosaurHealth.GOOD;
        } else if (health >= 25) {
            return DinosaurHealth.SUBPAR;
        } else if (health >= 0) {
            return DinosaurHealth.CRITICAL;
        } else return DinosaurHealth.NOT_VALID;
    }

}
