package AnimalsProgram;

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
}

