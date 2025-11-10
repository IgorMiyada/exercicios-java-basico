package Part5.Exercise2;

public class Main {
    public static void main(String[] args) {
        Products apple = new Food("Apple",3.20);
        Products medicine = new HealthyAndWellness("Medicine",100);
        Products jeans = new Vestuario("Jeans",60);
        Products painting = new Culture("Painting",200);
        
        System.out.println("Apple final price : " + calculateFinalPrice(apple));
        System.out.println("Medicine final price : " + calculateFinalPrice(medicine));
        System.out.println("Jeans final price : " + calculateFinalPrice(jeans));
        System.out.println("Painting final price : " + calculateFinalPrice(painting));
    }

    public static double calculateFinalPrice(Products products){
        double finalPrice = 0;
        try{
            switch(products){

                case Culture culture -> {
                    finalPrice = culture.getPrice() + culture.getTaxValue();
                }
                case Food food -> {
                    finalPrice =  food.getPrice() + food.getTaxValue();
                }
                case HealthyAndWellness healthy -> {
                    finalPrice = healthy.getPrice() + healthy.getTaxValue();
                }
                case Vestuario vestuario -> {
                    finalPrice = vestuario.getPrice() + vestuario.getTaxValue();
                }
                default -> throw new IllegalStateException();
            }

        }catch (IllegalArgumentException error){
            System.out.println("Unexpected class. " + error.getMessage());
        }
        return finalPrice;
    }
}
