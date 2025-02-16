package com.nemirovsky.dronedispatcher;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

@SpringBootApplication
public class DroneDispatcherApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DroneDispatcherApplication.class, args);
    }

    Function<Integer, String> intToString = new Function<>() {
        @Override
        public String apply(Integer from) {
            return from.toString();
        }
    };

    Function<Integer, String> intToString1 = from -> from.toString();

    Function<Integer, String> intToString2 = Object::toString;

    Function<String, String> addText = new Function<>() {
        @Override
        public String apply(String from) {
            return "Мы получили " + from;
        }
    };

    Function<Integer, String> allActions = intToString.andThen(addText);

    @Override
    public void run(String... args) {
        System.out.println(allActions.apply(777));
        List<String> list = Arrays.asList("Buenos Aires", "Córdoba", "La Plata");
        System.out.println(list.stream().map(addText).toList());
        System.out.println(list.stream().map(s -> "Мы получили " + s).toList());

        //-----------


    }

}
