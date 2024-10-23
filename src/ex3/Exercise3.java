package ex3;

import dinosaurs.Dinosaur;

import java.util.List;

public class Exercise3 {
    public static void main(String[] args) {

        List<Dinosaur> dinosaurs = List.of(
                new Dinosaur("Abel", 123),
                new Dinosaur("Austin", 456),
                new Dinosaur("Abimelech", 789),
                new Dinosaur("Abraham", 1011),
                new Dinosaur("Audrey", 987),
                new Dinosaur("Adin", 654)
        );

        int weights = dinosaurs.stream()
                .mapToDouble(Dinosaur::getWeight)
                // converting the list of double weights into a stream of ints
                .mapToInt(weight -> (int) weight)
                .sum();

        System.out.println("Total weights for all dinosaurs: " + weights + " lbs.");
    }
}
