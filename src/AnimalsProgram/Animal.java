package AnimalsProgram;

class Animal {
    private String name;
    private String birthDate;
    private String commands;


    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }
    public Animal(String name,String birthDate, String commands){
        this.name = name;
        this.birthDate = birthDate;
        this.commands = commands;
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
        return name + "; " + birthDate + "; " + commands;

    }

}

class Pet extends Animal{
    public Pet(String name) {
        super(name);
    }

    public Pet(String name, String birthDate) {
        super(name, birthDate);
    }

    public Pet(String name, String birthDate, String commands) {
        super(name, birthDate, commands);
    }
}

class Dog extends Pet {
    public String dogList;

    public Dog(String dogList){
        super(dogList);
    }

    public Dog(String name, String birthDate) {
        super(name, birthDate);
    }

    public Dog(String name, String birthDate, String commands) {
        super(name, birthDate, commands);
    }
}

class Cat extends Pet {

    public Cat(String name, String birthDate) {
        super(name, birthDate);
    }

    public Cat(String name, String birthDate, String commands) {
        super(name, birthDate, commands);
    }
}

class Hamster extends Pet {
    public Hamster(String name, String birthDate) {
        super(name, birthDate);
    }

    public Hamster(String name, String birthDate, String commands) {
        super(name, birthDate, commands);
    }
}

class DraughtAnimal extends Animal {
    public DraughtAnimal(String name, String birthDate) {
        super(name, birthDate);
    }

    public DraughtAnimal(String name, String birthDate, String commands) {
        super(name, birthDate, commands);
    }
}

class Horse extends DraughtAnimal {
    public Horse(String name, String birthDate) {
        super(name, birthDate);
    }

    public Horse(String name, String birthDate, String commands) {
        super(name, birthDate, commands);
    }
}

class Camel extends DraughtAnimal {
    public Camel(String name, String birthDate) {
        super(name, birthDate);
    }

    public Camel(String name, String birthDate, String commands) {
        super(name, birthDate, commands);
    }
}

class Donkey extends DraughtAnimal {
    public Donkey(String name, String birthDate) {
        super(name, birthDate);
    }

    public Donkey(String name, String birthDate, String commands) {
        super(name, birthDate, commands);
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
