package Part4.Employees;

public non-sealed class Salesman extends Employee {
    private int salesQuantity;

    public Salesman() {

        super.setAdm(false);
    }

    public void makeASale(int salesQuantity){
        this.salesQuantity += salesQuantity;
        System.out.println("Sale registered successfully");
    }

    @Override
    public boolean isAdm(){
        return false;
    }

    public int getSalesQuantity() {
        return salesQuantity;
    }
}
