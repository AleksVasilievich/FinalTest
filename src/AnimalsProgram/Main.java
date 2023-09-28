package AnimalsProgram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            Dog dog1 = new Dog("Дружок", "2020-09-09");
            Cat cat1 = new Cat("Мурзик", "2019-08-08");
            Donkey donkey1 = new Donkey("Лунтик", "2018-07-07");

            List<Animal> animals = new ArrayList<>();
            animals.add(dog1);
            AnimalCounter.incrementCount();
            animals.add(cat1);
            AnimalCounter.incrementCount();
            animals.add(donkey1);
            AnimalCounter.incrementCount();
            for (Animal animal : animals) {
                System.out.println(animal.getName() + ": " + animal.getBirthDate());
            }
            System.out.println("Общее количество животных: " + AnimalCounter.getCount());
        } catch (Exception e) {e.printStackTrace();}




    }
}
