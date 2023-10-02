package AnimalsProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        boolean exit = false;
        Map<String, Animal> animals = new HashMap<>();
        while (!exit) {
            System.out.println("Меню:");
            System.out.println("1. Завести новое животное");
            System.out.println("2. Определить животное в правильный клосс");
            System.out.println("3. Просмотр списка команд, которое умеет выполнять животное");
            System.out.println("4. Обучить животное новым командам");
            System.out.println("0. Выйти");

            System.out.print("Выберите действие: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Введите имя животного : ");
                    String animalName = scanner.next();
                    System.out.println("Выберите тип животного (1 - Собака, 2 - Кот, 3 - Хомяк, 4 - Лошадь, 5 - Верблюд, 6 - Осел): ");
                    int animalType = scanner.nextInt();

                    Animal newAnimal;
                    switch (animalType) {
                        case 1:
                            newAnimal = new Dog(animalName);
                            break;
                        case 2:
                            newAnimal = new Cat(animalName);
                            break;
                        case 3:
                            newAnimal = new Hamster(animalName);
                            break;
                        case 4:
                            newAnimal = new Horse(animalName);
                            break;
                        case 5:
                            newAnimal = new Camel(animalName);
                            break;
                        case 6:
                            newAnimal = new Donkey(animalName);
                            break;
                        default:
                            System.out.println("Неверный тип животного. Животное будет создано как общий Animal.");
                            newAnimal =  new Animal(animalName);
                    }
                    try (AnimalCounter counter = new AnimalCounter()) {
                        animals.put(animalName, newAnimal);
                        counter.incrementCount();
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    System.out.println("Животное " + animalName + " успешно добавлено.");
                    break;

                case 2:
                    System.out.println("Введите имя животного : ");
                    String whichAnimal = scanner.next();
                    System.out.println("Введите класс животного (Pat, DraughtAnimal): ");
                    String animalClass = scanner.next();

                    Animal classifiedAnimal = animals.get(whichAnimal);
                    if (classifiedAnimal != null) {
                        if (animalClass.equals("Pat")) {
                            if (classifiedAnimal instanceof Pet) {
                                System.out.println("Животное  " + whichAnimal +  " уже определено как домашнее животное.");
                                break;
                            }
                            DraughtAnimal draughtAnimal = new DraughtAnimal(whichAnimal);
                            draughtAnimal.getCommands().addAll(classifiedAnimal.getCommands());
                            classifiedAnimal = draughtAnimal;
                        } else  {
                            System.out.println("Неверны класс животного.");
                            break;
                        }

                        animals.put(whichAnimal, classifiedAnimal);
                        System.out.println("Животное " + whichAnimal + " успешно определено в класс " + animalClass + ".");
                    } else {
                        System.out.println("Животное " +  whichAnimal + " не найдено.");
                    }
                    break;
                case 3:
                    System.out.println("Введите имя животного : ");
                    String animalToCheck = scanner.next();

                    Animal animalWithCommands = animals.get(animalToCheck);
                    if (animalWithCommands != null) {
                        animalWithCommands.showCommands();
                    } else {
                        System.out.println("Животное " + animalToCheck + " не найдено.");
                    }
                    break;
                case 4:
                    System.out.println("Введите имя животного : ");
                    String animalToTrain = scanner.next();
                    System.out.println("Введите новую команду : ");
                    String newCommand = scanner.next();

                    Animal animalTrained = animals.get(animalToTrain);
                    if (animalTrained != null){
                        animalTrained.addCommand(newCommand);
                    }
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
