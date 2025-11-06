package Part4.Employees;

public non-sealed class Atendant extends Employee{
    private double cashBalance;

    public Atendant() {

        super.setAdm(false);
    }

    public void receiveClientPayment(double moneyQuantity){
        this.cashBalance+=moneyQuantity;
    }

    @Override
    public boolean isAdm(){
        return false;
    }

    public double getCashBalance() {
        return cashBalance;
    }
}
