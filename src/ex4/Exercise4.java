package ex4;

import dinosaurs.Dinosaur;

import java.util.List;
import java.util.Optional;

public class Exercise4 {
    public static void main(String[] args) {
        List<Dinosaur> dinosaurs = List.of(
                new Dinosaur("Peter", 1516),
                new Dinosaur("Poole", 341),
                new Dinosaur("Prince", 405),
                new Dinosaur("Paxton", 569),
                new Dinosaur("Peval", 911),
                new Dinosaur("Porter", 842)
        );

        Optional<Dinosaur> dino = dinosaurs.stream()
                .filter(d -> d.getName() == "Praxton")
//                .limit(1)
                .findFirst();

        dino.ifPresentOrElse(
                d -> System.out.println("WE FOUND PRAXTON!!"),
                () -> System.out.println("Praxton could not be found!"));

    }
}
