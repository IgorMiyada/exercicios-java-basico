package Part5.Exercise3;

import com.sun.source.doctree.EscapeTree;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Square square = new Square(4);
        GeometricForm circle = new Circle(5);
        GeometricForm rectangle = new Rectangle(10,4);
        System.out.println(square.getArea());
        System.out.println(circle.getArea());
        System.out.println(rectangle.getArea());

        System.out.println("Type the geometric form you want to calculate the area of");
        boolean menu = true;
        while(menu){
            System.out.println("""
                    1 - Square
                    2 - Rectangle 
                    3 - Circle
                    4 - End Application
                    """);
            int option = scanner.nextInt();
            GeometricForm geometricForm ;
            switch(option){
                case 1 :
                    geometricForm =  createSquare();
                    System.out.println(geometricForm.getArea());
                    break;
                case 2 :
                    geometricForm = createRectangle();
                    System.out.println(geometricForm.getArea());
                    break;
                case 3 :
                    geometricForm = createCircle();
                    System.out.println(geometricForm.getArea());
                    break;
                case 4 :
                    menu = false;
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
    }

    private static GeometricForm createSquare(){
        System.out.println("Inform the side size : ");
        double side = scanner.nextDouble();
        return new Square(side);
    }

    private static GeometricForm createRectangle(){
        System.out.println("Inform the height size: ");
        double height = scanner.nextDouble();
        System.out.println("Inform the base size: ");
        double base = scanner.nextDouble();
        return new Rectangle(base,height);
    }

    private static GeometricForm createCircle(){
        System.out.println("Informe the circle radius");
        double radius = scanner.nextDouble();
        return new Circle(radius);
    }
}
