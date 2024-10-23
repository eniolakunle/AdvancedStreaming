package ex1;

import dinosaurs.Dinosaur;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise1 {
    public static void main(String[] args) {
        List<Dinosaur> dinosaurs = List.of(
                new Dinosaur("Patrick", 215, 12),
                new Dinosaur("Peter", 215, 81),
                new Dinosaur("Nick", 215, 15),
                new Dinosaur("Kunle", 215, 100),
                new Dinosaur("Jordan", 215, 25),
                new Dinosaur("Patrick", 215, 95)
        );

        List<String> illDinosaurs = dinosaurs.stream()
                .filter(Dinosaur::isIll)
                .map(Dinosaur::getName)
                .collect(Collectors.toList());
//                .toList() // more concise

        illDinosaurs.forEach(System.out::println);

    }
}
