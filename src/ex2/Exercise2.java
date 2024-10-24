package ex2;

import dinosaurs.Dinosaur;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise2 {
    public static void main(String[] args) {

        List<Dinosaur> dinosaurs = List.of(
                new Dinosaur("Jason", 999),
                new Dinosaur("Jones", 1500),
                new Dinosaur("Justin", 212),
                new Dinosaur("Jacob", 333),
                new Dinosaur("Jill", 710.5),
                new Dinosaur("June", 823.5)
        );

        // can't get feeding time with just a string without an extra data structure
        Map<String, LocalTime> feedtimes = new HashMap<>();

        dinosaurs.stream()
                .peek(dinosaur -> feedtimes.put(dinosaur.getName(), dinosaur.getFeedingTime()))
                .map(Dinosaur::getName)
                .forEach(name -> {
                    System.out.println(name + " will be eating at " + feedtimes.get(name));
                });
    }
}
