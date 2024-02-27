package main;

import clase.*;

import java.util.HashMap;


public class Main {

    public enum TipHranire {
        OMNIVOR,
        HERBIVOR,
        CARNIVORE
    }

    public static void main(String[] args) {

        ZooKeeper zooKeeper = new ZooKeeper("Ion");
        ZOO zoo =  new ZOO("ZOO", zooKeeper, new HashMap<>());

        Animal anotherAnimal = new Zebra("Zebra1", 10);

        zoo.addAnimal(anotherAnimal, "grass");
        zoo.addAnimal(new Lion("Simba", 8), "meat");
        zoo.addAnimal(new Cat("Pisi", 3), "mancare de pisici");

        zoo.feedAllAnimals();
    }
}