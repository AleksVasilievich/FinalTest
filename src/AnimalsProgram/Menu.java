package AnimalsProgram;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
//    public static void addAnimal() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Ведите кличку, дату рождения");
//        Dog dog1 = new Dog(scanner.next(), scanner.next());
//        List<Animal> animals = new ArrayList<>();
//        animals.add(dog1);
//
//        AnimalCounter.incrementCount();
//        try (FileWriter writer = new FileWriter("BazaAnimal.txt", true)){
//            writer.write(animals.toString());
//            writer.append('\n');
//            writer.flush();
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        }
//
//    }
//
//    public static void showAnimal() {
//        List<Animal> animals = new ArrayList<>();
//        for (Animal animal : animals) {
//            System.out.println(animal.getName() + ": " + animal.getBirthDate());
//        }
//        System.out.println("Общее количество животных: " + AnimalCounter.getCount());
//    }
//
//    public static void infoAnimal() {
//        System.out.println("Система реестра домашних животных");
//
//    }
}

//    Scanner scanner = new Scanner(System.in);
//            int choice;
//            boolean exit = false;
//
//            while (!exit) {
//                System.out.println("Меню:");
//                System.out.println("1. Показать");
//                System.out.println("2. Добавить");
//                System.out.println("3. Удалить");
//                System.out.println("0. Выйти");
//
//                System.out.print("Выберите действие: ");
//                choice = scanner.nextInt();
//                switch (choice) {
//                    case 1:
//                        System.out.println();
//                        Menu.showAnimal();
//                        break;
//                    case 2:
//                        System.out.println();
//                        Menu.addAnimal();
//                        break;
//                    case 3:
//                        System.out.println();
//                        break;
//                    case 4:
//                        System.out.println();
//                        break;
//                    case 0:
//                        System.out.println("Программа завершена.");
//                        exit = true;
//                        break;
//                    default:
//                        System.out.println("Неверный выбор. Попробуйте снова.");
//                }
//                System.out.println();
//            }
//            scanner.close();
