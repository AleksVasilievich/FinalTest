package AnimalsProgram;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    public static void addAnimal() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите кличку, дату рождения, команды");
        Dog dog1 = new Dog(scanner.next(), scanner.next(), scanner.next());
        List<Animal> animals = new ArrayList<>();
        animals.add(dog1);
        AnimalCounter.incrementCount();
        try (FileWriter writer = new FileWriter("BazaAnimal2.txt", true)) {
            for (Animal animal : animals) {
                writer.write(animal.toString());
                writer.append('\n');
                writer.flush();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }


    public static void addCovand() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите кличку, дату рождения, команды");
        Dog dog1 = new Dog(scanner.next(), scanner.next(), scanner.next());
        List<Animal> animals = new ArrayList<>();
        animals.add(dog1);
        AnimalCounter.incrementCount();
        try (FileWriter writer = new FileWriter("BazaAnimal3.txt", true)) {
            for (Animal animal : animals) {
                writer.write(animal.toString());
                writer.append('\n');
                writer.flush();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void showAnimal() {
        try (FileReader reader = new FileReader("BazaAnimal2.txt")) {
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
