package AnimalsProgram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;
        boolean exit = false;
        while (!exit) {
            System.out.println("Меню:");
            System.out.println("1. Показать список животных");
            System.out.println("2. Добавить в список животное , день его рождения и команды ");
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
