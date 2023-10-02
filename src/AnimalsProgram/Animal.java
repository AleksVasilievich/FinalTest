package AnimalsProgram;

import java.util.ArrayList;
import java.util.List;

class Animal {
    private String name;
    private List<String> commands;

    public Animal(String name) {
        this.name = name;
        this.commands = new ArrayList<>();
    }

    public void addComand(String command){
        commands.add(command);
    }
    public List<String> getCommands(){
        return commands;
    }

    public void  showCommands(){
        if (commands.isEmpty()){
            System.out.println("Это животное не знает ни одной команды");
        } else {
            System.out.println("Список команд для " + name + ":");
            for (String command : commands) {
                System.out.println("- " + command);
            }
        }
    }

    public void addCommand(String command) {
        System.out.println("Животное " + name + " получает новую команду: " + command);
        commands.add(command);
    }

}

class Pet extends Animal{
    public Pet(String name) {
        super(name);
    }
}

class Dog extends Pet {
    public Dog(String name) {
        super(name);
    }
}

class Cat extends Pet {
    public Cat(String name) {
        super(name);
    }
}

class Hamster extends Pet {
    public Hamster(String name) {
        super(name);
    }
}

class DraughtAnimal extends Animal {
    public DraughtAnimal(String name) {
        super(name);
    }
}

class Horse extends DraughtAnimal {
    public Horse(String name) {
        super(name);
    }
}

class Camel extends DraughtAnimal {
    public Camel(String name) {
        super(name);
    }
}

class Donkey extends DraughtAnimal {
    public Donkey(String name) {
        super(name);
    }
}
class AnimalCounter implements AutoCloseable {
    private int count;
    public AnimalCounter(){
        this.count = 0;
    }

    public void incrementCount() {
        count++;
    }

    public int getCount() {
        return count;
    }

    @Override
    public void close() throws Exception {
        count --;
        if (count < 0) {
            throw new Exception("Ресурс не закрыт !!!");
        }
    }
}
