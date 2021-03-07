
package com.stones;

        /*import com.stones.repositories.interfaces.IUserRepository;*/

        import java.util.Scanner;

public class MyAPP {
    /*private final Necklace necklace;

    public MyApplication(IUserRepository userRepository) {
        controller = new UserController(userRepository);
        scanner = new Scanner(System.in);
    }*/
    private Scanner scanner;

    public MyAPP(){

    }

    public MyAPP(Scanner scanner) {
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println();
            System.out.println("Welcome to DiamondShop");
            System.out.println("There you can choose stones for your necklace!");
            System.out.println("Do you want it?");
            System.out.println("1. Yes");
            System.out.println("2. Exit");
            System.out.println();
            try {

                System.out.print("Enter option (1-2): ");
                int option = scanner.nextInt();
                if (option == 1) {/*-----------------------*/
                    while (true){
                    System.out.println("Which of these stones?");
                    System.out.println("Ruby");
                    System.out.println("Emerald");
                    System.out.println("Amethyst");
                    System.out.println("Diamond");
                    System.out.println("Sapphire ");
                    System.out.println("Topaz");
                    System.out.println("Pearl");
                    System.out.println("Enter the name of the stone: ");
                    System.out.println();
                    String nameOfStone = scanner.next();
                        switch (nameOfStone) {
                            case "Ruby":
                                System.out.println("You choose Ruby");
                                break;
                            case "Emerald":
                                System.out.println("You choose Emerald");
                                break;
                            case "Amethyst":
                                System.out.println("You choose Amethyst");
                                break;
                            case "Diamond":
                                System.out.println("You choose Diamond");
                                break;
                            case "Topaz":
                                System.out.println("You choose Topaz");
                                break;
                            case "Sapphire":
                                System.out.println("You choose Sapphire");
                                break;
                            case "Pearl":
                                System.out.println("You choose Pearl");
                                break;
                        }
                    System.out.println("Do you want to choose other one?");
                    System.out.println("1. Yes");
                    System.out.println("2. Exit");
                    System.out.println();
                        int option2 = scanner.nextInt();
                        if (option2 == 1){
                            System.out.println();
                        }else break;
                }
                } else if (option == 2) {/*---------------*/
                    break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                scanner.next(); // to ignore incorrect input
            }

            System.out.println("*************************");

        }
    }
/*
    public void getAllUsersMenu() {
        String response = controller.getAllUsers();
        System.out.println(response);
    }

    public void getUserByIdMenu() {
        System.out.println("Please enter id");

        int id = scanner.nextInt();
        String response = controller.getUser(id);
        System.out.println(response);
    }

    public void createUserMenu() {
        System.out.println("Please enter name");
        String name = scanner.next();
        System.out.println("Please enter surname");
        String surname = scanner.next();
        System.out.println("Please enter gender (male/female)");
        String gender = scanner.next();

        String response = controller.createUser(name, surname, gender);
        System.out.println(response);
    }*/
}