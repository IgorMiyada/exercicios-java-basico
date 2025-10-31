package Part3.Exercise3;

public class WashPetMachine {
    private static int waterLevel;
    private static  int shampooLevel;
    private static boolean hasPet;
    private static boolean isClean =true;


    public static void addWater(int litersOfWater){
        int water = litersOfWater+waterLevel;
        if(water>30){
            System.out.println("It's permitted only 30 liters of water in the machine");
        }else{
            waterLevel += litersOfWater;
        }
    }

    public static void addShampoo(int litersOfShampoo){
        int shampoo = litersOfShampoo+shampooLevel;
        if(shampoo>10){
            System.out.println("It's permitted only 10 liters of shampoo in the machine");
        }else{
            shampooLevel += litersOfShampoo;
        }
    }

    public static void showerPet(){
        if(!hasPet){
            System.out.println("There is no pet in the machine");
        }else if(waterLevel<10 || shampooLevel<2) {
            System.out.println("Please add more water or shampoo");
        }else{
            waterLevel -= 10;
            shampooLevel -= 2;
        }
    }

    public static void clearMachine(){
        if(isClean){
            System.out.println("The machine is already clean");
        }else if(hasPet){
            System.out.println("There is a pet in the machine");
        } else {
            if(waterLevel<3 || shampooLevel<1){
                System.out.println("Please add more water or shampoo");
            }else{
                waterLevel -= 3;
                shampooLevel -= 1;
                isClean = true;
            }

        }
    }

    public static void putPetOnMachine(){
        if(hasPet){
            System.out.println("There is already a pet on the machine");
        }else if(!isClean){
            System.out.println("It's necessary to clean the machine before putting another pet");
        }else{
            hasPet = true;
        }
    }

    public static void pickUpPet(Pet pet){
        if(!pet.isItClean()){
            isClean = false;
        }
        hasPet =false;
    }


    public static int getWaterLevel() {
        return waterLevel;
    }

    public static int getShampooLevel() {
        return shampooLevel;
    }

    public static boolean isHasPet() {
        return hasPet;
    }
}
