package Part4.Employees;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Manager fabricio = new Manager();
        Salesman frank = new Salesman();
        Atendant alberto = new Atendant();

        recordEmployee(fabricio);
        recordEmployee(frank);
        recordEmployee(alberto);

        frank.login();
        frank.makeASale(11);
        frank.logoff();

        alberto.login();
        alberto.receiveClientPayment(8542);
        alberto.logoff();

        fabricio.login();
        fabricio.printFinancialReport(frank);
        fabricio.printFinancialReport(alberto);
        fabricio.logoff();
    }

    public static void recordEmployee(Employee employee){
        Scanner sc = new Scanner(System.in);
        System.out.println("Type your email : ");
        String email = sc.nextLine();
        System.out.println("Create your login : ");
        String login = sc.nextLine();
        System.out.println("Create your password : ");
        String password = sc.nextLine();
        System.out.println("Confirm your password : ");
        String confirmedPassword = sc.nextLine();
        while(!employee.setPassword(password,confirmedPassword)){
            System.out.println("Create your password : ");
            password = sc.nextLine();
            System.out.println("Confirm your password : ");
            confirmedPassword = sc.nextLine();
        }

        switch(employee){
            case Manager manager -> {
                manager.setLogin(login);
                manager.setPassword(password,confirmedPassword);
                manager.setEmail(email);
            }
            case Salesman salesman -> {
                salesman.setLogin(login);
                salesman.setPassword(password,confirmedPassword);
                salesman.setEmail(email);
            }
            case Atendant atendant -> {
                atendant.setLogin(login);
                atendant.setPassword(password,confirmedPassword);
                atendant.setEmail(email);
            }
        }
    }


}
