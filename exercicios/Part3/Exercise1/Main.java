package Part3.Exercise1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount igorAccount = new BankAccount("Igor",500);
        BankMenu bankMenu = new BankMenu();
        bankMenu.menuOperations(igorAccount);
        sc.close();
    }
}
