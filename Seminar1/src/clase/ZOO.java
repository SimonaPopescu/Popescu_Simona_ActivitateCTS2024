package clase;

import java.util.HashMap;
import java.util.Map;

public class ZOO {

    private String name;
    private ZooKeeper ZooKeeper;
    private Map<Animal, String> animals;

    public void feedAllAnimals(){
        for (var a: animals.entrySet()) {
            ZooKeeper.feedAnimal(a.getKey(), a.getValue());
        }
    }

    public ZOO(String name, clase.ZooKeeper zooKeeper, Map<Animal, String> animals) {
        this.name = name;
        ZooKeeper = zooKeeper;
        this.animals = animals;
    }

    public void addAnimal(Animal a, String food){
        if(animals == null){
            animals = new HashMap<>();
        }
        animals.put(a, food);
    }
}
