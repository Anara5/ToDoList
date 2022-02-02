import java.util.*;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> deeds = new ArrayList<>(); // array list for deeds

        while (true) {

            // try catch for Exception if we enter wrong input
            try {
                mainMenu();
                String input = scanner.nextLine();
                int operation = Integer.parseInt(input);

                if (operation == 0) {
                    break;
                }

                switch (operation) {

                    case 1:
                        System.out.println("Enter deed to the list:");
                        deeds.add(scanner.nextLine()); // to add a deed in the list
                        System.out.println();
                        break;

                    case 2:
                        System.out.println("The list of deeds:");
                        for (int i = 0; i < deeds.size(); i++) {
                            System.out.println((i + 1) + " " + deeds.get(i)); // to show the list of deeds with their numbers
                        }
                        System.out.println();
                        break;

                    case 3:
                        System.out.println("Enter a number of the deed to be removed");
                        Integer indexInput = Integer.valueOf(scanner.nextLine()); // converts String to Integer

                        // while there is data in the list remove it if it equals the input
                        for (int i = 0; i < deeds.size(); i++) {
                            if (indexInput - 1 == i) {
                                System.out.println("Deed to be removed: " + deeds.remove(i));
                            }
                        }
                        System.out.println();
                        break;

                    default:
                        break;
                }
            }

            catch (Exception e) {
                System.out.println("wrong input");
            }
        }
    }

    private static void mainMenu() {
        System.out.println("1. Add a deed");
        System.out.println("2. Print out the list of deeds");
        System.out.println("3. Remove a deed");
        System.out.println("0. Exit");
    }
}
