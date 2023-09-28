package AnimalsProgram;

import java.util.ArrayList;
import java.util.List;

class Animal {
    private String name;
    private String birthDate;

    public Animal(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return "";
    }
}

class Pet extends Animal{
    public Pet(String name, String birthDate) {
        super(name, birthDate);
    }
}

class Dog extends Pet {
    private List<String> commands;
    public Dog(String name, String birthDate) {
        super(name, birthDate);
        commands = new ArrayList<>();
    }
    public void addCommand(String command) {
        commands.add(command);
    }
    public List<String> getCommands() {
        return commands;
    }
}

class Cat extends Pet {
    private List<String> commands;
    public Cat(String name, String birthDate) {
        super(name, birthDate);
        commands = new ArrayList<>();
    }
    public List<String> getCommands() {
        return commands;
    }
}

class Hamster extends Pet {
    private List<String> commands;
    public Hamster(String name, String birthDate) {
        super(name, birthDate);
        commands = new ArrayList<>();
    }
    public void addCommand(String command) {
        commands.add(command);
    }
    public List<String> getCommands() {
        return commands;
    }
}

class DraughtAnimal extends Animal {
    public DraughtAnimal(String name, String birthDate) {
        super(name, birthDate);
    }
}

class Horse extends DraughtAnimal {
    private List<String> commands;
    public Horse(String name, String birthDate) {
        super(name, birthDate);
        commands = new ArrayList<>();
    }
    public void addCommand(String command) {
        commands.add(command);
    }
    public List<String> getCommands() {
        return commands;
    }
}

class Camel extends DraughtAnimal {
    private List<String> commands;
    public Camel(String name, String birthDate) {
        super(name, birthDate);
        commands = new ArrayList<>();
    }
    public void addCommand(String command) {
        commands.add(command);
    }
    public List<String> getCommands() {
        return commands;
    }
}

class Donkey extends DraughtAnimal {
    private List<String> commands;
    public Donkey(String name, String birthDate) {
        super(name, birthDate);
        commands = new ArrayList<>();
    }
    public void addCommand(String command) {
        commands.add(command);
    }
    public List<String> getCommands() {
        return commands;
    }
}
class AnimalCounter implements AutoCloseable {
    private static int count = 0;

    public static void incrementCount() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void close() throws Exception {
        count--;
        if (count < 0) {
            throw new IllegalStateException("Ресурс не закрыт !!!");
        }
    }
}
