package ex5;

import dinosaurs.Dinosaur;

import java.util.List;
import java.util.OptionalDouble;

public class Exercise5 {
    public static void main(String[] args) {
        List<Dinosaur> dinosaurs = List.of(
                new Dinosaur("Jason", 999),
                new Dinosaur("Jones", 1500),
                new Dinosaur("Justin", 212),
                new Dinosaur("Jacob", 333),
                new Dinosaur("Jill", 710.5),
                new Dinosaur("June", 823.5)
        );

        OptionalDouble avg = dinosaurs.stream()
                .mapToDouble(Dinosaur::getWeight)
                .mapToInt(weight -> (int) weight)
                .parallel()
                .average();

        avg.ifPresent(average -> System.out.println("Average weight of dinosaurs: " + average));
    }
}
