package Part3.Exercise1;

import java.util.Scanner;

public class BankMenu {

    @Override
    public String toString() {
        return """
                ######################################################
                1 - Balance Check
                2 - Consultar cheque especial
                3 - Usar cheque especial
                4 - Deposit money
                5 - Money Withdraw
                6 - Pagar um boleto
                7 - Verificar se a conta está usando cheque especial
                8 - Sair
                ######################################################
                """;
    }

    public void menuOperations(BankAccount bankAccount){
        Scanner scanner = new Scanner(System.in);
        boolean endMenuUsage = false;
        while(!endMenuUsage){
            System.out.println(this);
            System.out.println("Choose one of the options above : ");
            int chosenOption = scanner.nextInt();
            switch (chosenOption){
                case 1 :
                    System.out.println(bankAccount.getBalance());
                    break;
                case 2 :
                    System.out.println(bankAccount.getChequeEspecial());
                    break;
                case 3 :
                    System.out.println("Digite o valor a ser usado do cheque : ");
                    double valorASerUsadoDoCheque = scanner.nextDouble();
                    bankAccount.usarCheque(valorASerUsadoDoCheque);
                    break;
                case 4 :
                    System.out.println("Enter the amount to be deposited : ");
                    double amountDeposit = scanner.nextDouble();
                    bankAccount.depositMoney(amountDeposit);
                    break;
                case 5 :
                    System.out.println("Enter the amount you want to  withdraw : ");
                    double amountWithdraw = scanner.nextDouble();
                    bankAccount.withdraw(amountWithdraw);
                    break;
                case 6 :
                    System.out.println("Digite o valor do boleto a ser pago : ");
                    double valorBoleto = scanner.nextDouble();
                    bankAccount.pagarBoleto(valorBoleto);
                    break;
                case 7 :
                    if(bankAccount.isChecaUsoCheckEspecial()){
                        System.out.println("O cheque está sendo usado");
                    }else{
                        System.out.println("Cheque está fora de uso");
                    }
                    break;
                case 8 :
                    endMenuUsage = true;
                    break;
                default :
                    System.out.println("Opção fora do escopo");
            }
        }

        scanner.close();
    }
}
