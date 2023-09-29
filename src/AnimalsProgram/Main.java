package AnimalsProgram;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            Dog dog1 = new Dog("Дружок", "2020-09-09");
            dog1.addCommand("Сидеть");
            Cat cat1 = new Cat("Мурзик", "2019-08-08");
            cat1.addCommand("Прижок");
            Donkey donkey1 = new Donkey("Лунтик", "2018-07-07");
            donkey1.addCommand("Стоять");

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

            System.out.println("Список животных:");
            for (Animal animal : animals) {
                System.out.println("- " + animal.getName());
            }
            System.out.println();
            for (Animal animal : animals) {
                System.out.println("Животное: " + animal.getName());
                System.out.println("Команды:");
                for (String command : animal.getCommands()) {
                    System.out.println("- " + command);
                }
                System.out.println();
            }

        } catch (Exception e) {e.printStackTrace();}

    }
}
