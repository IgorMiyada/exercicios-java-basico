package Part3.Exercise3;

import java.util.Scanner;

public class PetMenu {

    public static String menu(){
        return """
                ######################################################
                1 - Shower pet
                2 - Add water to the machine
                3 - Add shampoo to the machine
                4 - Check water level
                5 - Check shampoo level
                6 - Check if there is a pet in the machine
                7 - Put pet to the machine
                8 - Pick up pet of the machine
                9 - Clean machine
                10 - Exit application
                ######################################################
                """;
    }

    public static void menuOperations(Pet pet) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        boolean endMenuUsage = false;
        while (!endMenuUsage) {
            System.out.println(menu());
            System.out.println("Choose one of the options above : ");
            int chosenOption = scanner.nextInt();
            switch (chosenOption) {
                case 1:
                    WashPetMachine.showerPet();
                    break;
                case 2:
                    System.out.println("Enter how many liters of water you want to add");
                    int water = scanner.nextInt();
                    WashPetMachine.addWater(water);
                    break;
                case 3:
                    System.out.println("Enter how many liters of shampoo you want to add");
                    int shampoo = scanner.nextInt();
                    WashPetMachine.addShampoo(shampoo);
                    break;
                case 4:
                    System.out.println("Water level " + WashPetMachine.getWaterLevel());
                    break;
                case 5:
                    System.out.println("Shampoo level " + WashPetMachine.getShampooLevel());
                    break;
                case 6:
                    String checkPet = WashPetMachine.isHasPet() ? "There is a pet in the machine" : "There isn't a pet in the machine";
                    System.out.println(checkPet);
                    break;
                case 7:
                    WashPetMachine.putPetOnMachine();
                    break;
                case 8:
                    WashPetMachine.pickUpPet(pet);
                    break;
                case 9:
                    WashPetMachine.clearMachine();
                    break;
                case 10:
                    endMenuUsage = true;
                    break;
                default:
                    System.out.println("Invalid Option");
            }
            Thread.sleep(1000);
        }
        scanner.close();
    }
}
