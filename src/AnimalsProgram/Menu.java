package AnimalsProgram;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {


//    public static void addAnimal() {
//        try (AnimalCounter animalCounter =new AnimalCounter()){
//            String pathAnimal = "Pet.txt";
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Если животное - dog, cat, hamster -> ввеите 1 ; если - Horse, Camel, Donkey -> 2 ");
//            int line = scanner.nextInt();
//            System.out.println("Ведите кличку, дату рождения, команды");
//            Animal friend = new Animal(scanner.next(), scanner.next(), scanner.next());
//            List<Animal> animals = new ArrayList<>();
//            animals.add(friend);
//
//            if (line == 1) {
//                pathAnimal = "Pet.txt";
//            } else if (line == 2) {
//                pathAnimal = " Draught.txt";
//            } else System.out.println("Введено не верное значение");
//
////            for (Animal animal : animals){
////                System.out.println("Введите команду для животного " + animal.getName());
////                String command = scanner.next();
////                animal.addComand(command);
////            }
//
//
//            try (FileWriter writer = new FileWriter(pathAnimal, true)) {
//                for (Animal animal : animals) {
//                    writer.write(animal.toString());
//                    writer.append('\n');
//                    writer.flush();
//                }
//
//            } catch (IOException ex) {
//                System.out.println(ex.getMessage());
//            }
//            animalCounter.incrementCount();
//            int count = animalCounter.getCount();
//            System.out.println("Количество заведенных животных: " + count);
//        }catch (Exception e){
//            System.out.println("Животное не добавлено !!!");
//        }
//
//
//    }

    public static void showAnimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Если животное - dog, cat, hamster -> ввеите 1 ; если - Horse, Camel, Donkey -> 2 ");
        int line = scanner.nextInt();
        String pathAnimal = "Pet.txt";
        if (line == 1) {
            pathAnimal = "Pet.txt";
        } else if (line == 2) {
            pathAnimal = " Draught.txt";
        } else System.out.println("Введено не верное значение");

        try (FileReader reader = new FileReader(pathAnimal)) {
            BufferedReader bufferedReader = new BufferedReader(reader);
            String liner;
            while ((liner = bufferedReader.readLine()) != null) {
                System.out.println(liner);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

