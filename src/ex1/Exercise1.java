package ex1;

import dinosaurs.Dinosaur;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise1 {
    public static void main(String[] args) {
        List<Dinosaur> dinosaurs = List.of(
                new Dinosaur("Patrick", 215, 12),
                new Dinosaur("Peter", 300, 81),
                new Dinosaur("Nick", 102, 15),
                new Dinosaur("Kunle", 777, 100),
                new Dinosaur("Jordan", 911, 25),
                new Dinosaur("Patrick", 315, 95)
        );

        List<String> illDinosaurs = dinosaurs.stream()
                .filter(Dinosaur::isIll)
                .map(Dinosaur::getName)
                .collect(Collectors.toList());
//                .toList() // more concise

        illDinosaurs.forEach(System.out::println);

    }
}
