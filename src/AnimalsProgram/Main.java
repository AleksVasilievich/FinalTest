package AnimalsProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
//    public static void main(String[] args) {
//
//       try {
//
//            Dog dog1 = new Dog("Дружок", "2020-09-09");
//            dog1.addCommand("Сидеть");
//            Cat cat1 = new Cat("Мурзик", "2019-08-08");
//            cat1.addCommand("Прижок");
//            Donkey donkey1 = new Donkey("Лунтик", "2018-07-07");
//            donkey1.addCommand("Стоять");
//
//            List<Animal> animals = new ArrayList<>();
//            animals.add(dog1);
//            AnimalCounter.incrementCount();
//            animals.add(cat1);
//            AnimalCounter.incrementCount();
//            animals.add(donkey1);
//            AnimalCounter.incrementCount();
//
//
//
//            for (Animal animal : animals) {
//                System.out.println(animal.getName() + ": " + animal.getBirthDate());
//            }
//            System.out.println("Общее количество животных: " + AnimalCounter.getCount());
//
//            System.out.println("Список животных:");
//            for (Animal animal : animals) {
//                System.out.println("- " + animal.getName());
//            }
//            System.out.println();
//            for (Animal animal : animals) {
//                System.out.println("Животное: " + animal.getName());
//                System.out.println("Команды:");
//                for (String command : animal.getCommands()) {
//                    System.out.println("- " + command);
//                }
//                System.out.println();
//            }
//
//        } catch (Exception e) {e.printStackTrace();}
//
//    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        boolean exit = false;
        while (!exit) {
            System.out.println("Меню:");
            System.out.println("1. Показать список животных");
            System.out.println("2. Добавить в список животное и день его рождения");
            System.out.println("3. Показать список команд животного");
            System.out.println("0. Выйти");

            System.out.print("Выберите действие: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println();
                    Menu.showAnimal();
                    break;
                case 2:
                    System.out.println();
                    Menu.addAnimal();
                    break;
                case 3:
                    System.out.println();
                    break;
                case 4:
                    System.out.println();
                    break;
                case 0:
                    System.out.println("Программа завершена.");
                    exit = true;
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
            System.out.println();
        }
        scanner.close();
    }
}
