package Part3.Exercise1;

public class BankAccount {
    private String personName;
    private double balance;
    private double chequeEspecial;
    private boolean checaUsoCheckEspecial = false;

    public BankAccount(String personName, double balance) {
        this.personName = personName;
        if (balance <= 500){
            this.chequeEspecial = 50;
        }else{
            this.chequeEspecial = balance*0.5;
        }
        this.balance = balance+this.chequeEspecial;
    }

    public double checkBalanceAccount(){
        return this.getBalance();
    }

    public double checkChequeEspecial(){
        return this.getChequeEspecial();
    }

    public void depositMoney(double moneyQuantity){
        this.balance += moneyQuantity;
    }

    public void withdraw(double moneyQuantity){
        if(moneyQuantity> this.balance){
            System.out.println("Valor maior disponível que no saldo");
        }else{
            this.balance -= moneyQuantity;
        }
    }

    public void pagarBoleto(double valorBoleto){
        if(valorBoleto > this.balance){
            System.out.println("Não é possível pagar esse boleto");
        }else{
            this.balance -= valorBoleto;
        }
    }

    public void usarCheque(double money){
        if(money > this.chequeEspecial){
            System.out.println("Valor maior que o disponível no cheque");
        }else{
            this.checaUsoCheckEspecial = true;
            this.chequeEspecial -= money;
            this.balance -= money * 0.2;
        }
    }


    public String getPersonName() {
        return personName;
    }

    public double getBalance() {
        return balance;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public boolean isChecaUsoCheckEspecial() {
        return checaUsoCheckEspecial;
    }
}
